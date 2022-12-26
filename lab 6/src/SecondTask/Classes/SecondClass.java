package SecondTask.Classes;

import SecondTask.Interface.MyInterface;

import java.util.Objects;

public class SecondClass implements MyInterface {
    public final int count(int number) {
        int count = 0, i;
        while(!Objects.equals(number,1)) {
            i = 2;
            while(true) {
                if(number % i == 0) {
                  count++;
                  number /= i;
                  break;
                } else {
                    i++;
                }
            }
        }
        return count;
    }
}
