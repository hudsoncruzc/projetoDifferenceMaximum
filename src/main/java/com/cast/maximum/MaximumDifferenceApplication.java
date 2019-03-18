package com.cast.maximum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MaximumDifferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaximumDifferenceApplication.class, args);

		int[] listagem1 = {7,2,3,10,2,4,8,1};
		int[] listagem2 = {6,7,9,5,6,3,2};

		System.out.println("Array : {7,2,3,10,2,4,8,1}");
		
		if (maxDifference(listagem1) < 0) {
			System.out.println("Número de elementos do Array diferente do informado!");
		
		}else {
			System.out.println("Resultado => " + maxDifference(listagem1));
			System.out.println("  ");
			
		}

		System.out.println("Array: {6,7,9,5,6,3,2}");
		if(maxDifference(listagem2) < 0) {
			System.out.println("Número de elementos do Array diferente do informado!");
		
		}else {
			System.out.println("Resultado =>  " + maxDifference(listagem2));
		
		}

	}


	private static int maxDifference(int[] a) {
		
		// Criando o array
		List<Integer> verificaLista = new ArrayList();
		
		//Verifica se o numero de elementos da matriz é igual ao numero declarado na primeira posição
		if (a[0] != a.length -1) {
			
			return -1;
			
		}
		
		//
		for (int i = 1; i < a.length ; i++) {
			
			for (int x = 1 ; x < i ; x++) {
				if (a[x] < a[i]) {
					verificaLista.add(a[i] - a[x]);
				}

			}
		}

		return Collections.max(verificaLista);

	}
}
