package it.albertotn.action.ssc;

import it.albertotn.action.ssc.exception.SyntaxException;

public class Main {

	public static void main(String[] args) {
		SqlSyntaxCheck ssc = new SqlSyntaxCheck();
		try {
			ssc.parse(args[0]);
			System.out.println("Syntax check success");
		} catch (SyntaxException jpe) {
			jpe.printStackTrace(System.err);
		}
	}

}
