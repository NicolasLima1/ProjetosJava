package ContadorDinheiro;
import java.util.ArrayList;
import java.util.Scanner;

public class Dinheiro {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o valor de notas:");
                int valor = scanner.nextInt();
            System.out.println("Digite o valor de moedas:");
                int moeda = scanner.nextInt();

                
                int[] notas = {100, 50, 20 , 10, 5, 2, 1};
                int[] moedas = {50, 25, 10, 05, 01};
                
                ArrayList <Integer> contagemcelulas = new ArrayList<Integer>();
                ArrayList <Integer> contagemoedas = new ArrayList<Integer>();
                
                

                System.out.println("NOTAS:");

                for(int i = 0; i < notas.length; i++){

                    contagemcelulas.add(valor / notas[i]);
                    valor %= notas[i];
                }

                for(int i = 0; i < notas.length; i++){

                    System.out.println(contagemcelulas.get(i) + " nota(s) de R$ " + notas[i] + ",00");
                }


                System.out.println("MOEDAS:");

                for(int i = 0; i < moedas.length; i++){

                    contagemoedas.add(moeda / moedas[i]);
                    moeda %= moedas[i];
                }

                for(int i = 0; i < moedas.length; i++){

                    System.out.println(contagemoedas.get(i) + " moedas(s) de R$ " + moedas[i] + " centavos");
                }
        }
    }

}
