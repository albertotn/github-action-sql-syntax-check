package it.albertotn.action.ssc;

import net.sf.jsqlparser.JSQLParserException;

public class Main {

	public static void main(String[] args) {
		SqlSyntaxCheck ssc = new SqlSyntaxCheck();
		try {
			ssc.parse(args[0]);
		} catch (JSQLParserException jpe) {
			jpe.printStackTrace(System.err);
		}
	}

}
