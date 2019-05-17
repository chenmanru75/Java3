package practice10;

public class Klass {
    private Integer klass;
    public Klass(Integer klass){
        this.klass = klass;
    }
    public Integer getNumber(){
        return klass;
    }
    public String getDisplayName(){
        return "Class 2";
    }
    Student student;
    public int flag = 0;
    public void assignLeader(Student student){
        if(flag2 == 1){
            this.flag = 1;
            this.student = student;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public Student getLeader(){
        return student;
    }
    private int flag2 = 0;
    public void appendMember(Student student){
        flag2 = 1;
    }
}
