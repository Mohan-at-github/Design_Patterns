//package Builder;
//
//public class Builder {
//    private int id;
//    private String name;
//    private int age;
//    private double psp;
//    private int gradyear;
//    private String UnversityName;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getUnversityName() {
//        return UnversityName;
//    }
//
//    public Builder setUnversityName(String unversityName) {
//        UnversityName = unversityName;
//        return this;
//    }
//
//    public int getGradyear() {
//        return gradyear;
//    }
//
//    public Builder setGradyear(int gradyear) {
//        this.gradyear = gradyear;
//        return this;
//    }
//
//    public double getPsp() {
//        return psp;
//    }
//
//    public Builder setPsp(double psp) {
//        this.psp = psp;
//        return this;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public Builder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Student build()
//    {
//        if(gradyear<2021)
//        {
//            throw new IllegalArgumentException();
//        }
//        return new Student(this);
//    }
//}
