import java.util.Scanner;

public class Uni3Exe05 {

   static Scanner teclado = new Scanner(System.in);

/*
 Uma granja possui um controle automatizado de cada frango da sua 
 produção. No pé direito do frango há um anel com um chip de 
 identificação; no pé esquerdo são dois anéis para indicar o 
 tipo de alimento que ele deve consumir. Sabendo que o anel com 
 chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um 
 programa para calcular o gasto total da granja para marcar todos 
 os seus frangos.
 */

   public static void main(String[] args) {

      double aChip = 4.00; 
      double aAlim = 3.50;

      System.out.println("Quantos frangos existem na granja?");
      int frangos = teclado.nextInt();
      
      double valorTotal = frangos * (aChip + (aAlim*2));

      System.out.println("O gasto total da granja para marcar todos os frangos é de: R$ " + valorTotal);

      teclado.close();
   }   
}