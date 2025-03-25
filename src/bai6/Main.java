package bai6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "lambda", "stream", "functional");
        StringProcessor processor = input -> input.toUpperCase() + " - TECHNICAL";
        List<String> processedStrings = strings.stream()
                .map(processor::processString)
                .toList();
        processor.printList(processedStrings);
    }
}
