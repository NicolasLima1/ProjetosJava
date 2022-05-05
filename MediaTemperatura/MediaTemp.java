package MediaTemperatura;
import java.util.Scanner;

class MediaTemp {
    public static void main(String args[]) {
        // declaração das variáveis
        int n;
        double media = 0.0;

        try (Scanner reader = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de temperaturas: ");
            n = reader.nextInt();

            double[] temperaturas = new double[n]; // inicializando o array
            for (int i = 0; i < n; i++) { // percorre as n posições do array
                System.out.print("Digite a temperatura " + (i + 1) + ": ");
                temperaturas[i] = reader.nextDouble(); // recebe cada uma das temperaturas
            }

            // cálculo da média (PROCESSAMENTO)
            for (int i = 0; i < n; i++) { // percorre as n posições do array
                media += temperaturas[i];
            }
        }
        media = media / n;

        // exibição da média (SAÍDA)
        System.out.println("A media das temperaturas = " + media);
    }
}