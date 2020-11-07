//put imports you need here
import java.lang.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner line = new Scanner(System.in);
        List<String> wordsList = new ArrayList<>();
        wordsList.add(line.nextLine());
        wordsList.add(line.nextLine());
        wordsList.add(line.nextLine());

        ListIterator<String> iter = wordsList.listIterator(wordsList.size());
        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }
    }
}