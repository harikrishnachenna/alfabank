package com.TestNG_Rahulsharma;

import org.testng.annotations.Test;

public class Day3_Test_enable{
	@Test
	public void Mobilesignincarloan() {
		System.out.println("Mobile sign in ");
	}
/*
  for example in real time, if we found a bug in test case 2 and ticket has been raised
  and  you need to execute rest of the test cases for smoke testing so we can execute rest of the 
  test cases by defing the @test(enable=false) for that faulty yest case.  
 */
	@Test(enabled=false)
	public void Mobilesinoutcarloan() {
		System.out.println("Moble sign out");
	}
	
	@Test
	public void APIcarloan() {
		System.out.println("API Login car");
	}
	
}
