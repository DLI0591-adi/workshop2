package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class program {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("adi", "", "aggarwal", " ", "aaaaa", "");
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.trim().isEmpty())
                .collect(Collectors.toList());
        System.out.println(nonEmptyStrings);
    }
}

