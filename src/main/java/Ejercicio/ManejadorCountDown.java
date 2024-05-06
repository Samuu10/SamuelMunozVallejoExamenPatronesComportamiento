package Ejercicio;

//Clase ManejadorCountDown que hereda de la clase Manejador y gestiona el programa CountDown
public class ManejadorCountDown extends Manejador{
    public boolean manejar(Programa programa) {
        //Si el programa es una instancia de ProgramaCountDown, el programa se detiene
        if (programa instanceof ProgramaCountDown) {
            return true;
        //Si el programa es una instancia de ProgramaCountUp, se pasa al siguiente sucesor
        } else if (sucesor != null) {
            return sucesor.manejar(programa);
        }
        return false;
    }
}