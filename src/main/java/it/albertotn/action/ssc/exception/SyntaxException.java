package it.albertotn.action.ssc.exception;

import java.io.PrintStream;

import net.sf.jsqlparser.JSQLParserException;

public final class SyntaxException extends Exception {

	private static final long serialVersionUID = -387155264475061164L;
	private JSQLParserException innerException;

	public SyntaxException(JSQLParserException e) {
		this.innerException = e;
	}
	
    public void printStackTrace(PrintStream s) {
    	String msg = innerException.getCause().getMessage();
    	s.append(msg);
    }

}
