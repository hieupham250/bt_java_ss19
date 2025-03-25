package bai8;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 7, 10, 13, 6, 3);
        ListProcessor processor = new ListProcessorImpl();
        int sumOdd = processor.sumOddNumbers(numbers);
        System.out.println("Tổng các số lẻ: " + sumOdd);
        boolean hasOdd = processor.checkOdd(numbers);
        if (hasOdd) {
            System.out.print("Các số lẻ trong danh sách: ");
            ListProcessor.printList(numbers);
        } else {
            System.out.println("Không có phần tử lẻ");
        }
    }
}
