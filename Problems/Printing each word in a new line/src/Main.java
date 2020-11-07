import java.util.*;
import java.lang.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner line = new Scanner(System.in);
       List <String> phrasesList = new ArrayList<>();
       phrasesList.add(line.next());
        phrasesList.add(line.next());
        phrasesList.add(line.next());
        phrasesList.add(line.next());
        phrasesList.add(line.next());

        for (String word:
             phrasesList) {
            System.out.println(word);
        }
    }
}