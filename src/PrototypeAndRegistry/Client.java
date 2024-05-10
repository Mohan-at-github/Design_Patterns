package PrototypeAndRegistry;

import java.util.Random;

public class Client {
    public static final String STUDENT_KEY="STUDENT";
    public static final String INTELLIGENT_STUDENT_KEY="INTELLIGENT_STUDENT";
    public static void main(String[] args) {
        setupRegistry();
        Student student=getstudent();
        Student clonedStudent=student.clone();
        //how to get a prototype object from registry
        //go to student registry by create object of it
        StudentRegistry studentRegistry = StudentRegistry.getInstance();
        //get the object using kwy
        Intelligent_Student intelligentStudent=(Intelligent_Student) studentRegistry.get(INTELLIGENT_STUDENT_KEY);
        //cloning the prototype object to our object
        Intelligent_Student clonedIntelligentStudent=intelligentStudent.clone();

    }
    public static void setupRegistry() {
        StudentRegistry studentRegistry = StudentRegistry.getInstance();
        Student prototypeStudent = new Student("mohan", 25, "Reva");
        Intelligent_Student prototypeIntelligentstudent = new Intelligent_Student("lohith", 23, "DSU", 20);
        studentRegistry.register(STUDENT_KEY, prototypeStudent);
        studentRegistry.register(INTELLIGENT_STUDENT_KEY, prototypeIntelligentstudent);
    }
    public static Student getstudent()
    {
        Random random = new Random();
        int n = random.nextInt();
        if (n % 2 == 0) {
            return new Student("ABC", 20, "Reva");
        } else
            return new Intelligent_Student("BCD", 21, "Christ", 10);
    }
}
