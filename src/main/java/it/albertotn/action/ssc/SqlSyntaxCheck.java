package it.albertotn.action.ssc;

import it.albertotn.action.ssc.exception.SyntaxException;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;

public class SqlSyntaxCheck {

	public void parse(String sql) throws SyntaxException {
		try {
			CCJSqlParserUtil.parseStatements(sql);
		} catch (JSQLParserException e) {
			throw new SyntaxException(e);
		}
	}


}
