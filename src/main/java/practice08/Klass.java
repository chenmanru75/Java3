package practice08;

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
    public Integer flag = 0;
    public void assignLeader(Student student){
        this.flag = 1;
        this.student = student;
    }
    public Student getLeader(){
        return student;
    }
}
