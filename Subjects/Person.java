package Subjects;

public class Person {
    private String name;
    private int age;
    public Person() {
        name = "Unknown";
        age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}

