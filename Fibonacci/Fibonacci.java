package Fibonacci;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int num;

            System.out.print("Digite o número: ");
            num = scanner.nextInt();

            fibonacci(num);
        }

    }

    public static void fibonacci(int num) {

        int t1, t2, prox;

        t1 = 0;
        t2 = 1;

        System.out.println("Fibonacci é: ");
        System.out.println(t1);

        for (int i = 1; i < num; i++) {

            prox = t1 + t2;
            System.out.println(prox);
            t1 = t2;
            t2 = prox;
        }

    }
}
