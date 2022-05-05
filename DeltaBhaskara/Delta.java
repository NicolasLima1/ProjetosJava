package DeltaBhaskara;
import java.util.Scanner;

public class Delta {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor de A");
            double a = scanner.nextInt();

            System.out.println("Digite o valor de B");
            double b = scanner.nextInt();

            System.out.println("Digite o valor de C");
            double c = scanner.nextInt();

            double delta = ((b * b) - (4 * a * c));
            double x1 = 0;
            double x2 = 0;

            if (delta >= 0) {

                x1 = ((-b + Math.sqrt(delta)) / 2 * a);
                x2 = ((-b + Math.sqrt(delta)) / 2 * a);
                System.out.println("O valor de x1 = " + x1);
                System.out.println("O valor de x2 = " + x2);
            } else {
                System.out.println("Delta inválido");
            }
        }

    }

}