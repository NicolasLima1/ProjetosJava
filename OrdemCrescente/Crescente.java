package OrdemCrescente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Crescente {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeros = 1;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (!(numeros == 0)) {

            System.out.println("Digite um número");
            numeros = scanner.nextInt();

            numbers.add(numeros);
        } 
        scanner.close();

        Collections.sort(numbers);
        numbers.remove(0);
        
        System.out.println("Seus números em ordem crescente: ");

        for (int i : numbers) {

            System.out.println(i);
        }
    }
}
