package hello;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static java.time.temporal.ChronoUnit.HOURS;

/**
 * Created by qiliao on 10/14/16.
 */
public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current local time is: " + currentTime);
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
        String strDate = "10-16-2016 01:11:52 EST";
        DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss zzz");
        long zdt  = ZonedDateTime.parse(strDate,dtf).toEpochSecond();
        System.out.println(zdt);
        String stopDate = "10-15-2016 23:11:53 EST";
        long stopzt  = ZonedDateTime.parse(stopDate,dtf).toEpochSecond();
        System.out.println(stopzt);
        long diff = zdt - stopzt;
        System.out.println((long)Math.ceil(diff / 3600.0));
    }
}
