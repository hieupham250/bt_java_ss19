package bai7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListProcessor processor = new ListProcessorImpl();

        List<Integer> list1 = Arrays.asList(5, -2, 10, 0, -7, 3);
        List<Integer> list2 = Arrays.asList(5, 6, 7);

        ListProcessor.printList(list1);
        System.out.println(processor.containsNegative(list1) ? "Danh sách chứa số âm" : "Danh sách không chứa số âm");

        ListProcessor.printList(list2);
        System.out.println(processor.containsNegative(list2) ? "Danh sách chứa số âm" : "Danh sách không chứa số âm");
    }
}
