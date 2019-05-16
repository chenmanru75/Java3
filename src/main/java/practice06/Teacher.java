package practice06;

public class Teacher extends Person{
    private Integer klass;
    private String str = " I am a Teacher. I teach Class 2.";
    private String str2 = " I am a Teacher. I teach No Class.";
    public Teacher(String name,Integer age,Integer klass){
        super(name,age);
        this.klass = klass;
    }
    public Teacher(String name,Integer age){
        super(name,age);
    }
    private String s;
    public String introduce(){
        if(this.getKlass() == null){
            s = str2;
        }else{
            s = str;
        }
        return super.introduce() + s;
    }

    public Integer getKlass(){
        return klass;
    }
}
