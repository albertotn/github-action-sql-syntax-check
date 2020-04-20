package it.albertotn.action.ssc.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import it.albertotn.action.ssc.SqlSyntaxCheck;

public class BasicTest {

	@Test
	public void nullTest() {
		SqlSyntaxCheck ssc = new SqlSyntaxCheck();
		Assertions.assertThrows(NullPointerException.class, () -> {
			ssc.parse(null);
		});
	}

}
