package bai8;

import java.util.List;
import java.util.function.Predicate;

public interface ListProcessor {
    int sumOddNumbers(List<Integer> list);

    static void printList(List<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    default boolean checkOdd(List<Integer> list) {
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        for (Integer num : list) {
            if (isOdd.test(num)) {
                return true;
            }
        }
        return false;
    }
}
