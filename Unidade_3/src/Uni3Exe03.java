import java.util.Scanner;

public class Uni3Exe03 {
    static Scanner teclado = new Scanner (System.in);

    /*
    Um motorista deseja abastecer seu tanque de combustível. Escreva um 
    programa para ler o preço do litro da gasolina e o valor do 
    pagamento e exibir quantos litros ele conseguiu colocar no tanque.
     */

    public static void main(String[] args) {
     
        System.out.print("Digite o valor do litro: ");
        double litro = teclado.nextDouble();
        System.out.print("Digite o valor do pagamento: ");
        double valorPag = teclado.nextDouble();

        double litrosTanque = valorPag / litro;

        System.out.println("A quantidade de litros no tanque é: " + litrosTanque);

        teclado.close();
    }
}
