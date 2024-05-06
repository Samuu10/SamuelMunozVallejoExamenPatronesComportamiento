package Test;
import Ejercicio.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestManejadores {
    @Test
    void testManejarConProgramaCountDown() {
        ManejadorCountDown manejador1 = new ManejadorCountDown();
        Programa programa1 = new ProgramaCountDown();
        boolean resultado1 = manejador1.manejar(programa1);
        assertTrue(resultado1);

        ManejadorCountUp manejador2 = new ManejadorCountUp();
        Programa programa2 = new ProgramaCountDown();
        boolean resultado2 = manejador2.manejar(programa2);
        assertFalse(resultado2);
    }

    @Test
    void testManejarConProgramaCountUp() {
        ManejadorCountDown manejador1 = new ManejadorCountDown();
        Programa programa1 = new ProgramaCountUp();
        boolean resultado1 = manejador1.manejar(programa1);
        assertFalse(resultado1);

        ManejadorCountUp manejador2 = new ManejadorCountUp();
        Programa programa2 = new ProgramaCountUp();
        boolean resultado2 = manejador2.manejar(programa2);
        assertFalse(resultado2);
    }

    @Test
    void testManejarConSiguienteSucesor() {
        ManejadorCountDown manejador1 = new ManejadorCountDown();
        ManejadorCountUp manejadorSucesor1 = new ManejadorCountUp();
        manejador1.setSucesor(manejadorSucesor1);

        Programa programa1 = new ProgramaCountUp();
        boolean resultado1 = manejador1.manejar(programa1);
        assertFalse(resultado1);

        ManejadorCountUp manejador2 = new ManejadorCountUp();
        ManejadorCountDown manejadorSucesor2 = new ManejadorCountDown();
        manejador2.setSucesor(manejadorSucesor2);

        Programa programa2 = new ProgramaCountDown();
        boolean resultado2 = manejador2.manejar(programa2);
        assertTrue(resultado2);
    }
}