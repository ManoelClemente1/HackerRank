package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        List<List<Integer>> arr = new ArrayList<>();


        for(int i = 0; i < arr.size(); i++){
            firstDiagonal =  firstDiagonal + arr.get(i).get(i);
        }

        for(int i = 0; i < arr.size(); i++){
            secondDiagonal += arr.get(i).get(arr.size() -(i + 1));

        }

        System.out.println(Math.abs(firstDiagonal - secondDiagonal));

    }

}
