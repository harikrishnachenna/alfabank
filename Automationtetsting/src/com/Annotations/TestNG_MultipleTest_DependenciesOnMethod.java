package com.Annotations;

import org.testng.annotations.Test;

public class TestNG_MultipleTest_DependenciesOnMethod {
	
	
	
	@Test(dependsOnMethods= {"TestTwo","TestThree"})
	public void TestOne(){
		System.out.println("Test Method One");
		
	}

	@Test(dependsOnMethods="TestThree")
	public void TestTwo(){
		System.out.println("Test Method Two");
		
	}

	
	@Test
	public void TestThree(){
		System.out.println("Test Method Three");
		
	}

}
