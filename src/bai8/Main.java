package bai8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(5, 7, 10, 13, 6, 3);
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8);
        ListProcessor processor = new ListProcessorImpl();
        int sumOdd = processor.sumOddNumbers(numbers);
        System.out.println("Tổng các số lẻ: " + sumOdd);
        boolean hasOdd = processor.checkOdd(numbers);
        if (hasOdd) {
            System.out.print("Các số lẻ trong danh sách: ");
            for (Integer num : numbers) {
                if (num % 2 != 0) {
                    System.out.print(num + " ");
                }
            }
        } else {
            System.out.println("Không có phần tử lẻ");
        }
    }
}
