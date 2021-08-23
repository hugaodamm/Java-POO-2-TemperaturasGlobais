package com.company;

public class Main {

    public static void teste1(String[] args) {

        String cidades[] = new String [2]; // nomes das cidades

        cidades[0] = "Londres";
        cidades[1] = "Madrid";
//        cidades[2] = "Nueva York";
//        cidades[3] = "Buenos Aires";
//        cidades[4] = "Assunción";
//        cidades[5] = "São Paulo";
//        cidades[6] = "Lima";
//        cidades[7] = "Santiago de Chile";
//        cidades[8] = "Lisboa";
//        cidades[9] = "Tokio";

//        int matriz[][] = new int [9][2];
//
//        matriz[0][0] = -2;
//        matriz[0][1] = 33;

        for (int i=0; i<=cidades.length; i++){
            System.out.println("Cidade:" + cidades[i]);
        }

    }
}
