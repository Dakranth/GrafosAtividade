package br.unicap.grafos4;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
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
		String grafoSt[] = new String[Integer.parseInt(tamanho)];
		System.out.println("Grafo: ");
		for (int i = 0; i < grafoSt.length; i = i + 1) {
			grafoSt[i] = grafo.get(i);
		}		
		obj.close();
	}

	public static void DFS(int v, Grafo[] g) {
		visitado[v] = true;		
		Iterator<Integer> ite = g[v];
		while (ite.hasNext()) {
			int adj = ite.next();
			if (!visitado[adj])
				DFS(adj);
		}
	}
}