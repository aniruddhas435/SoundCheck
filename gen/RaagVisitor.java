// Generated from C:/Users/Aniruddha Sarkar/IdeaProjects/SoundCheck/src/main/resources\Raag.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RaagParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RaagVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RaagParser#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(RaagParser.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(RaagParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule(RaagParser.RuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#derivation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivation(RaagParser.DerivationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(RaagParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(RaagParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(RaagParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(RaagParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemeCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeCall(RaagParser.SchemeCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemeNameCalled}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeNameCalled(RaagParser.SchemeNameCalledContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(RaagParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#probability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProbability(RaagParser.ProbabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeBlock(RaagParser.SchemeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#octave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctave(RaagParser.OctaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#octaveOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOctaveOption(RaagParser.OctaveOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#ascent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscent(RaagParser.AscentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#descent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescent(RaagParser.DescentContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#arohan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArohan(RaagParser.ArohanContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#avarohan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAvarohan(RaagParser.AvarohanContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemes(RaagParser.SchemesContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScheme(RaagParser.SchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeName(RaagParser.SchemeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemeDerivation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeDerivation(RaagParser.SchemeDerivationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeExpression(RaagParser.SchemeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemeProbability}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeProbability(RaagParser.SchemeProbabilityContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#schemeOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemeOption(RaagParser.SchemeOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#combinatorScheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinatorScheme(RaagParser.CombinatorSchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#simpleScheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleScheme(RaagParser.SimpleSchemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link RaagParser#swar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwar(RaagParser.SwarContext ctx);
}