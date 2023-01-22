package hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static void main(String[] args) throws ParseException {



        String time = "07:05:45PM";
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ssa");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = parseFormat.parse(time);
        System.out.println(displayFormat.format(date));




    }
}
