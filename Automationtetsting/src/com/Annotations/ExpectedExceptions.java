package com.Annotations;

import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.commonjs.module.provider.ParsedContentType;

public class ExpectedExceptions {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void DividedByZero() {
		int e=15/0;
		
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void test2() {
		String X="100A";
		Integer.parseInt("x");
	}
	
	

}
