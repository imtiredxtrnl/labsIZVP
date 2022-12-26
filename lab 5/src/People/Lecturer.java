package People;

public class Lecturer extends Person {
    private String faculty;
    private String salary;

    public String getFaculty() {
        return faculty;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }

    public Lecturer(String firstName, String secondName, String age, String faculty , String salary ) {
        super(firstName, secondName, age);
        this.faculty = faculty;
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println("Professor of " + getFaculty() + " " + getSecondName() +
        " " + getFirstName() + ", age: " + getAge() + ". Salary: " + getSalary());
    }
}
