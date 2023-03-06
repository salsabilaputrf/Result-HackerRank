import java.io.*;
import java.text.*;
import java.util.*;

//  NOTE : Just work in java 7

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        SimpleDateFormat getDay = new SimpleDateFormat("EEEE");
        String dateInString = day + " " + month + " " + year;
        try
        {
            Date date = formatter.parse(dateInString);
            return getDay.format(date).toUpperCase();
            // System.out.println(formatter.format(date));
        }catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}

public class Result10 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
