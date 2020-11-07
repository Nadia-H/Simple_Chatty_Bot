//put imports you need here
import java.util.*;
import java.lang.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        List<String> namesList = new ArrayList<String>();
        namesList.add(scanner.next());
        namesList.add(scanner.next());
        namesList.add(scanner.next());
        namesList.add(scanner.next());
        namesList.add(scanner.next());
        namesList.add(scanner.next());
        namesList.add(scanner.next());
        namesList.add(scanner.next());

        ListIterator<String> iter = namesList.listIterator(namesList.size());
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }
    }
}