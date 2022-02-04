package day3;

import java.time.LocalDate;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class practice2 {

    public static void main(String[] args) {
        BiPredicate<String,String> isAnagram = (s1,s2) -> {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean equals = Arrays.equals(c1, c2);
            return equals;
        };

        System.out.println(isAnagram.test("eren", "aslıhan"));
        System.out.println(isAnagram.test("fiizk", "fizik"));

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2020,10,25));
        map.put("Jimmy", LocalDate.of(2019,10,25));
        map.put("Aaron", LocalDate.of(2018,10,25));
        map.put("Shay", LocalDate.of(2017,10,25));

        map.forEach((x,y) -> System.out.println(x + "-" + y));
        System.out.println(map);

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.forEach(n -> System.out.print(n*5 + " "));
        System.out.println();

        List<String> list1 = new ArrayList<>(Arrays.asList("Şerife","Eren","Alperen","Aslıhan"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,1,3,4));
        Map<Integer,String> mapp = new LinkedHashMap<>();
        BiFunction<List<Integer>,List<String>,Map<Integer,String>> creatingMap = (a,b) -> {
            for (int i = 0; i < a.size(); i++) {
                mapp.put(a.get(i),b.get(i));
            }
            return mapp;
        };
        creatingMap.apply(list2,list1).forEach((x,y) -> System.out.println(x + "-" + y));

        //get the palindrome names and print them
        List<String> words = new ArrayList<>(Arrays.asList("Java","Java","Anna","Level","Kayak","Phyton", "Bob"));
        words.stream().filter(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p))
                .forEach(p -> System.out.print(p + " "));
        System.out.println();

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Cybertek","School","James","Anna","Phyton"));
        //get all strings which covers "a", concetenate them and give back as just one result
        System.out.println(names.stream().filter(p -> p.contains("a")).reduce("", (x, y) -> x + "-" + y));

    }

}
