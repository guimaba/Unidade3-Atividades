import java.util.Scanner;

public class Uni3Exe02 {
    static Scanner teclado = new Scanner (System.in);

    /*
    Uma loja de calçados está concedendo 12% de desconto nos produtos. 
    Escreva um programa para calcular e exibir o valor de desconto a 
    ser dado num par de sapatos e quanto deve custar o produto com o 
    desconto. O preço do par de sapatos deve ser informado pelo 
    usuário. Como resultado, o programa deverá exibir as seguintes 
    mensagens:

    O valor do desconto é de R$ xxx
    O preço do par de sapatos com desconto é R$ xxx
     */

    public static void main(String[] args) {

        System.out.print("Qual o valor dos sapatos sem desconto: ");
        double valorSD = teclado.nextDouble();

        double valorDesconto = valorSD * 0.12;
        double valorCD = valorSD - valorDesconto;

        System.out.println("O valor do desconto é de R$ " + valorDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + valorCD);

    }
}
