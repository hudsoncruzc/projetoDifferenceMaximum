package com.cast.maximum.test;

import org.junit.Assert;
import org.junit.Test;

import com.cast.maximum.functions.FunctionMaxDifference;

public class FunctionMaxDifferenceTest {
	
	@Test
	public void testFuctionMaxDifference(){
		
		int verifica;
		int[] listagem1 = {7,2,3,10,2,4,8,1};
		
		verifica = FunctionMaxDifference.maxDifference(listagem1);
		Assert.assertEquals(8, verifica);
		
	}
	
}
