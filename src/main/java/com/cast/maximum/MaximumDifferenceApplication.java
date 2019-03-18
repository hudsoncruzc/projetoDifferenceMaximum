package com.cast.maximum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cast.maximum.functions.FunctionMaxDifference;

@SpringBootApplication
public class MaximumDifferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaximumDifferenceApplication.class, args);
		
		FunctionMaxDifference funcaoMax = new FunctionMaxDifference();
		
		int resultado;
		int[] listagem1 = {7,2,3,10,2,4,8,1};
		int[] listagem2 = {6,7,9,5,6,3,2};
		
		System.out.println("Array : {7,2,3,10,2,4,8,1}");
		
		resultado = funcaoMax.maxDifference(listagem1);
		
		if (resultado < 0) {
			System.out.println("Número de elementos do Array diferente do informado!");
		
		}else {
			System.out.println("Resultado => " + resultado);
			System.out.println("  ");
			
		}

		
		System.out.println("Array: {6,7,9,5,6,3,2}");
		resultado = funcaoMax.maxDifference(listagem2);
		
		if(resultado < 0) {
			System.out.println("Número de elementos do Array diferente do informado!");
		
		}else {
			System.out.println("Resultado =>  " + resultado);
		
		}

	}

}
