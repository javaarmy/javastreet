public class Switch {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Pattern matching for switch 3rd prview
          Object object = new Object();

          // 1. now Switch can be used by instance check.
          String replaceInstanceOF =   switch (object) {
                case null -> "null";
                case Integer i -> "int";
                default -> "default";
                // A switch expression should have a default case
            };
            
            //2. case with when statement.
            String guardedpattern = switch(object) {
                case String s when s.length() == 1 -> "length1";
                case String s -> "anylenght";
                default -> "default";

            };
            // 3. patterns can dominate the other patterns as example below
            String guardedpattern2 = switch(object) {
                case String s -> "anylenght";
                // below gives compile time error "This case label is dominated by one of the preceding case label"
                // case String s when s.length() == 1 -> "length1";
                
                default -> "default";

            };
            //4. no fall through allowed when declaring a pattern variable
            switch(object) {
                case Character c : System.out.println( "character") ;
                //  there is no break statement in Character C and will give  compile error, Illegal fall-through to a pattern
                //case Integer i: System.out.println(  "an Integer" );
                default: System.out.println( "default");
            };

    }
}
