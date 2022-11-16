import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();

        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println("Index position of 'Skye': " + scottishIslands.indexOf("Skye"));

        int indexSkye = scottishIslands.indexOf("Skye");
        System.out.println(indexSkye);
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        int size = scottishIslands.size();
        System.out.println(size);

        System.out.println("Number of islands: " + scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        System.out.println("Alphabetical order: " + scottishIslands);
//        9. Print out all the islands using a for loop
        System.out.println("----Using enhanced for loop----");
        for (String island : scottishIslands) {
            System.out.println(island);
        }

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        /* int list = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if list (i % 2 == 0);

            }
            list = numbers.get(i);}
            System.out.println( "Even numbers: " + list);
            */

        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
                System.out.println(evenNumbers);

//        2. Print the difference between the largest and smallest value

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        int diff = max - min;
        System.out.println(diff);

        System.out.println(Collections.max(numbers) - Collections.min(numbers));

//        3. Print True if the list contains a 1 next to a 1 somewhere.

        for (int i = 0; i < numbers.size() -1; i++) {
            if (numbers.get(i) == 1 && numbers.get(i+1) == 1) {
                System.out.println(true);
            }
        }

//        4. Print the sum of the numbers
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++)
            sum += numbers.get(i);
        System.out.println(sum);

        int sum1 = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.

        int sum2 = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) == 13 || numbers.get(i + 1) == 13)
                continue;
        }
            sum2 += numbers.get(i);
        System.out.println(sum2);
        }
}

       /* for (int i = 0; i < numbers.size(); i++) {
            if (i == 8) {
            continue;
        }
            sum += numbers.get(i);
        }
            System.out.println(sum);
    } */