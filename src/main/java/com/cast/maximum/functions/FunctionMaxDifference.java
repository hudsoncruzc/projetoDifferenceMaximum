package com.cast.maximum.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionMaxDifference {

	
	public static int maxDifference(int[] a) {
		
		// Criando o array
		List<Integer> verificaLista = new ArrayList<Integer>();
		
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
