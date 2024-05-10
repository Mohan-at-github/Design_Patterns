package Builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private double psp;
    private int gradyear;
    private String UnversityName;

    private Student(Builder builder) {
        //validation of attribute while creating an object from builder object
       /* if(builder.getGradyear()<2021)
        {
            throw new IllegalArgumentException();
        }
        */
        //more validation we can do here
        // then assign values to student attributes from builder attributes.
        this.age=builder.getAge();
        this.name=builder.getName();
        this.gradyear=builder.getGradyear();
        this.psp=builder.getPsp();
        this.UnversityName=builder.getUnversityName();
    }
    //hey student, create your own builder class by your self instead by other classn
    public static Builder getBuilder(){

        return new Builder();
    }

    /* not happy solution
    public Student (int id, String universityName, int grad_year, int age, double psp, String name) {
      //validation
        //setting values
    }
     */

   static class Builder {
        private int id;
        private String name;
        private int age;
        private double psp;
        private int gradyear;
        private String UnversityName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUnversityName() {
            return UnversityName;
        }

        public Builder setUnversityName(String unversityName) {
            UnversityName = unversityName;
            return this;
        }

        public int getGradyear() {
            return gradyear;
        }

        public Builder setGradyear(int gradyear) {
            this.gradyear = gradyear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student build()
        {
            if(gradyear<2021)
            {
                throw new IllegalArgumentException();
            }
            return new Student(this);
        }
    }
}
