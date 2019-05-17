package practice08;

public class Teacher extends Person {
    Klass klass = null;
    private String str = " I am a Teacher. I teach Class 2.";
    private String str2 = " I am a Teacher. I teach No Class.";
    public Teacher(Integer age,String name,Integer id,Klass klass){
        super(age,name,id);
        this.klass = klass;
    }
    public Teacher(Integer name,String age, Integer id){
        super(name,age,id);
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
    public Klass getKlass(){
        return klass;
    }
    private String s2;
    public String introduceWith(Student student){
        System.out.println(student.klass.getNumber());
        if(student.klass.getNumber()!=klass.getNumber()){
            s2 = "I don't teach " + student.getName();
        }else{
            s2 = "I teach " + student.getName();
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. " + s2 +".";
    }
}
