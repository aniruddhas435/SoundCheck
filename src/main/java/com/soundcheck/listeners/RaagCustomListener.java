package com.soundcheck.listeners;

import com.soundcheck.processor.Distribution;
import org.antlr.v4.runtime.Token;
import com.soundcheck.generated.RaagBaseListener;
import com.soundcheck.generated.RaagParser;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class RaagCustomListener extends RaagBaseListener {
    private Map<String, Distribution> derivations;
    private Map<String, Distribution> schemes;
    private List<String> ascent = new ArrayList<>();
    private List<String> descent;

    private String currVariable;
    private String currExpression;
    private double currProbability;
    private String currScheme;
    private String currSchemeName;
    private String currOption;

    public Map<String, Distribution> getDerivations() {
        return derivations;
    }

    public Map<String, Distribution> getSchemes() {
        return schemes;
    }

    public List<String> getAscent() {
        return ascent;
    }

    public List<String> getDescent() {
        return descent;
    }

    @Override
    public void enterSyntax(RaagParser.SyntaxContext ctx) {
        derivations = new HashMap<String, Distribution>();
    }

    @Override
    public void exitVariable(RaagParser.VariableContext ctx) {
        currVariable = ctx.getText();
    }

    @Override
    public void enterDerivation(RaagParser.DerivationContext ctx) {
        derivations.put(currVariable, new Distribution());
    }

    @Override
    public void enterExpression(RaagParser.ExpressionContext ctx) {
        currExpression = "";
    }

    @Override
    public void enterOption(RaagParser.OptionContext ctx) {
        currOption = null;
    }

    @Override
    public void exitOption(RaagParser.OptionContext ctx) {
        currOption = currOption == null ? ctx.getText() : currOption;
        currExpression += currOption + "-";
    }

    @Override
    public void exitProbability(RaagParser.ProbabilityContext ctx) {
        currProbability = Double.parseDouble(ctx.getText());
    }

    @Override
    public void exitExpression(RaagParser.ExpressionContext ctx) {
        currExpression = currExpression.substring(0, currExpression.length() - 1);
        derivations.get(currVariable).add(currExpression, currProbability);
    }

    @Override
    public void enterSchemes(RaagParser.SchemesContext ctx) {
        schemes = new HashMap<>();
    }

    @Override
    public void exitArohan(RaagParser.ArohanContext ctx) {
        String[] notes = ctx.getText().split(",");
        ascent = Arrays.asList(notes);
    }

    @Override
    public void exitAvarohan(RaagParser.AvarohanContext ctx) {
        String[] notes = ctx.getText().split(",");
        descent = Arrays.asList(notes);
    }

    @Override
    public void exitOctave(RaagParser.OctaveContext ctx) {
        if(descent == null) {
            descent = new ArrayList<>(ascent);
            Collections.reverse(descent);
            Collections.rotate(descent, 1);
        }
    }

    @Override
    public void exitSchemeName(RaagParser.SchemeNameContext ctx) {
        currSchemeName = ctx.getText();
        schemes.put(currSchemeName, new Distribution<>());
    }

    @Override
    public void exitSchemeProbability(RaagParser.SchemeProbabilityContext ctx) {
        currProbability = Double.parseDouble(ctx.getText());
    }

    @Override
    public void exitSchemeExpression(RaagParser.SchemeExpressionContext ctx) {
        schemes.get(currSchemeName).add(currScheme, currProbability);
    }

    @Override
    public void exitCombinatorScheme(RaagParser.CombinatorSchemeContext ctx) {
        currScheme = ctx.getText();
    }

    @Override
    public void exitSimpleScheme(RaagParser.SimpleSchemeContext ctx) {
        currScheme = ctx.getText();
    }

    @Override
    public void exitSchemeNameCalled(RaagParser.SchemeNameCalledContext ctx) {
        String schemeNameCalled = ctx.getText();
        if(!schemes.containsKey(schemeNameCalled)) {
            Token token = ctx.getStart();
            int line = token.getLine();
            int charPos = token.getCharPositionInLine();
            String msg = "palta "  + schemeNameCalled + " is referenced before declaration";

            System.err.println("line " + line + ":" + charPos + " " + msg);
            System.exit(-1);
        }
    }

    @Override
    public void exitSchemeCall(RaagParser.SchemeCallContext ctx) {
        String[] parts = ctx.getText().split("\\(");
        String schemeNameCalled = parts[0];
        String swar = parts[1].substring(0, parts[1].length() - 1);

        currOption = schemeNameCalled + "(" + swar + ")";
    }
}
