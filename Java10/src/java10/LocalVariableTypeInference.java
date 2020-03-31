package java10;

import java.util.ArrayList;

/**
 * How it is in other Lang's var x = expr only (like C#) var, plus val for
 * immutable locals (like Scala, Kotlin) var, plus let for immutable locals
 * (like Swift) auto x = expr (like C++) def x = expr (like Groovy) x := expr
 * (like Go) what we dont do?
 * 
 */

public class LocalVariableTypeInference{

    /**
     * ##Where we can use:
     *  - declaring local variables
     *  - including index variables of for-loops and
     *  - resource variables of the type-with-resources statement
     *  ## Where not to use:
     *  - fields
     *  - method parameters
     *  - method return types.
     *  - var x;
     * @param args
     */
    public static void main(String[] args) {
        var itsFirstVar = new ArrayList<String>();
    
    }

}