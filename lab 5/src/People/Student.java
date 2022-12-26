package People;

public class Student extends Person {
    private String group;
    private String numberOfDoc;

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public String getNumberOfDoc() {
        return numberOfDoc;
    }
    public void setNumberOfDoc(String numberOfDoc) {
        this.numberOfDoc = numberOfDoc;
    }

    public Student(String firstName, String secondName, String age, String group, String numberOfDoc) {
        super(firstName, secondName, age);
        this.group = group;
        this.numberOfDoc = numberOfDoc;
    }

    @Override
    public void printInfo() {
        System.out.println("Student of " + getGroup() + " " + getSecondName() + " "
        + getFirstName() + ", age: " + getAge() + ". Number of document: " + getNumberOfDoc());
    }
}