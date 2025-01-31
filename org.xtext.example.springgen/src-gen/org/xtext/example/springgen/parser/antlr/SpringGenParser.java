/*
 * generated by Xtext 2.37.0
 */
package org.xtext.example.springgen.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.springgen.parser.antlr.internal.InternalSpringGenParser;
import org.xtext.example.springgen.services.SpringGenGrammarAccess;

public class SpringGenParser extends AbstractAntlrParser {

	@Inject
	private SpringGenGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalSpringGenParser createParser(XtextTokenStream stream) {
		return new InternalSpringGenParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "SpringBootProject";
	}

	public SpringGenGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SpringGenGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
