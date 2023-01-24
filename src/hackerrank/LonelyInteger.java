package hackerrank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {

    public static void main(String[] args) {

        List<Integer> a = Arrays.asList(1,2,3,4,3,2,1);

        int unique = 0;

        for(int b : a){
            unique ^= b;


        }
        System.out.println(unique);
    }
}
