package HorarioSegundos;
import java.util.Scanner;

public class Segundos {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int h;
            int m;
            int s;
            int segundos;
            int resto;

            System.out.println("Digite o número de segundos");
            segundos = scanner.nextInt();

            resto = segundos % 3600;

            h = segundos / 3600;
            m = resto / 60;
            s = resto % 60;

            System.out.print("Horário = ");
            System.out.print(h + ":" + m);
            System.out.print(":" + s);
        }

    }
}
