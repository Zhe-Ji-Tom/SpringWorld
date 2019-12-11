package textEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("textEditor/Beans.xml");
        TextEditor TE = (TextEditor) context.getBean("textEditor");
        TE.spellCheck();
    }
}
