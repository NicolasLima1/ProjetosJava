package CalculadoraComplexa;
import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        char[] operadoresValidos = { '+', '-', '*', '/', '%' };
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = input.nextDouble();

        System.out.println("Digite o operador (+, -, *, /, %)");
        char operador = input.next().charAt(0);
        boolean operadorEValido = checkIfArrayContains(operadoresValidos, operador);
        if (!operadorEValido) {
            input.close();
            System.out.println("Erro: Operação inválida.");
            return;
        }

        System.out.println("Digite o segundo número:");
        double num2 = input.nextDouble();
        input.close();

        if (operador == '+') {
            System.out.println(num1 + num2);
        } 
        else if (operador == '-') {
            System.out.println(num1 - num2);
        } 
        else if (operador == '*') {
            System.out.println(num1 * num2);
        } 
        else if (operador == '/') {
            System.out.println(num1 / num2);
        } 
        else if (operador == '%') {
            System.out.println((num1 / num2) * 100);
        }

    }

    public static boolean checkIfArrayContains(char[] charArray, char valueToCheck) {
        for (int i = 0; i < charArray.length; i++) {
            if (valueToCheck == charArray[i]) {
                return true;
            }
        }
        return false;
    }
}