package practice04;

public class Student extends Person {
    private Integer klass;
    private String str2 = " I am a Student. I am at Class 2.";
    public Student(String name,Integer age,Integer klass){
        super(name,age);
        this.klass = klass;
    }
    public String introduce(){
        return str+str2;
    }
    public Integer getKlass(){
        return klass;
    }
}
