package Test;
import Ejercicio.*;
import org.junit.jupiter.api.Test;

//Para evitar que las pruebas se bloqueen debido a los bucles infinitos
//Se interrumpen los hilos después de dos segundos.
public class TestReverser {
    @Test
    public void testReverse() {
        Reverser reverser = new Reverser();
        Programa countUp = new ProgramaCountUp();
        Programa countDown = new ProgramaCountDown();

        Thread countUpThread = new Thread(() -> reverser.reverse(countUp));
        countUpThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countUpThread.interrupt();

        Thread countDownThread = new Thread(() -> reverser.reverse(countDown));
        countDownThread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        countDownThread.interrupt();
    }
}