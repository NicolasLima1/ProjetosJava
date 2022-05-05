package MediaNotas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Notas {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        double nota;
        double media = 0;

        
        ArrayList<Double> todasNota = new ArrayList<>();
        
        for(int i = 0; i < 4; i++){
            
            nota = pegarNota("Digite a nota " + (i+1) + ": ");
            
            todasNota.add(nota);
        }
        
        Collections.sort(todasNota);
        todasNota.remove(0);
        
        for(double n : todasNota){
            
            media += n;
        }

        media /= todasNota.size();
        
        System.out.println("Sua média é: " + media);
    }
    
    public static double pegarNota(String message){
    
        System.out.println(message);
    
        double nota = scanner.nextDouble();
        return nota;
    }
}
