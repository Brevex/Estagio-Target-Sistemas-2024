package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n========================================================");
        System.out.println("Breno Barbosa de Oliveira - Estagio Ribeirao Preto 2024");
        System.out.println("========================================================");

        Scanner scanner = new Scanner(System.in);
        int retornoSoma = sumOutput();

        System.out.println("\nRetorno da questao 1: " + retornoSoma);
        System.out.print("\nInsira um numero: ");

        int numFibonacci = scanner.nextInt();

        if (estaEmFibonacci(numFibonacci))
        {
            System.out.println("O numero " + numFibonacci + " esta em Fibonacci!");
        } else {
            System.out.println("O numero " + numFibonacci + " nao esta em Fibonacci.");
        }

        scanner.nextLine();

        System.out.print("\nInsira qualquer palavra: ");
        String inputString = scanner.nextLine();

        System.out.print("Palavra invertida: ");
        inverterPalavra(inputString);
    }

    // Reasolucao problema 1

    private static int sumOutput()
    {
        int INDICE = 13, SOMA = 0, K = 0;

        do
        {
            K += 1;
            SOMA += K;
        }
        while (K < INDICE);

        return SOMA;
    }

    // Reasolucao problema 2

    private static boolean estaEmFibonacci(int numEntrada)
    {
        int ant1 = 0, ant2 = 1;

        while (ant1 + ant2 <= numEntrada)
        {
            int fibonacci = ant1 + ant2;

            if (fibonacci == numEntrada) {return true;}

            ant1 = ant2;
            ant2 = fibonacci;
        }

        return false;
    }

    // Resolucao roblema 5

    private static void inverterPalavra(String inputString)
    {
        char[] stringChars = inputString.toCharArray();
        int tamString = stringChars.length - 1;

        for (int charAtual = tamString; charAtual >= 0; charAtual--)
        {
            System.out.print(stringChars[charAtual]);
        }
    }
}