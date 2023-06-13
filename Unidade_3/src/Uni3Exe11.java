import java.util.Scanner;

public class Uni3Exe11 {

    static Scanner teclado = new Scanner(System.in);

    /*
    Descreva um programa que dado uma temperatura em °C informe o seu valor em °F. Fórmula:

    °F = (9/5) °C + 32
    */

    public static void main(String[] args) {
        
        System.out.print("Digite a temperatura em °C: ");
        double tempC = teclado.nextDouble(); 

        double tempF = (tempC * 9.0/5.0) + 32;

        System.out.println("A temperatura em °F é: " + tempF);

        teclado.close();
    }

}