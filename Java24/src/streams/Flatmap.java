package streams;

import java.util.List;
import java.util.stream.Stream;

public class Flatmap {
    public static void main(String[] args) {
        var lines = List.of("123", "456", "Hemasri", "789");

        // 1. filter only lines represent number.
        lines.stream().filter(line -> {
            try {
                Integer.parseInt(line);
                return true;
            } catch (NumberFormatException ne) {
                return false;
            }
        }).map(Integer::parseInt)
                .toList();
        // 2.parseInt called twice. so use flatmap to return elment of stream after return.
        lines.stream().flatMap( line -> {
            try {
                var i = Integer.parseInt(line);
                return Stream.of(i);
            }   catch( Exception e){
                return  Stream.empty();
            }
        }).toList();
        // 3. need to return always Stream , how to avoid? use Multimap
        lines.stream().mapMulti((line, downstream) -> {
            try{
                var i = Integer.parseInt(line);
                downstream.accept(i);
            }catch(NumberFormatException e) {

            }
        }).peek(System.out::println).toList();

    }

}
