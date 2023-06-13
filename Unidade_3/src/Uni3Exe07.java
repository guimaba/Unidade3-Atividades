import java.util.Scanner;

public class Uni3Exe07 {

    static Scanner teclado = new Scanner(System.in);

    /*
    Uma fábrica de refrigerantes vende seu produto em três formatos: 
    lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. Se um 
    comerciante compra uma determinada quantidade de cada formato, 
    faça um programa para calcular quantos litros de refrigerante ele 
    comprou.
    */

    public static void main(String[] args) {
        
        System.out.print("Digite quantos regrigerantes de 350ml foram comprados: ");
        int refT = teclado.nextInt();
        System.out.print("Digite quantos regrigerantes de 600ml foram comprados: ");
        int refS = teclado.nextInt();
        System.out.print("Digite quantos regrigerantes de 2L foram comprados: ");
        int refD = teclado.nextInt();
        
        double totalLitros = (refT * 0.350) + (refS * 0.600) + (refD * 2.000);

        System.out.println("Foram comprados " + totalLitros + " litros.");

        teclado.close();
    }

}