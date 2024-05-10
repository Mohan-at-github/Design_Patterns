package Builder;

public class Client {
    public static void main(String[] args) {
        //1. hey student give me builder object of you
      // Builder builder = Student.getBuilder();

       //2. set value to attributes of builder object
//        builder.setName("Mohan");
//        builder.setAge(20);
//        builder.setGradyear(2021);
//        builder.setId(1);
//        builder.setPsp(75.0);
//        builder.setUnversityName("Reva");

        //hey builder, create a student object
       //Student s=Builder.build();

        //all in one go
        Student s1=Student.getBuilder()//1. hey student give me builder object of you
                //2. set value to attributes of a builder object
                .setAge(20) //return type of this method is Builder
                .setGradyear(2021)
                .setPsp(76)
                ///hey builder, create a student object
                .build();

        //Student student = new Student(builder);
        System.out.println(s1);
    }
}
