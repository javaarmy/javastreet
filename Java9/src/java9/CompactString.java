package java9;

import java.util.List;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

public class CompactString {
    public static void main(String... args) {
        
        long startTime = System.currentTimeMillis();
        String str = null;
        str.length();
         List<String> strings = IntStream.rangeClosed(1, 10_000_000)
                                         .mapToObj(Integer::toString).collect(toList());

        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Generated " + strings.size() + " strings in " + totalTime + " ms.");

        startTime = System.currentTimeMillis();

        String appended =  strings.stream().limit(10_000).reduce("",(l, r) ->l + r);

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Created string of length " + appended.length() + " in " + totalTime + " ms.");
    }
}
