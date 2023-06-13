import java.util.Scanner;

public class Uni3Exe15 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
     
        System.out.print("Insira um número com até 3 digitos: ");
        String n = teclado.nextLine();
        
        String[] numero = n.split("");

        System.out.println(numero[0] + " centena(s) " + numero[1] + " dezena(s) " + numero[2] + " unidade(s)");
    }
}