package com.Annotations;

import org.testng.annotations.Test;

public class TestNG_DependentOnMethods_Login {
	
	@Test
	public void LoginTest() {
		System.out.println("Login Test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void HomepageTest() {
		System.out.println("Homepage Test");
	
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void SearchPageTest() {
		System.out.println("Searchpage Test");
	
	}
	
	@Test(dependsOnMethods="LoginTest")
	public void Reg_pageTest() {
		System.out.println("Reg_page Test");
	
	}
}
