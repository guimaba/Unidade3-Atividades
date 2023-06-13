import java.util.Scanner;

public class Uni3Exe09 {

    static Scanner teclado = new Scanner(System.in);

    /*
    Descreva um programa que calcule o volume de uma lata de óleo. Fórmula:

    volume = Pi * raio^2 * altura
    */

    public static void main(String[] args) {
        
        double pi = 3.14;

        System.out.print("Digite o raio: ");
        double raio = teclado.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = teclado.nextDouble();
    
        double volume = (2 * pi) * raio * altura;

        System.out.println("O volume é: " + volume);

    }

}