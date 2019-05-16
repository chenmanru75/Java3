package practice05;

public class Student extends Person {
    private Integer klass;
    private String str = " I am a Student. I am at Class 2.";
    public Student(String name,Integer age,Integer klass){
        super(name,age);
        this.klass = klass;
    }
    public String introduce(){
        return super.introduce()+str;
    }
    public Integer getKlass(){
        return klass;
    }
}
