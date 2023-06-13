import java.util.Scanner;

public class Uni3Exe04 {

   static Scanner teclado = new Scanner(System.in);

   /*
   Faça um programa para ler três notas de um aluno em uma disciplina
   e imprimira sua média ponderada (as notas tem pesos respectivos 
   de 5, 3 e 2).
    */

   public static void main(String[] args) {

      System.out.print("Digite a primeira nota: ");
      double nota1 = teclado.nextDouble();
      System.out.print("Digite a segunda nota: ");
      double nota2 = teclado.nextDouble();
      System.out.print("Digite a terceira nota: ");
      double nota3 = teclado.nextDouble();

      double media = (nota1 * 0.5) + (nota2 * 0.3) + (nota3 * 0.2);

      System.out.print("A média ponderada das notas é: " + media);

      teclado.close();
   }   
}