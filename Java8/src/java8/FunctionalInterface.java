package java8;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * what is FunctionalInterface
 * - Any interface with a SAM(Single Abstract Method) is a functional interface
 * why we need ?
 * - Functional Style Programming - Higher Order Functions
 *      - takes one or more functions as an arguments
 *      - returns a function as a result
 * how can we  implement this?
 *  - Interface with one abstract method by default is a FI.
 *  - an Interface annotated with @FunctionalInterface with a SAM is a functional interface
 *          . More than one abastract method leads to compile error
 *  - Existing classes
 *      - Runnable, Callable, Cloneable , Serializable,Comparable,Comparator    (Pure FI)
 * 
 *  - Predicate,Supplier,Consumer,Function
 */
public class FunctionalInterface {

    public static void main(String... args){
        Thread thread = new Thread(new Runnable(){
           public void run(){
               System.out.println( "Thread Run Method");
           }
        });

        
        Runnable runnable = new Runnable(){
        
            @Override
            public void run() {
                System.out.println( "Thread Run Method");
            }
        };

        Thread thread2 = new Thread(runnable);

        Consumer print = new Consumer<Long>() {

            @Override
            public void accept(Long t) {
             System.out.println( NumberFormat.getInstance(Locale.CANADA).format( t ));
            }
        };
        
        
    }

}