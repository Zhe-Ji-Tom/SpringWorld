package helloWorld;

public class HelloChina {
    private String message1;
    private String message2;
    private String message3;

    public void setMessage1(String message){
        this.message1 = message;
    }

    public void setMessage2(String message){
        this.message2 = message;
    }

    public void setMessage3(String message){
        this.message3 = message;
    }

    public void getMessage1(){
        System.out.println(message1);
    }

    public void getMessage2(){
        System.out.println(message2);
    }

    public void getMessage3(){
        System.out.println(message3);
    }

    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destroy");
    }

}
