import java.util.*;
import java.text.*;

public class Result11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat formatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = formatterUS.format(payment);

        NumberFormat formatterIndia = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-IN"));
        String india = formatterIndia.format(payment);

        NumberFormat formatterChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = formatterChina.format(payment);

        NumberFormat formatterFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatterFrance.format(payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
