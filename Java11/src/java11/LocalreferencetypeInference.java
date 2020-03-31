package java11;

import java.util.Arrays;
import java.util.function.Predicate;
/**
 * use of var as the type of the local variable instead of the actual type.
 */
public class LocalreferencetypeInference{
    
    public static void main(String[] args) {
        
        Arrays.asList(1,2)
               .forEach((var element)-> System.out.println(element));

        //limitations:
        // we cannot use var for some parameters and skip for others
        // we cannot mix var with explicit types:
        
    }       
}