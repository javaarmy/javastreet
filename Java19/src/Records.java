public class Records {


     //1. simplify representation of record variables
     record Point ( int x, int y){}
     //before
        static void printSum( Object o) {
            if( o instanceof Point p) {
                int x = p.x();
                int y = p.y();
                System.out.println( x+y);
            }
        }
        //after
        //names do not neet to be match with the names in record, here x,y is in declaration but used them as a,b
        static void printSumAfter( Object o) {
            if( o instanceof Point ( int a, int b)) {
                System.out.println( a+b);
            }
        }
     //2. representation or more complicated Object graphs
            
        enum Color{ RED, GREEN, BLUE}
        record ColoredPoint( Point p , Color c) {}
        record Rectangle( ColoredPoint upperLeft, ColoredPoint lowerRight ) {}
     
      static void printUpperColoredPoint( Rectangle r) {
        //appraoch 1
        if( r instanceof Rectangle(ColoredPoint ul, ColoredPoint lr)) {
            System.out.println(ul.c());
        }
        //simplified version of upperleft record
        if( r instanceof Rectangle( ColoredPoint( Point p , Color c),
                                    ColoredPoint lr    )) {
            System.out.println( c );
        }
        // more simplified version with var
        if( r instanceof Rectangle( ColoredPoint( var p, Color c),
                                    var lr )) {
            System.out.println( c );
        }
}
    public static void main(String[] args) {
        
    }
}