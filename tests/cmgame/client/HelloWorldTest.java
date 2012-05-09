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
    public void shouldReverseName() throws Exception {
        // set mode
        String result = unit.eval("#name");
        assertEquals("Enter your first name:", result);

        result = unit.eval("John");
        assertEquals("Enter your last name:", result);

        result = unit.eval("Smith");
        assertEquals(
                "Hello Smith, John.\n" +
                "Enter your first name:",
                result);

        result = unit.eval("Bob");
        assertEquals("Enter your last name:", result);

        result = unit.eval("Martin");
        assertEquals(
                "Hello Martin, Bob.\n" +
                "Enter your first name:",
                result);
    }

    @Test
    public void shouldEvalExitAsNull() throws Exception {
        assertNull("When the user enters '#exit' then app returns null so REPL will exit.",
                unit.eval("#exit"));
    }
}
