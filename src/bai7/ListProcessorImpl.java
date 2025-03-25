package bai7;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public boolean containsNegative(List<Integer> list) {
        Predicate<Integer> isNegative = num -> num < 0;
        for (Integer num : list) {
            if (isNegative.test(num)) {
                return true;
            }
        }
        return false;
    }
}
