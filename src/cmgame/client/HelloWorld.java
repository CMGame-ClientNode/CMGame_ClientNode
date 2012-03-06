package cmgame.client;

public class HelloWorld {

    public String getGreeting() {
        return "Hello World!\n" +
                "Enter '#name', '#weather', or '#exit':";
    }

    public String eval(String in) {
        return "#exit".equals(in) ? null : in;
    }
}
