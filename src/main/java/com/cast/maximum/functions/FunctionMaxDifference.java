package com.cast.maximum.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FunctionMaxDifference {

	/**
	 * 
	 * Funcao maxDifference: retorna a maior difenrenca encontrada nos numeros informados no array de entrada
	 *
	 * @author <a href="mailto:hcamposcruz@gmail.com">Hudson de Campos Cruz</a>.
	 * @param a : int Array
	 * @return
	 * int
	 */
	public static int maxDifference(int[] a) {
		
		// Criando o array
		List<Integer> verificaLista = new ArrayList<Integer>();
		
		//Verifica se o numero de elementos da matriz é igual ao numero declarado na primeira posição
		if (a[0] != a.length -1) {
			
			return -1;
			
		}
		
		//for para percorrer o array
		for (int i = 1; i < a.length ; i++) {
			
			for (int x = 1 ; x < i ; x++) {
				//verifica se há diferencá
				if (a[x] < a[i]) {
					//adiciona neste array o valor da diferença
					verificaLista.add(a[i] - a[x]);
				}

			}
		}
		//retorna a diferença de maior valor
		return Collections.max(verificaLista);

	}

	
}
