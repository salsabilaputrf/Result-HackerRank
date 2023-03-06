import java.util.*;


public class Result8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            n++;
            System.out.println(n + " " + line);
        }
        scanner.close();
    }
}
