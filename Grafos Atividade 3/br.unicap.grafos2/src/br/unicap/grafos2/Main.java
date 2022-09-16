package br.unicap.grafos2;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		File doc = new File("C:\\Users\\igor_\\Downloads\\pequenoG.txt");
		Scanner obj = new Scanner(doc); 
		LinkedList<String> grafo = new LinkedList<>();
		while (obj.hasNextLine()) {
			grafo.add(obj.nextLine());
		}
		String vertice, aresta;
		vertice = grafo.pop();
		aresta = grafo.pop();
		obj.close();
	}

}
