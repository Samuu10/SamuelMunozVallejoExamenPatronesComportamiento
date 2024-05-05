package Test;
import Ejercicio.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Para evitar que las pruebas se bloqueen debido a los bucles infinitos
//Se interrumpen los hilos después de un segundo.
//Aunque salte la excepción InterruptedException, la prueba no falla.
public class TestCountUp {
    @Test
    public void testCountUp() throws InterruptedException {
        ProgramaCountUp countUp = new ProgramaCountUp();

        Thread thread = new Thread(countUp::contar);
        thread.start();

        Thread.sleep(1000);
        thread.interrupt();

        assertTrue(thread.isInterrupted());
    }
}