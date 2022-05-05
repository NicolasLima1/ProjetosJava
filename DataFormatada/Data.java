package DataFormatada;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {  
  public static void main(String[] args) { 
      LocalDate myData = LocalDate.of(2003, 11, 17);

      
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      
      String mydataformat = myData.format(formatador);
      
      System.out.println(mydataformat);
    
  }  
}  
