package cmgame.client;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// Tests Hello World
public class HelloWorldTest {

    private HelloWorld unit;

    @Before
    public void setup() throws Exception {
        unit = new HelloWorld();
    }

    @Test
    public void shouldGreet() throws Exception {
        assertEquals(
                "Hello World!\n" +
                "Enter '#name', '#weather', or '#exit':",
                unit.getGreeting());
    }

    @Test
    public void shouldSayYourName() throws Exception {
        // set mode
        unit.eval("#name");

        // do test
        String result = unit.eval("Bob");
        assertEquals("Bob", result);
    }

    @Test
    public void shouldEvalExitAsNull() throws Exception {
        assertNull("When the user enters '#exit' then app returns null so REPL will exit.",
                unit.eval("#exit"));
    }
}
