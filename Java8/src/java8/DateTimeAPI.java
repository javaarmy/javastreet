package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * What is it? 
 * - New Date Time API with 3 core ideas 
 * - Immutable value classes 
 * - all core classes are immutable 
 * - Domain Driven Design - offers long-term benefits around clarity and understandability,
 * - Separation of chronologies 
 * -  work with different calendaring systems(Japan, Thailand) 
 * Why we need this? -
 * Existing classes are'nt thread safe(Date, SimpleDateFormatter) 
 * - Poor API Design ,
 *  For example, years in java.util.Date start at 1900, months start at 1, a
 *      nd days start at 0—not very intuitive. 
 * Who did this? - Joda-Time (Stephen Colebourne) and Oracle, under JSR 310
 */
public  class DateTimeAPI
{
    public static void createObjects(){
        LocalDate date = LocalDate.now();
        LocalDateTime datetime= LocalDateTime.of(2020, 1, 1, 10, 10);
        LocalTime localTime= LocalTime.parse("10:10");
        
    }

    public static void newclasses()
    {
     
        //Period - To obtain the difference between two dates:
        Period diffInDays = Period.of(10, 10, 10);
        LocalDate startDateInclusive = LocalDate.now();
        LocalDate endDateExclusive = LocalDate.parse("2020-30-10");
        Period.between(startDateInclusive, endDateExclusive);
        
        Duration duration = Duration.ofHours(2).ofSeconds(30);
    }
    public static void convertTo(){

        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.toLocalDate();
        localDateTime.toLocalTime();
    }
    public static void zonedDates(){
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault() );
        ZonedDateTime.parse("2020-05-03T10:15:30+01:00[Europe/Paris]");
    }

    public static void formatter(){
        LocalDate anotherSummerDay = LocalDate.of(2016, 8, 23);
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherSummerDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherSummerDay));
        //DateTimeFormatter.ofPattern(pattern)
    }
    public static void ChronoDates(){
        //#TODO
    }
    public static void main(String[] args) {
        System.out.println( "test");
    }

}