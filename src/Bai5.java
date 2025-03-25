import java.util.Arrays;
import java.util.List;

public class Bai5 {
    public static void main(String[] args) {
        List<String> strings1 = Arrays.asList("Alice", "Andrew", "Bob", "Anna", "Charles");
        List<String> strings2 = Arrays.asList("Anna", "Alexandra", "Ashton", "Alfred", "Ariana");

        System.out.println(countValidStrings(strings1));
        System.out.println(countValidStrings(strings2));
    }

    public static int countValidStrings(List<String> names) {
        int count = 0;
        for (String name : names) {
            if (name.startsWith("A") && name.length() >= 5) {
                count++;
            }
        }
        return count;
    }
}
