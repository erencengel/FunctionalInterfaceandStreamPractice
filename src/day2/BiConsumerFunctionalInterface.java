package day2;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {

    public static void main(String[] args) {
        BiConsumer<String,Integer> printMultipleTimes = (x,y) -> {
            for (int i = 0; i < y; i++) {
                System.out.print(x + " ");
            }
            System.out.println();
        };
        printMultipleTimes.accept("Aslıhan",5);

        System.out.println("----------------------------");
        //employeeName & hireDate
        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2020,10,25));
        map.put("Jimmy", LocalDate.of(2019,10,25));
        map.put("Aaron", LocalDate.of(2018,10,25));
        map.put("Shay", LocalDate.of(2017,10,25));

        //this is the old way that we have implemented
        for (Map.Entry<String, LocalDate> each : map.entrySet()) {
            System.out.println(each.getKey() + ":" + each.getValue());
        }
        System.out.println("----------------------------");
        //forEach Method
        map.forEach((k,v) -> System.out.println(k + ":" + v));
        System.out.println("----------------------------");
        //print all employees who hired before 2019
        map.forEach((k,v) -> {
            if(v.getYear() < 2019) System.out.println(k + ":" + v);
        });


    }

}
