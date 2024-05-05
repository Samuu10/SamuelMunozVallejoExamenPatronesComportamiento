package Ejercicio;

//Creamos la clase ProgramaCountUp que implementa la interfaz Programa
public class ProgramaCountUp implements Programa{

    //Creamos el método contar que cuenta desde 0 hasta Infinito, es decir hace que el programa no pare
    public boolean contar(){
        int numero = 0;

        /**
         * Este ciclo while se ejecutará indefinidamente, ya que el número siempre será mayor o igual a 0.
         * Se imprime el número, se espera 0.5 segundos y se incrementa en 1.
         */

        while(numero >= 0){
            System.out.println(numero);
            try {
                //Añadimos un retraso de 0.5 segundos para simular el conteo
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numero++;
        }
        return false;
    }
}