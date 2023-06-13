import java.util.Scanner;

public class Uni3Exe12 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
     
        System.out.print("Informe o nome: ");
        String nome = teclado.nextLine(); 
        System.out.print("Informe o número de horas trabalhadas menasis: ");
        double horasMes = teclado.nextDouble();
        System.out.print("Informe o número de dependentes: ");
        int dependentes = teclado.nextInt();

        double salarioBruto = (horasMes * 10.00) + (dependentes * 60.00);

        double salarioLiquido = salarioBruto - ((salarioBruto * 0.085) + (salarioBruto * 0.05));

        System.out.println("O funcionário " + nome + " tem os salários:");
        System.out.println("Bruto: " + salarioBruto);
        System.out.println("Líquido: " + salarioLiquido);

    }
}