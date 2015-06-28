package main.java.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by dimon on 28.06.15.
 */
public class MainApp {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Greeter obj = (Greeter) context.getBean("helloWorld");
        obj.getMessage();
    }
}
