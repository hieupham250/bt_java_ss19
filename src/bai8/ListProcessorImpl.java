package bai8;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public int sumOddNumbers(List<Integer> list) {
        int sum = 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        for (Integer num : list) {
            if (isOdd.test(num)) {
                sum += num;
            }
        }
        return sum;
    }
}
