package org.lesscss.mojo;

import org.apache.maven.plugin.PluginParameterExpressionEvaluator;
import org.apache.maven.plugin.logging.Log;
import org.codehaus.plexus.component.configurator.expression.ExpressionEvaluationException;
import org.lesscss.ExpressionEvaluator;

public class MavenExpressionEvaluator implements ExpressionEvaluator {
	private PluginParameterExpressionEvaluator evaluator = null;
	private Log log;

	public MavenExpressionEvaluator(PluginParameterExpressionEvaluator evaluator, Log log) {
		if(evaluator == null) {
			throw new IllegalArgumentException("Evaluator is null");
		}
		if(log == null) {
			throw new IllegalArgumentException("Log is null");
		}
		this.evaluator = evaluator;
		this.log = log;
	}

	public String evaluate(String stringToEvaluate) {
		String result = null;
		try {
			result = String.valueOf(evaluator.evaluate(stringToEvaluate));
		} catch (ExpressionEvaluationException e) {
			log.error(String.format("Can't evaluate string: %s\nLeave import string as it is.",
					stringToEvaluate), e);
			result = stringToEvaluate;
		}
		return result;
	}

}
