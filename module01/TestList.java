package module01;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        System.out.println("--- Testing list example from Canvas ---");
        List<String> list = new ArrayList<String>();
        list.add("A" ); // list is now { "A"}, method returns boolean
        printList(list);
        list.add("C" ); // list is now { "A", "C"}
        printList(list);
        // list.add("B", "1" ); // list is now { "A", "B", "C"}
        // error corrected
        list.add(1, "B"); // list is now { "A", "B", "C"}
        printList(list);
        System.out.println("| " + list.get(2)); // returns { "B"}
        printList(list);
        list.remove(0); // list is now { "B", "C"}
        printList(list);
        System.out.println("--- End testing list example from Canvas ---");
    }
    public static void printList(List<String> aList) {
        // let us print all the elements available in list
        for (String s : aList) {
            System.out.print("| " + s);
        }
        System.out.println("---");
    }
}