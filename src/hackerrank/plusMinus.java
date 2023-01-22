package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class plusMinus {

    private static final Scanner scanner = new Scanner(System.in);

    static void plusMinus(List<Integer> arr) {

        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i : arr) {
            if (i > 0) {
                positive++;
            } else if (i < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        int total = arr.size();
        DecimalFormat formatter = new DecimalFormat("0.000000");
        System.out.println(formatter.format((double) positive / total));
        System.out.println(formatter.format((double) negative / total));
        System.out.println(formatter.format((double) zero / total));

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        plusMinus(arr);

        bufferedReader.close();
    }
}
