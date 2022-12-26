import People.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person basicPerson = new Person("Ivan","Bannyk","19");
        Person studentPerson = new Student("Ivan","Bannyk","19","K19.1","17092");
        Person lecturePerson = new Lecturer("Ivan","Bannyk","19", "programming","10000");
        ArrayList<Person> myArrayForTest = new ArrayList<Person>();

        myArrayForTest.add(basicPerson);
        myArrayForTest.add(studentPerson);
        myArrayForTest.add(lecturePerson);

        for(Person p:myArrayForTest) {
            if(p != null) {
                p.printInfo();
            } else if (p instanceof Student) {
                Student s = (Student) p;
                s.printInfo();
            } else if (p instanceof Lecturer) {
                Lecturer l = (Lecturer) p;
                l.printInfo();
            }
        }
    }
}