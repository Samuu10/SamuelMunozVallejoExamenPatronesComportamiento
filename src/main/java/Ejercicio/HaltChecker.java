package Ejercicio;

//Clase HaltChecker que verifica si el programa se detiene o no se detiene
public class HaltChecker extends Manejador{
    @Override
    public boolean manejar(Programa programa){

        /**
         * Método que predice si el programa se detiene o no
         * @param programa
         * @return boolean
         */

        //Si el programa es una instancia de ProgramaCountDown, el programa se detiene
        if(programa instanceof ProgramaCountDown){
            return true;
        //Si el programa es una instancia de ProgramaCountUp, el programa no se detiene
        } else if(programa instanceof ProgramaCountUp){
            return false;
        //Si el programa no es una instancia de ProgramaCountDown o ProgramaCountUp, se pasa al siguiente sucesor
        } else if (sucesor != null) {
            return sucesor.manejar(programa);
        }
        return false;
    }
}