package com.qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testbase.Test_Base;

public class Test_Execution_Date extends Test_Base {
	
	@Test
	public void verify_Release_Date ()
	{
		System.out.println("\n" + "	TEST SCENARIO 2 : Release Date");	
		
		Assert.assertEquals(country.verify_IMDB_Release_Date(), r_date.verify_Wiki_Release_Date(), "Asserstion 2 applied for Release Date verification");
		
	}

}
