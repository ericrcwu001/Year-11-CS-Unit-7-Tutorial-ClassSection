public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount = 1;

    public Student(String firstName, String lastName, int age, int yearLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        this.id = studentCount++;
    }

    public int getId() {return id;}
    public int getAge() {return age;}
    public String getLastName() {return lastName;}
    public String getFirstName() {return firstName;}
    public int getYearLevel() {return yearLevel;}
    public int getStudentCount() {return studentCount;}

    public void setAge(int age) {this.age = age;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setYearLevel (int yearLevel) {this.yearLevel = yearLevel;}
    public void setId(int id) {this.id = id;}

    public boolean equals(Student student) {
        if (firstName.compareTo(student.getFirstName()) == 0 &&
                lastName.compareTo(student.getLastName()) == 0 && age == student.getAge() &&
                yearLevel == student.getYearLevel()) return true;
        return false;
    }

}
