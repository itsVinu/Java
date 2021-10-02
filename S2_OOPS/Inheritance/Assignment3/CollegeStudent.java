class CollegeStudent extends Student{
    private String collegeName;
    private String year;

    public void setCollegeName(String c){
        collegeName = c;
    }
    public void setYear(String y){
        year = y;
    }

    public String getCollegeName(){
        return collegeName;
    }
    public String getYear(){
        return year;
    }


    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();
        Student std = new Student();
        CollegeStudent cs = new CollegeStudent();


        p.setName("Aakash");
        p.setDateOfBirth("9 Octobor 1998");

        t.setSalary(50000.0);
        t.setSubject("Mathematics");
        t.setName("Varun");
        t.setDateOfBirth("9 Octobor 1999");

        std.setStudentId(1213);
        std.setName("Vinay");
        std.setDateOfBirth("9 Octobor 1998");

        cs.setCollegeName("ADGITM");
        cs.setYear("fourth");
        cs.setStudentId(459);
        cs.setName("Aakash Gupta");
        cs.setDateOfBirth("9/10/1998");

        System.out.println("Name : "+p.getName()+" and DOB : "+p.getDateOfBirth());
        System.out.println(
            "Subject : "+t.getSubject()+
            " and Salary : "+t.getSalary()+
            "\nTeacher Name : "+t.getName()+
            " and Teacher DOB : "+t.getDateOfBirth()
        );
        System.out.println(
            "Student Name: "+std.getName()+
            "\nStudent DOB: "+std.getDateOfBirth()+
            "\nStudent Id: "+std.getStudentId()
        );
        System.out.println(cs.getName());
        System.out.println(cs.getCollegeName());
        System.out.println(cs.getYear());
        System.out.println(cs.getStudentId());
        System.out.println(cs.getDateOfBirth());

    }
}
