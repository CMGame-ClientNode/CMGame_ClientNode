package cmgame.client;

public class HelloWorld {

	int step = 0;
	String first;
	String last;
    public String getGreeting() {
        return "Hello World!\n" +
                "Enter '#name', '#weather', or '#exit':";
    }

    public String eval(String in) {
        if  ("#exit".equals(in)) {
        	return null;
        }
        else if ("#name".equals(in) || step == 1) {
        	step =2;
        	return "Enter your first name:";
        }
        else if (step == 2) {
        	first = in;
        	step = 3;
        	return "Enter your last name:";
        }
        else if (step == 3) {
        	last = in;
        	step =2;
        	return "Hello "+ last + ", " + first +".\nEnter your first name:";
        }
        
        return "error";
    }
}
