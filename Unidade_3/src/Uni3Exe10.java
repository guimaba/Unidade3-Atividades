import java.util.Scanner;

public class Uni3Exe10 {

    static Scanner teclado = new Scanner(System.in);

    /*
    Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.
    Fórmula:

    hipotenusa^2=cateto1^2+cateto^2
    */

    public static void main(String[] args) {
        
        System.out.print("Digite o o cateto 1: ");
        double cateto1 = teclado.nextDouble();
        System.out.print("Digite o o cateto 2: ");
        double cateto2 = teclado.nextDouble();

        double hipotenusa = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
        hipotenusa = Math.sqrt(hipotenusa);

        System.out.println("O resultado da Hipotenusa é: " + hipotenusa);
    }

}