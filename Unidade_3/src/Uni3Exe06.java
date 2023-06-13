import java.util.Scanner;

public class Uni3Exe06 {

    static Scanner teclado = new Scanner(System.in);

    /*
    Um restaurante cobra R$ 25,00 por cada quilo de refeição. 
    Escreva um programa que leia o peso do prato montado pelo cliente 
    (em quilos) e imprima o valor a pagar. O peso do prato é de 
    750 gramas.
    */

    public static void main(String[] args) {
        double precoKg = 25.00;
        System.out.print("Digite o peso do prato (em quilos): ");
        double peso = teclado.nextDouble(); 
    
        double valorPag = (precoKg * peso + 0.750);

        System.out.println("O valor a pagar pelo preto é: " + valorPag);

        teclado.close();
    }

}