import java.util.Scanner;

public class Uni3Exe13 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
     
        double precoAzulejoPorMQ = 12.50 * 9; 

        System.out.print("Informe a altura da parede: ");
        double altura = teclado.nextDouble(); 
        System.out.print("Informe a largura da parede: ");
        double largura = teclado.nextDouble();

        double metrosQuad = ((int) altura + 1) * ((int) largura + 1);

        System.out.println(altura + " e " + largura + " e " + metrosQuad);

        double precoTotal = precoAzulejoPorMQ * metrosQuad;

        System.out.println("O preço final é: R$" + precoTotal);

    }
}