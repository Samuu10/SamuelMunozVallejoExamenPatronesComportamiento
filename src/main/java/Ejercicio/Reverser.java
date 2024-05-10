package Ejercicio;

//Clase Reverser que si el programa se detiene, entra en un bucle infinito y si el programa no se detiene, termina inmediatamente
public class Reverser {

    /**
     * @param vistaUsuario que representa la vista del usuario
     * @param haltChecker que representa el haltChecker
     */

    //Atributos
    private VistaUsuario vistaUsuario;
    private HaltChecker haltChecker;


    /**
     * Constructor de la clase Reverser que recibe una instancia de VistaUsuario
     * @param vistaUsuario
     */

    //Constructor
    public Reverser(VistaUsuario vistaUsuario) {
        this.vistaUsuario = vistaUsuario;
        haltChecker = new HaltChecker();

        // Crear manejadores y configurar la cadena de responsabilidad
        ManejadorCountDown manejadorCountDown = new ManejadorCountDown();
        ManejadorCountUp manejadorCountUp = new ManejadorCountUp();

        haltChecker.setSucesor(manejadorCountDown);
        manejadorCountDown.setSucesor(manejadorCountUp);
    }

    //Método que si el programa se detiene, entra en un bucle infinito y si el programa no se detiene, termina inmediatamente
    public void reverse(Programa programa){
        //Comienza el manejo de la solicitud a través de la cadena de responsabilidad
        boolean halt = haltChecker.manejar(programa);

        //Si el programa se detiene, Reverser entra en un bucle infinito
        if(halt){
            vistaUsuario.update("Entrando en un bucle infinito porque " + programa.getClass().getSimpleName() + " se detiene...");

            //Bucle infinito
            while(true){
                vistaUsuario.update("Reverser está en un bucle infinito porque HaltChecker ha determinado que " + programa.getClass().getSimpleName() + " se detiene.");

                //Añadimos un tiempo de espera de 1,5 segundos ente cada iteración
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