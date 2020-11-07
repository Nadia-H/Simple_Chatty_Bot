//put imports you need here
import java.util.Scanner;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        int age = scanner.nextInt(); //
        String stageOfEdu  = scanner.next(); //
         int yearsOfExp = scanner.nextInt();
        String cuisinePref = scanner.next();
        System.out.print("The form for "+firstName+" is completed.");
        System.out.print(" We will contact you if we need a chef that");
        System.out.print(" cooks " +cuisinePref+" dishes.");
        
        
    }
}
