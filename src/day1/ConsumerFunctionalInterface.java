package day1;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {
        Consumer<String> printThreeTimes = s -> System.out.println(s + " " + s + " " + s);
        printThreeTimes.accept("alperen");

        Consumer<ArrayList> printAll = arrayList -> System.out.println(arrayList);
        ArrayList<String> a = new ArrayList<String>();
        a.add("eren");
        a.add("alperen");
        a.add("şerife");
        a.add("aslıhan");
        printAll.accept(a);

        System.out.println("---------------------------");

        Consumer<List<String>> printEach = list -> {
            for (String s : list) {
                System.out.print(s + " ");
            }
            System.out.println();
        };

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("John","Shay","Breannna","Erick"));
        printEach.accept(names);

        System.out.println("---------------------------");

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Consumer<List<Integer>> listasMultipleTwo = list -> {
            for (Integer integer : list) {
                System.out.print(integer*2 + " ");
            }
            System.out.println();
        };
        listasMultipleTwo.accept(numbers);

        numbers.forEach(n -> System.out.print(n*3 + " "));

        System.out.println("---------------------------");

        List<String> elements = new ArrayList<>();
        elements.addAll(Arrays.asList("Java","Java","Cybertek","Phyton","Phyton"));

        List<String> duplicatedElements = new ArrayList<>();

        Predicate<String> isDuplicated = p -> Collections.frequency(elements,p) > 1;
        elements.forEach(s -> {
            if(isDuplicated.test(s)){
                if(!duplicatedElements.contains(s))
                    duplicatedElements.add(s);
            }
        });
        System.out.println(duplicatedElements);

        System.out.println("---------------------------");

        Consumer<String[]>printDescendingOrder = arr -> {
          Arrays.sort(arr);
          String[] neo = new String[arr.length];
          int j=0;
            for (int i = arr.length - 1; i >= 0; i--) {
                neo[j] = arr[i];
                j++;
            }
            System.out.println(Arrays.toString(neo));
        };

        //int[] array = {10,20,30,5,4,3,2,1,2,100,0};
        String[] array = {"A","B","C","D"};
        printDescendingOrder.accept(array);

    }

}

