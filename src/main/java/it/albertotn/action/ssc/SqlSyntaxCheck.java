package it.albertotn.action.ssc;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;

public class SqlSyntaxCheck {

	public void parse(String sql) throws JSQLParserException {
		CCJSqlParserUtil.parseStatements(sql);
	}

}
