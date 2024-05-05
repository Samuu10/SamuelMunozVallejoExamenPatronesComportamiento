package Ejercicio;

//Creamos la clase ProgramaCountDown que implementa la interfaz Programa
public class ProgramaCountDown implements Programa{

    //Creamos el método contar que cuenta desde 10 hasta 0, es decir hace que el programa pare
    public boolean contar(){
        int numero = 10;

        /**
         * Este ciclo while se ejecutará mientras el número sea mayor o igual a 0.
         * Se imprime el número, se espera 0.5 segundos y se decrementa en 1.
         */

        while(numero >= 0){
            System.out.println(numero);
            try {
                //Añadimos un retraso de 0.5 segundos para simular el conteo regresivo
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numero--;
        }
        return true;
    }
}