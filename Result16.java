import java.util.*;


public class Result16 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

    
        /* Declare second integer, double, and String variables. */
        int newi;
        double newdouble;
        String news;
        /* Read and save an integer, double, and String to your variables.*/
        newi = scan.nextInt();
        newdouble = scan.nextDouble();
        news = scan.nextLine();
       if (news.isEmpty()){
           news = scan.nextLine();
       }
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + newi);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + newdouble);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + news);

        scan.close();
    }
}
