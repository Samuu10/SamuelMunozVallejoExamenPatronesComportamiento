package Ejercicio;

//Clase Reverser que si el programa se detiene, entra en un bucle infinito y si el programa no se detiene, termina inmediatamente
public class Reverser {
    public void reverse(Programa programa){

        /**
         * Método que si el programa se detiene, entra en un bucle infinito y si el programa no se detiene, termina inmediatamente
         * @param programa
         */

        HaltChecker haltChecker = new HaltChecker();
        boolean halt = haltChecker.checkHalt(programa);

        //Si el programa se detiene, Reverser entra en un bucle infinito
        if(halt){
            System.out.println("Entrando en un bucle infinito porque " + programa.getClass().getSimpleName() + " se detiene...");

            //Bucle infinito
            while(true){
                System.out.println("Reverser está en un bucle infinito porque HaltChecker ha determinado que " + programa.getClass().getSimpleName() + " se detiene.");

                //Añadimos un tiempo de espera de 2 segundos ente cada iteración
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Interrupción del bucle infinito.");
                }
            }
        //Si el programa no se detiene, Reverser termina inmediatamente
        } else {
            System.out.println("Reverser termina inmediatamente porque HaltChecker ha determinado que " + programa.getClass().getSimpleName() + " no se detiene.");
        }
    }
}