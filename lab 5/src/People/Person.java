package People;

public class Person {
    private String firstName;
    private String secondName;
    private String age;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public Person(String firstName, String secondName, String age) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public void printInfo() {
        System.out.println("Name " + getFirstName() + " " + getSecondName() + ", age " + getAge());
    }
}
