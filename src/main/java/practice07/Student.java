package practice07;

public class Student extends Person {
    Klass klass = null;
    private String str = " I am a Student. I am at Class 2.";
    public Student(String name,Integer age,Klass klass){
        super(name,age);
        this.klass = klass;
    }
    public String introduce(){
        return super.introduce()+str;
    }
    public Klass getKlass(){
        return klass;
    }
}
