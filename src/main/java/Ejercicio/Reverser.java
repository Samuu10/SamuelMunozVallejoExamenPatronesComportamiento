package Ejercicio;

//Clase Reverser que si el programa se detiene, entra en un bucle infinito y si el programa no se detiene, termina inmediatamente
public class Reverser {
    //Atributos
    private VistaUsuario vistaUsuario;

    //Constructor
    public Reverser(VistaUsuario vistaUsuario){
        this.vistaUsuario = vistaUsuario;
    }

    //Método que si el programa se detiene, entra en un bucle infinito y si el programa no se detiene, termina inmediatamente
    public void reverse(Programa programa){

        /**
         * Método que si el programa se detiene, entra en un bucle infinito y si el programa no se detiene, termina inmediatamente
         * @param programa
         */

        HaltChecker haltChecker = new HaltChecker();
        boolean halt = haltChecker.checkHalt(programa);

        //Si el programa se detiene, Reverser entra en un bucle infinito
        if(halt){
            vistaUsuario.update("Entrando en un bucle infinito porque " + programa.getClass().getSimpleName() + " se detiene...");

            //Bucle infinito
            while(true){
                vistaUsuario.update("Reverser está en un bucle infinito porque HaltChecker ha determinado que " + programa.getClass().getSimpleName() + " se detiene.");

                //Añadimos un tiempo de espera de 2 segundos ente cada iteración
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    vistaUsuario.update("Interrupción del bucle infinito.");
                }
            }
        //Si el programa no se detiene, Reverser termina inmediatamente
        } else {
            vistaUsuario.update("Reverser termina inmediatamente porque HaltChecker ha determinado que " + programa.getClass().getSimpleName() + " no se detiene.");
        }
    }
}