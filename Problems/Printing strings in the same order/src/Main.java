import java.lang.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> wordsList = new ArrayList<String>();
        wordsList.add(scanner.nextLine());
        wordsList.add(scanner.nextLine());
        wordsList.add(scanner.next());
        wordsList.add(scanner.next());

        wordsList.forEach(words->System.out.println(words));

    }
}