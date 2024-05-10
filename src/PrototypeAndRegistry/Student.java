package PrototypeAndRegistry;

public class Student implements Cloneable{
    private String name;
    private int age;
    private String University_Name;
    public Student(String name, int age, String University_Name) {
        this.name = name;
        this.age = age;
        this.University_Name = University_Name;
    }
    //we need copy method + clone method to achieve prototype
    public Student(Student original) {
        this.name=original.name;
        this.age=original.age;
        this.University_Name= original.University_Name;
    }


    public Student clone()  {
        return new Student(this);
    }
}
