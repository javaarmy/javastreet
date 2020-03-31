package java9;

import java.util.stream.Stream;

/**
 * Java 9 introduced 4 new methods to streams to support additional features
 * takewhile(),dropWhile(),ofNullable(),iterate(),of()
 * 
 */
public class Streams{
    public static void main(String[] args) {
        Stream.of(2,4,6,7,8,9,20,22,24).takeWhile(i -> i%2==0)
        .forEach( i-> System.out.println(i) );

    }
}