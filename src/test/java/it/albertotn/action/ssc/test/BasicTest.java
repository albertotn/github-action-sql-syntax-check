package it.albertotn.action.ssc.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import it.albertotn.action.ssc.SqlSyntaxCheck;
import it.albertotn.action.ssc.exception.SyntaxException;

public final class BasicTest {

	@Test
	public void nullTest() {
		SqlSyntaxCheck ssc = new SqlSyntaxCheck();
		Assertions.assertThrows(NullPointerException.class, () -> {
			ssc.parse(null);
		});
	}
	
	@Test
	public void koParse() {
		SqlSyntaxCheck ssc = new SqlSyntaxCheck();
		Assertions.assertThrows(SyntaxException.class, () -> {
			ssc.parse("selec");
		});
	}
	
	@Test
	public void okParse() {
		SqlSyntaxCheck ssc = new SqlSyntaxCheck();
		Assertions.assertThrows(SyntaxException.class, () -> {
			ssc.parse("select * from dual");
		});
	}

}
