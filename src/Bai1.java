import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Bai1 {
    public static void main(String[] args) {
        List<String> strings = List.of("Java", "", "Lambda", "Stream", "", "Functional");
        List<String> newStrings = new ArrayList<>();

        Predicate<String> nonEmptyPredicate = s -> !s.isEmpty();

        for (String str : strings ) {
            if (nonEmptyPredicate.test(str)) {
                newStrings.add(str);
            }
        }

        System.out.println(newStrings);
    }
}
