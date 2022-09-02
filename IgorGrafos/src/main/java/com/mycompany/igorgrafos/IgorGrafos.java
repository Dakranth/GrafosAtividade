package com.mycompany.igorgrafos;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class IgorGrafos {

    public static void main(String args[]) throws Exception {
        File doc = new File("C:\\Users\\Aluno\\Downloads\\pequenoG.txt");
        Scanner obj = new Scanner(doc);
        
        
        LinkedList<String> grafo = new LinkedList<>();

        while (obj.hasNextLine()) {
            grafo.add(obj.nextLine());
        }
        System.out.println("grafo: " + grafo);
        String ordem = grafo.get(0);
        String tamanho = grafo.get(1);
        System.out.println("ordem: " + ordem + " tamanho: " + tamanho);
    }
}