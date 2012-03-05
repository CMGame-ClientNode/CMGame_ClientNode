package cmgame.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class REPL {

    public static void main(String[] args) throws IOException {
        HelloWorld app = new HelloWorld();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String out = app.getGreeting();
        while (out != null) {
            System.out.println(out);
            String in = br.readLine();
            out = app.eval(in);
        }
    }
}
