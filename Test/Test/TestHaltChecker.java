package Test;
import Ejercicio.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestHaltChecker {
    @Test
    public void testCheckHalt() {
        HaltChecker haltChecker = new HaltChecker();
        Programa countUp = new ProgramaCountUp();
        Programa countDown = new ProgramaCountDown();

        assertFalse(haltChecker.checkHalt(countUp));
        assertTrue(haltChecker.checkHalt(countDown));
    }
}