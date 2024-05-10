package PrototypeAndRegistry;

public class Intelligent_Student extends Student {
    int iq;

    public Intelligent_Student(String name, int age, String University_Name, int iq)
    { //includes both parent and its own attributes
        super(name, age, University_Name);
        this.iq = iq;
    }

    public Intelligent_Student(Intelligent_Student original)
    {
        super(original); //this will call the patent constructor (student's copy constructor)
        iq = original.iq;
    }

    @Override
    public Intelligent_Student clone() {
        return new Intelligent_Student(this);//call the intelligent student copy constructor
    }
}
