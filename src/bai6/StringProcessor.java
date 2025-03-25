package bai6;

import java.util.List;

@FunctionalInterface
public interface StringProcessor {
    String processString(String input);

    default void printList(List<String> list) {
       for (String s : list) {
           System.out.println(s);
       }
    }
}
