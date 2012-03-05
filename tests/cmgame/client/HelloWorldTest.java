package cmgame.client;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    private HelloWorld unit;

    @Before
    public void setup() throws Exception {
        unit = new HelloWorld();
    }

    @Test
    public void shouldGreet() throws Exception {
        assertEquals("Hello World!", unit.getGreeting());
    }

    @Test
    public void shouldPrint() throws Exception {
        assertEquals("bob", unit.eval("bob"));
    }

    @Test
    public void shouldEvalExitAsNull() throws Exception {
        assertNull("When the user enters 'exit' then app returns null so REPL will exit.",
                unit.eval("exit"));
    }
}
