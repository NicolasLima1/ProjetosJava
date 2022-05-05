package PesoImc;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
      Scanner x = new Scanner(System.in);
            float peso, altura, imc;

            System.out.println("Escreva o peso:");
            peso = x.nextFloat();

            System.out.println("Escreva a altura:");
            altura = x.nextFloat();

            imc = peso / (altura * altura);

            if(imc < 18.5f){
                System.out.println("abaixo do peso " + imc);
                
              } else if(18.5f < imc && imc < 25){
                System.out.println("Peso normal " + imc);
              } 
                else if(25 < imc && imc < 30){
                System.out.println("Acima do peso " + imc);
              } 
                else if(imc > 30){
                System.out.println("Obeso " + imc);
              }
    
    }
}