import java.util.Scanner;

public class Uni3Exe08 {

    static Scanner teclado = new Scanner(System.in);

    /*
    Uma pessoa foi até uma casa de câmbio trocar dólares por reais. 
    Para isto ela entregou um valor em dólares para o atendente. 
    Considerando que o atendente tem a cotação do dólar, descreva um 
    programa para calcular quantos reais o atendente deve devolver 
    para a pessoa.
    */

    public static void main(String[] args) {
        
        System.out.println("Quanto custa o dólar?");
        double dolar = teclado.nextDouble(); 
        System.out.print("Digite quantos reais serão trocados: ");
        double real = teclado.nextDouble();

        double conversao = dolar * real;

        System.out.println("Você tem " + conversao + " dólares.");

    }

}