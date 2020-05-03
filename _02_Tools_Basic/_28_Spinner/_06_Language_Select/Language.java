package _02_Tools_Basic._28_Spinner._06_Language_Select;

/**
 *
 * @author Majd Talji <en.majd.talji@gmail.com>
 */
public class Language {

    private String code;
    private String name;
    private String greeting;

    public Language(String code, String name, String greeting) {
        this.code = code;
        this.name = name;
        this.greeting = greeting;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    

}
