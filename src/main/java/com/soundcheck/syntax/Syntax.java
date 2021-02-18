package com.soundcheck.syntax;

import com.soundcheck.processor.Distribution;
import com.soundcheck.processor.Parser;
import java.util.List;
import java.util.Map;

public class Syntax {
    private List<String> ascent;
    private List<String> descent;
    private Map<String, Distribution> derivations;
    private Map<String, Distribution> schemes;
    private String start;

    public List<String> getAscent() {
        return ascent;
    }

    public void setAscent(List<String> ascent) {
        this.ascent = ascent;
    }

    public List<String> getDescent() {
        return descent;
    }

    public void setDescent(List<String> descent) {
        this.descent = descent;
    }

    public Map<String, Distribution> getDerivations() {
        return derivations;
    }

    public void setDerivations(Map<String, Distribution> derivations) {
        this.derivations = derivations;
    }

    public Map<String, Distribution> getSchemes() {
        return schemes;
    }

    public void setSchemes(Map<String, Distribution> schemes) {
        this.schemes = schemes;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    @Override
    public String toString() {
        String res = "";

        if(schemes != null) {
            res += "palta {\n" +
                    "\tsargam {\n" +
                    "\t\tarohan: ";

            String ascentStr = ascent.toString();
            ascentStr = ascentStr.substring(1, ascentStr.length() - 1);

            res += ascentStr + ";\n\t\tavarohan: ";

            String descentStr = descent.toString();
            descentStr = descentStr.substring(1,  descentStr.length() - 1);

            res += descentStr + ";\n\t}\n";

            for(Map.Entry<String, Distribution> entry: schemes.entrySet()) {
                res += "\t" + entry.getKey() + " -> " + entry.getValue().toString() + ";\n";
            }

            res += "}\n";
        }

        res += Parser.getStringForSyntax(derivations, start);

        return res;
    }
}