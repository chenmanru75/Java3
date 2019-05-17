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
    public Student assignLeader(Student student){
        return student;
    }
    public Student getLeader(){
        return assignLeader(student);
    }
}
