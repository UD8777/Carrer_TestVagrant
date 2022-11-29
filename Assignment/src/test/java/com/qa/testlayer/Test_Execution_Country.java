package com.qa.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testbase.Test_Base;

public class Test_Execution_Country extends Test_Base {
	
	@Test
	public void verify_County ()
	{
		
		System.out.println("\n" + "	TEST SCENARIO 1 : Country Origin");
			
		Assert.assertEquals(country.verify_IMDB_County(),r_date.verify_wiki_county(), "Asserstion 1 applied for Country verification");
		
		
	}

}
