package practice11;

public class Student extends Person{
    Klass klass;
    private String str = " I am a Student. I am Leader of Class 2.";
    private String str2 = " I am a Student. I am at Class 2.";
    public Student(Integer name,String age,Integer id){
        super(name,age,id);
    }
    public Student(Integer name,String age,Integer id,Klass klass){
        super(name,age,id);
        this.klass = klass;
    }
    private String ss;
    public String introduce(){
        if(klass.flag == 1){
            ss = super.introduce()+str;
        }else{
            ss = super.introduce()+str2;
        }
        return ss;
    }
    public Klass getKlass(){
        return klass;
    }

}
