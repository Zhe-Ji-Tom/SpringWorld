package textEditor;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class TextEditor {
    private SpellChecker spellChecker;
//    private String name;


//    public TextEditor(SpellChecker spellChecker){
//        System.out.println("Inside TextEditor constructor");
//        this.spellChecker = spellChecker;
////        this.name = name;
//    }

    @Resource(name="spellChecker")
    public void setSpellChecker(SpellChecker spellChecker){
        System.out.println("Inside setSpellChecker");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker(){
        return spellChecker;
    }

//    public void setName(String name){
//        this.name = name;
//    }

//    public String getName(){
//        return name;
//    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }
}
