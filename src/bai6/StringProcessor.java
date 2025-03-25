package bai6;

import java.util.List;

@FunctionalInterface
public interface StringProcessor {
    String processString(String input);

    default void printList(List<String> list) {
       for (String str : list) {
           System.out.println(str);
       }
    }
}
