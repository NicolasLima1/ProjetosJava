package CalculadoraSwitch;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        
        try (Scanner x = new Scanner(System.in)) {

            System.out.print("Digite o primeiro número: ");
            int num1 = x.nextInt();
            System.out.print("Digite o operador: ");
            String operador = x.next();
            System.out.print("Digite o segundo número: ");
            int num2 = x.nextInt();

            switch (operador) {
                case ("+"):
                    System.out.println("Seu Resultado: " + (num1 + num2));
                    break;
                case ("-"):
                    System.out.println("Seu Resultado: " + (num1 - num2));
                    break;
                case ("*"):
                    System.out.println("Seu Resultado: " + (num1 * num2));
                    break;
                case ("/"):
                    System.out.println("Seu Resultado: " + (num1 / num2));
                    break;

                default:
                    System.out.println("Operação invalida");
                    break;
            }
        }
    }
}
