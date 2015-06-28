package main.java.hello;

/**
 *
 * Created by dimon on 28.06.15.
 */
public class Greeter {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Your message: "+message);
    }

    public String sayHello(){
        return "Hello World!";
    }
}
