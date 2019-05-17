package practice10;

import java.util.LinkedList;

public class Teacher extends Person {
    Klass klass = null;
    private String str = " I am a Teacher. I teach Class ";
    private String str2 = " I am a Teacher. I teach No Class.";
    LinkedList<practice10.Klass> linkedList = new LinkedList<>();
    public Teacher(Integer age, String name, Integer id, LinkedList linkedList){
        super(age,name,id);
        this.linkedList = linkedList;
    }
    public Teacher(Integer name,String age, Integer id){
        super(name,age,id);
    }
    private String s;
    private String s3 = "";
    public String introduce(){
        if(this.getClasses().size() == 0){
            s = str2;
        }else{
            for(practice10.Klass num:linkedList){
                if(s3 == ""){
                    s3 = "" + num.getNumber();
                }else{
                    s3 = s3 + ", "+ num.getNumber();
                }
            }
            s = str + s3 + ".";
        }
        return super.introduce() + s;
    }
    public Klass getKlass(){
        return klass;
    }
    private String s2;
    private int flag3 = 0;
    public String introduceWith(Student student){
        for(practice10.Klass num:linkedList){
            if(num.getNumber() == student.getKlass().getNumber()){
                flag3 = 1;
                break;
            }
        }
        if(flag3 == 0){
            s2 = "I don't teach " + student.getName();
        }else{
            s2 = "I teach " + student.getName();
        }
        return "My name is Tom. I am 21 years old. I am a Teacher. " + s2 +".";
    }
    public LinkedList<Klass> getClasses(){
        return linkedList;
    }
    private int kecheng;
    private boolean flag = false;
    public Boolean isTeaching(Student student){
        kecheng = student.getKlass().getNumber();
        for(practice10.Klass num:linkedList){
            if(num.getNumber() == kecheng){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
