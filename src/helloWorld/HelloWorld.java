package helloWorld;
import javax.annotation.*;

public class HelloWorld {
    private String message;
    public void setMessage(String messasge){
        this.message = messasge;
    }

    public void getMessage(){
        System.out.println("Your Message:" + message);
//        return message;
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Bean is going through init");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Bean will destroy now");
//    }

}
