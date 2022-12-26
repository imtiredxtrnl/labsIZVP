package SecondTask.Classes;

import SecondTask.Interface.MyInterface;

import java.util.Objects;

public class FirstClass implements MyInterface {
    public final int count(int number) {
        int count = 0;
        while(!Objects.equals(number,0)){
            count++;
            number /= 10;
        }
        return count;
    }
}
