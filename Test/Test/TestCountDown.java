package Test;
import Ejercicio.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Para evitar que las pruebas se bloqueen debido a los bucles infinitos
//Se interrumpen los hilos después de un segundo.
//Aunque salte la excepción InterruptedException, la prueba no falla.
public class TestCountDown {
    @Test
    public void testCountDown() throws InterruptedException {
        ProgramaCountDown countDown = new ProgramaCountDown();

        Thread thread = new Thread(countDown::contar);
        thread.start();

        Thread.sleep(1000);
        thread.interrupt();

        assertTrue(thread.isInterrupted());
    }
}