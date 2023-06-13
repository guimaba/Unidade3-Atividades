import java.util.Scanner;

public class Uni3Exe14 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
     
        System.out.print("Informe a distância percorrida (em km): ");
        double distancia = teclado.nextDouble();
        System.out.print("Informe o tempo da viagem (em horas): ");
        double tempo = teclado.nextDouble();
        
        double combustivelGasto = distancia / 12;
        double VM = distancia / tempo;

        System.out.println("A velocidade média foi: " + VM + "km/h.");
        System.out.println("O combustível gasto foi: " + combustivelGasto + " Litros.");
    }
}