package br.com.dio.Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, b;

        System.out.println("Digite o primeiro Valor: ");
        a= scan.nextDouble();

        System.out.println("Digite o segundo Valor: ");
        b= scan.nextDouble();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a,b);

        System.out.println("Soma: " + somar);
        System.out.println("Divisão: " + dividir);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Subtração: " + subtrair);



    }

    public static double somar(double a, double b){
        return a+b;
    }
    public static double subtrair(double a, double b){
        return a-b;
    }
    public static double multiplicar(double a, double b){
        return a*b;
    }
    public static double dividir(double a, double b){
        return a /b;
    }

}
