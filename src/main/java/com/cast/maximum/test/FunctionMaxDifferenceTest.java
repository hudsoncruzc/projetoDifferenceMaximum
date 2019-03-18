package com.cast.maximum.test;

import org.junit.Assert;
import org.junit.Test;

import com.cast.maximum.functions.FunctionMaxDifference;
/**
 * 
 * Classe FunctionMaxDifferenceTest: realiza teste de unidade
 *
 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
 */

public class FunctionMaxDifferenceTest {
	
	/**
	 * 
	 * Realiza o teste na FunctionMaxDifference
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param int Array
	 * @return
	 * void
	 */	
	@Test
	public void testFuctionMaxDifference(){
		
		int verifica;
		int[] listagem1 = {7,2,3,10,2,4,8,1};
		
		verifica = FunctionMaxDifference.maxDifference(listagem1);
		Assert.assertEquals(8, verifica);
		
	}
	
}
