package ContadorIdade;

import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int idadedias = scanner.nextInt();

            int ano = idadedias / 365;
            idadedias -= ano * 365;

            int mes = idadedias / 30;
            idadedias -= mes * 30;

            int dias = idadedias;

            System.out.println(ano + " ano(s)");
            System.out.println(mes + " mes(s)");
            System.out.println(dias + " dia(s)");
        }

    }

}
