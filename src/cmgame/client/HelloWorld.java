package cmgame.client;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Welcome to Hello World!");
        InputStreamReader isr = new InputStreamReader( System.in );
        StreamTokenizer st = new StreamTokenizer ( isr );

        try {
           while ( true ) {
               switch ( st.nextToken () ) {
                  case StreamTokenizer.TT_NUMBER:
                     System.out.println ( "Read a number: " + st.nval );
                     break;
                  case StreamTokenizer.TT_WORD:
                     System.out.println ( "Read a word: " + st.sval );
                      if ("exit".equals(st.sval)) System.exit(0);
                     break;
                  default:
                      System.out.println("-- " + st.toString());
                     // do something in other cases (EOL, EOF, whitespace, quotes...)
                    break;
              }
           }
        }
        catch (IOException ioe) {
           // Won't happen very often from the keyboard
        }

    }

    public String getGreeting() {
        return "Hello World!";
    }

    public String eval(String in) {
        return "exit".equals(in) ? null : in;
    }
}
