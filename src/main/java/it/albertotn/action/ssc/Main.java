package it.albertotn.action.ssc;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

import it.albertotn.action.ssc.exception.SyntaxException;

public final class Main {

	public static void main(String[] args) {
		SqlSyntaxCheck ssc = new SqlSyntaxCheck();
		try {
			if(!args[0].isEmpty()){
				String content = FileUtils.readFileToString(new File(args[0]), StandardCharsets.UTF_8);
				ssc.parse(content);
				System.out.println("Syntax check success");
			}
			else
				System.out.println("No Argument Present");


		} catch (SyntaxException | IOException jpe) {
			jpe.printStackTrace(System.err);
		}
	}

}
