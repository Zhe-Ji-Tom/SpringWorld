package helloWorld;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("helloWorld/Bean.xml");
        context.start();
        HelloWorld object = (HelloWorld)context.getBean("helloWorld");
        object.getMessage();
        context.stop();
    }
}
