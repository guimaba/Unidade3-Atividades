import java.util.Scanner;

public class Uni3Exe16 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
     
        int notasCem = 0;
        int notasDez = 0;
        int notasUm = 0;

        System.out.print("Insira o valor total da compra: ");
        double valorTotal = teclado.nextDouble();
        System.out.print("Insira o valor pago: ");
        double valorPago = teclado.nextDouble();

        double valorTroco = valorPago - valorTotal;

    do {
        valorTroco = valorTroco - 100;
        notasCem++;  
    } while (valorTroco > 100);

    do {
        valorTroco = valorTroco - 10;
        notasDez++;  
    } while (valorTroco > 10);

    do {
        valorTroco = valorTroco - 1;
        notasUm++;  
    } while (valorTroco > 0);

    System.out.println("As notas quer serão entregues no troco são:");
    System.out.println(notasCem + " notas de 100 reais");
    System.out.println(notasDez + " notas de 10 reais");
    System.out.println(notasUm + " notas de 1 reais");

    }
}