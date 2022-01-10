package Calc.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o A");
        a = scan.nextInt();
        System.out.println("Digite o B");
        b = scan.nextInt();
        double somar = somar(a, b);
        double sub = sub(a,b);
        double mult = mult(a, b);
        double dividir = dividir(a,b);

        System.out.println("Soma: " +somar);
        System.out.println("Subtração: " +sub);
        System.out.println("Multiplicação: " +mult);
        System.out.println("Divisão: " +dividir);

    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double mult(int a, int b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a/b;
    }

    public static double sub(int a, int b) {
        return a - b;
    }
}
