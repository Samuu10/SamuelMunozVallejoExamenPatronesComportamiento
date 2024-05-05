package Ejercicio;
import java.util.Scanner;

//Clase Usuario que prueba el funcionamiento del programa
public class Usuario {
    public static void main(String[] args) {
        //Creamos un objeto ProgramaCountDown
        Programa countDown = new ProgramaCountDown();
        //Creamos un objeto ProgramaCountUp
        Programa countUp = new ProgramaCountUp();
        //Creamos un objeto Reverser
        Reverser reverser = new Reverser();

        //Creamos un objeto Scanner
        Scanner scanner = new Scanner(System.in);
        //Creamos una variable String para almacenar la entrada del usuario
        String entrada;

        //Bucle que se ejecuta mientras la entrada no sea 'CountDown' o 'CountUp'
        do {
            //Pedimos al usuario que introduzca el programa que quiere probar
            System.out.print("¿Qué programa quieres probar? (Escriba 'CountDown' o 'CountUp'): ");
            //Leemos la entrada del usuario
            entrada = scanner.nextLine();

            //Si la entrada es 'CountDown', se ejecuta el programa countDown
            if ("CountDown".equalsIgnoreCase(entrada)) {
                reverser.reverse(countDown);
            //Si la entrada es 'CountUp', se ejecuta el programa countUp
            } else if ("CountUp".equalsIgnoreCase(entrada)) {
                reverser.reverse(countUp);
            //Si la entrada no es 'CountDown' ni 'CountUp', se muestra un mensaje de error
            } else {
                System.out.println("Entrada incorrecta. Por favor, escriba 'CountDown' o 'CountUp'.");
            }
        } while (!"CountDown".equalsIgnoreCase(entrada) && !"CountUp".equalsIgnoreCase(entrada));
    }
}