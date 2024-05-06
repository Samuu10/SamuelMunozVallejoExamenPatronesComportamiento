package Ejercicio;

//Clase ManejadorCountUp que hereda de la clase Manejador y gestiona el programa CountUp
public class ManejadorCountUp extends Manejador{
    public boolean manejar(Programa programa) {
        //Si el programa es una instancia de ProgramaCountUp, el programa no se detiene
        if (programa instanceof ProgramaCountUp) {
            return false;
        //Si el programa no es una instancia de ProgramaCountUp, se pasa al siguiente sucesor
        } else if (sucesor != null) {
            return sucesor.manejar(programa);
        }
        return false;
    }
}