package setCollection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("setCollection/Beans.xml");
        JavaCollection JC = (JavaCollection)context.getBean("javaCollection");
        JC.getAddressList();
        JC.getAddressSet();
        JC.getAddressMap();
        JC.getAddressProp();
    }
}
