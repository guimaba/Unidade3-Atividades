import java.util.Scanner;

public class Uni3Exe01 {
    static Scanner teclado = new Scanner (System.in);

    /*
    Uma imobiliária vende apenas terrenos retangulares. Faça um 
    programa para ler as dimensões de um terreno e depois exibir a 
    área do terreno.
     */

    public static void main(String[] args) {
     
        System.out.print("Digite a altura do terreno: ");
        double altura = teclado.nextDouble();
        System.out.print("Digite a largura do terreno: ");
        double largura = teclado.nextDouble();
        
        double area = altura * largura;

        System.out.println("A área do terreno é: " + area);

        teclado.close();
    }
}
