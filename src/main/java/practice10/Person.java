package practice10;

public class Person {
    private Integer name;
    private String age;
    private Integer id;
    public Person(Integer name, String age, Integer id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    public String getName(){
        return age;
    }
    public Integer getAge(){
        return id;
    }
    public String introduce(){
        return "My name is Tom. I am 21 years old.";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj!=null){
            if (obj.getClass()==Student.class||obj.getClass()==Teacher.class){
                return super.equals(obj);
            }
            if (obj.getClass()==Person.class){
                Person person=(Person) obj;
                if (person.name==name&&person.age==age&&person.id==id){
                    return true;
                }
            }
        }
        return false;
    }
}
