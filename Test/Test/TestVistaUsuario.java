package Test;
import Ejercicio.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestVistaUsuario {
    private VistaUsuario vistaUsuario;

    @BeforeEach
    public void setUp() {
        vistaUsuario= new VistaUsuario();
    }

    @Test
    public void testCuentaInfinita() throws InterruptedException {
        AtomicBoolean countUpFinished = new AtomicBoolean(false);

        Thread thread = new Thread(() -> {
            vistaUsuario.getBotonCountUp().doClick();
            countUpFinished.set(true);
        });

        thread.start();
        TimeUnit.SECONDS.sleep(1);
        assertTrue(countUpFinished.get());

        String expectedMessage = "Reverser termina inmediatamente porque HaltChecker ha determinado que ProgramaCountUp no se detiene.";
        assertTrue(vistaUsuario.getAreaTexto().getText().contains(expectedMessage));
    }

    @Test
    public void testCuentaAtras() throws InterruptedException {
        AtomicBoolean countDownFinished = new AtomicBoolean(false);

        Thread thread = new Thread(() -> {
            vistaUsuario.getBotonCountDown().doClick();
            countDownFinished.set(true);
        });

        thread.start();
        TimeUnit.SECONDS.sleep(1);
        assertTrue(countDownFinished.get());

        String expectedMessage = "Reverser está en un bucle infinito porque HaltChecker ha determinado que ProgramaCountDown se detiene.";
        assertTrue(vistaUsuario.getAreaTexto().getText().contains(expectedMessage));
    }
}