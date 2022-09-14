package br.unicap.grafos;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		File doc = new File("C:\\Users\\igor_\\Downloads\\pequenoG.txt");
		Scanner obj = new Scanner(doc); 
		LinkedList<String> grafo = new LinkedList<>();
		while (obj.hasNextLine()) {
			grafo.add(obj.nextLine());
		}
		String tamanho, ordem;
		ordem = grafo.pop();
		tamanho = grafo.pop();
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Ordem: " + ordem);
		System.out.println("Grafo: " + grafo);
		obj.close();		
		String grafoSt[] = new String[Integer.parseInt(tamanho)];
		for (int i = 0; i < grafoSt.length; i = i + 1) {
			grafoSt[i] = grafo.get(i);
		}
		exibe(grafoSt);
		for (int i = 0; i < grafoSt.length; i++) {
			 			
		}
 	}
	public static void exibe(String vet[]) {
		for (int i = 0; i < vet.length; i = i + 1) {
			System.out.println(vet[i]);
		}
	}

}
/*for (parâmetro: nomeDoVetor) {
   instrução;
}*/