package java8;
/**
 * What is Lambda Expression?
 *  - Normally represents an anonymous or nameless functions.
 *  - Similar to anonymous inner classes.
 * why we need this?
 *  - In order to support Higher order functions 
 *    we need to pass methods as arguments
 *     and need to return methods as a result.
 *  - it simplifies and more cleaner,readable code.
 * who used it first?
 *  - In Lisp on 1958
 */

import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaExpression{
    
    static Predicate<String>  isNameInValid = new Predicate<String>() {

        @Override
        public boolean test(String t) {
            return t.startsWith("Mr") && t.length() <=10;
        }
    };

    public static void main( String... args) {
        Arrays.asList( "Mr Ganesh","Mr Shyam","Mr Rajesh")
         .removeIf( isNameInValid);

    }
}