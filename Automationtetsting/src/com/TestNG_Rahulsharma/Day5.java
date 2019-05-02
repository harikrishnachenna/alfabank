package com.TestNG_Rahulsharma;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day5 {
	
		
		@BeforeTest
		public void firstexecution() {
			System.out.println("I will execute first because iam with @bffore test annotation");
		}

		
		@Test
		public void firstTestcase() {
			System.out.println("Hello i am Test case 1:");
		}
		
		@ AfterTest
		public void Lastexecution() {
			System.out.println("I will execute last because  i am with @AfterTest Annotation");
		}
}
