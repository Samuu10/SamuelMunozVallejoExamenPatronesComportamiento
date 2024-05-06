package Ejercicio;

//Clase abstracta Manejador que define el método manejar y forma parte del patrón Chain of Responsibility
public abstract class Manejador {

    /**
     * @param sucesor que representa el siguiente manejador
     */

    //Atributos
    protected Manejador sucesor;

    //Getters & Setters
    public Manejador getSucesor() {
        return sucesor;
    }
    public void setSucesor(Manejador sucesor) {
        this.sucesor = sucesor;
    }

    //Método manejar que se implementará en las clases ManejadorCountDown y ManejadorCountUp
    public abstract boolean manejar(Programa programa);
}