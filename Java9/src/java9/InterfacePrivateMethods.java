package java9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;

/**
 * Shares Common code between non-abstract methods in private.
 * 
 */
public class InterfacePrivateMethods {
    public static void main(String... args) {
        
        List<String> list = new ArrayList<>();
        // Basic Runnable implementation
        Thread basicThread = new Thread(new Runnable() {
            public void run() {
                System.out.println(" Inside Basic Thread");
            }
        });

        
        basicThread.run();

        // using lambda expression
        Thread t = new Thread(() -> System.out.println(" Inside Thread"));
        t.run();

        // basic list iterator
        for (String str : list) {
            System.out.println(str);
        }

        list.forEach((item) -> System.out.println(t));
        // 1. new method introduced to use of lambda expression
        // 2. List has many impplementation in collections framework and also in 3rd
        // party libraries
        // 3. Introduced default methods , to provide backward compatibility
        // check following link for more information
        // https://m.youtube.com/watch?v=GphO9fWhlAg
        System.out.println(new DateUtil() {

            @Override
            public String getDateinCanada() {
                // TODO Auto-generated method stub
                return DateUtil.super.getDateinCanada();
            }


            
        
        });
     
    }
}


interface DateUtil{
    public  static String getDateinUS(){
        return getDateinLocale( new Locale("en","US"));
    }

    public default  String getDateinCanada(){
        return getDateinLocale(new Locale( "en", "CA"));
    }

    private static String getDateinLocale(Locale locale){
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().toFormatter(locale);
        return LocalDate.now().format(formatter);
    }
}
