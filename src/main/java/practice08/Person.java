package practice08;

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

    private Person(){}
    private static Person p = new Person();
    public static Person getInstance(){
        return p;
    }

}
