package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP/Beans.xml");
        Student student = (Student)context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
