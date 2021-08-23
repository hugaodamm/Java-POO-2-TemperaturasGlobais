package com.company;

import java.util.Scanner;

public class AulaVetorMatriz {
    public static void main(String[] args) {

        String cidades[] = new String[10];      // vetor = nomes das cidades
        int temperatura[][] = new int [10][2];  // matriz = temperatura, 10 linhas e 2 colunas

        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nueva York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Assunción";
        cidades[5] = "São Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago de Chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";

        temperatura[0][0] = -2;
        temperatura[0][1] = 33;

        temperatura[1][0] = -3;
        temperatura[1][1] = 32;

        temperatura[2][0] = -8;
        temperatura[2][1] = 27;

        temperatura[3][0] = 4;
        temperatura[3][1] = 37;

        temperatura[4][0] = 6;
        temperatura[4][1] = 42;

        temperatura[5][0] = 5;
        temperatura[5][1] = 43;

        temperatura[6][0] = 0;
        temperatura[6][1] = 39;

        temperatura[7][0] = -7;
        temperatura[7][1] = 26;

        temperatura[8][0] = -1;
        temperatura[8][1] = 31;

        temperatura[9][0] = -10;
        temperatura[9][1] = 35;

        int minima = 0;
        int maximo = 0;
        String nomeCidadeMin = "";
        String nomeCidadeMax = "";

        for (int linha=0; linha < temperatura.length; linha++){
            for (int coluna=0; coluna < 2; coluna++){

                if (minima > temperatura [linha][coluna]){
                    minima = temperatura[linha][coluna];
                    nomeCidadeMin = cidades[linha];
                }
                if (maximo < temperatura [linha][coluna]){
                    maximo = temperatura[linha][coluna];
                    nomeCidadeMax = cidades[linha];
                };
            }
        }
        System.out.println("A temperatura mais baixa foi " + nomeCidadeMin + " com "+ minima + "oC");
        System.out.println("A temperatura mais alta foi " + nomeCidadeMax + " com "+ maximo + "oC");
    }
}