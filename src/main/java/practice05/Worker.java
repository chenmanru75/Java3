package practice05;

public class Worker extends Person{
    private String str = " I am a Worker. I have a job.";
    public Worker(String name,Integer age){
        super(name,age);
        super.introduce();
    }
    public String introduce(){
        return super.introduce()+str;
    }
}
