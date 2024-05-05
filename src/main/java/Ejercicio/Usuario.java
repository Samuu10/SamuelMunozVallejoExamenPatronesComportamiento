package Ejercicio;
import java.util.Scanner;

//Clase Ejercicio.Usuario que prueba el funcionamiento del programa
public class Usuario {
    public static void main(String[] args) {
        Programa countDown = new ProgramaCountDown();
        Programa countUp = new ProgramaCountUp();
        Reverser reverser = new Reverser();

        Scanner scanner = new Scanner(System.in);
        String entrada;

        do {
            System.out.print("¿Qué programa quieres probar? (Escriba 'CountDown' o 'CountUp'): ");
            entrada = scanner.nextLine();

            if ("CountDown".equalsIgnoreCase(entrada)) {
                reverser.reverse(countDown);
            } else if ("CountUp".equalsIgnoreCase(entrada)) {
                reverser.reverse(countUp);
            } else {
                System.out.println("Entrada incorrecta. Por favor, escriba 'CountDown' o 'CountUp'.");
            }
        } while (!"CountDown".equalsIgnoreCase(entrada) && !"CountUp".equalsIgnoreCase(entrada));
    }
}