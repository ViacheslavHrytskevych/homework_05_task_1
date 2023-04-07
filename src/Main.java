import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String word = "Greek";

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("Greek");
        list.add("was");
        list.add("crossing");
        list.add("a");
        list.add("river");
        list.add("and");
        list.add("saw");
        list.add("a");
        list.add("Greek");
        list.add("in");
        list.add("the");
        list.add("river");
        list.add("with");
        list.add("a");
        list.add("crawfish");

        countOccurance(list, word);
    }

    public static void countOccurance(List<String> list, String word) {
        int count = 0;
        for (String str : list) {
            if (str.equals(word)) {
                count++;
            }
        }
        System.out.println("The word '" + word + "' occurs " + count + " times in the list.");
    }
}
