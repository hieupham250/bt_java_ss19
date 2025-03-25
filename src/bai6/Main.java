package bai6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "lambda", "stream", "functional");
        StringProcessor processor = input -> input.toUpperCase() + " - TECHNICAL";
        List<String> processedList = new ArrayList<>();
        for (String str : strings) {
            processedList.add(processor.processString(str));
        }
        processor.printList(processedList);
    }
}
