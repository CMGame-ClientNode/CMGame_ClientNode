package cmgame.client;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void shouldGreet() throws Exception {
        final InputStream sysIn = System.in;
        final PrintStream sysOut = System.out;

        try {
//            byte[] testInBytes = new byte[8];
//            System.setIn(new ByteArrayInputStream(testInBytes));
            ByteArrayOutputStream testOut = new ByteArrayOutputStream();
            System.setOut(new PrintStream(testOut));
            HelloWorld.main(new String[]{});
            assertEquals("Hello World!", String.valueOf(testOut.toByteArray()));
        }
        finally {
            System.setIn(sysIn);
            System.setOut(sysOut);
        }
    }
}
