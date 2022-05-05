package DiasSemana;
import java.util.Scanner;

public class Calendario {

    public static void main(String[] args) {
    
    try (Scanner valor = new Scanner(System.in)) {
      int dia; 
      dia = valor.nextInt();

      switch (dia) {
 case 1:
      System.out.println("Monday");
      break;
 case 2:
      System.out.println("Tuesday");
      break;
 case 3:
      System.out.println("Wednesday");
      break;
 case 4:
      System.out.println("Thursday");
      break;
 case 5:
      System.out.println("Friday");
      break;
 case 6:
      System.out.println("Saturday");
      break;
 case 7:
      System.out.println("Sunday");
      break;
      }
    }


    }
}