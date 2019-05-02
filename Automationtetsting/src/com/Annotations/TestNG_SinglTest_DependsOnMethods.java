package com.Annotations;

import org.testng.annotations.Test;

public class TestNG_SinglTest_DependsOnMethods {
	
	
	@Test(dependsOnMethods="TestTwo")
	public void TestOne(){
		System.out.println("Test Method One");
		
	}

	@Test()
	public void TestTwo(){
		System.out.println("Test Method Two");
		
	}


 
}
