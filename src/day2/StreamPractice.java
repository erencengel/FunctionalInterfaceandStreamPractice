package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        //stream itself is not a datastructure but mostly it works with with the datas
        //it is a collection of data
        //it is a function
        //Stream is like a shortcut all of these loops, logics etc.
        //this new design is made by Eren C.

        //map() -- it is used in order to alter some changes and create a new list from the current one
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); //stream is unable to change list
        //multiply with 3 per number
        List<Integer> list2 = list.stream().map(e -> e*3).collect(Collectors.toList());
        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);
        //add 5 all numbersThatAreDividingto3 which are multiplied with 3
        List<Integer> list3 = list.stream().map(a -> (a*3)+5).collect(Collectors.toList());
        System.out.println("list3 = " + list3);
        //add 5 to every single odd numbersThatAreDividingto3 in the list
        List<Integer> list4 = list.stream().map(n -> {
            if(n%2==1) return n+5;
            return n;
        }).collect(Collectors.toList());
        System.out.println("list4 = " + list4);

        System.out.println("----------------------------------------------");

        //filter() -- used to filter current list based on the needments
        List<Integer> numbersThatAreDividingto3 = list.stream().filter(p -> p%3 == 0).collect(Collectors.toList());
        System.out.println("numbersThatAreDividingto3 = " + numbersThatAreDividingto3);

        //divide and multiply orderly
        List<Integer> numbersThatAreDividingto3thanMultiply5 = list.stream().filter(p -> p%3 == 0).map(r -> r*5).collect(Collectors.toList());
        System.out.println("numbersThatAreDividingto3thanMultiply5 = " + numbersThatAreDividingto3thanMultiply5);

        System.out.println("----------------------------------------------");

        //skip() -- used to skipped some elements according to number that is given
        List<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("John","Jimmy","James", "Breanna","Shay","Josh"));
        List<String> skippedStudents = students.stream().skip(3).collect(Collectors.toList()); //it is going to skip first 3 elements
        System.out.println("skippedStudents = " + skippedStudents);
        System.out.println("---");
        // skip the first 3 elements and print them one by one
        students.stream().skip(3).forEach(x -> System.out.println(x));
        System.out.println("---");
        //skip the 3 elements, convert them to uppercase Strings and print
        students.stream().skip(3).map(x -> x.toUpperCase()).forEach(y -> System.out.println(y));
        System.out.println("---");
        //skip the 3 elements, convert them to uppercase Strings, take first and last characters and print
        students.stream().skip(3).map(x -> x.toUpperCase()).map(x -> x.substring(0,1) + x.substring(x.length()-1,x.length())).forEach(y -> System.out.println(y));

        System.out.println("----------------------------------------------");

        //distinct() -- used to avoid to duplicates
        Integer[] array = {1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6};
        //Arrays.asList(...can be given any array...) --> used to convert it to a List
        array = Arrays.asList(array).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------------------------------");

        //limit() -- skip and limit methods are opposite, used to limit in a certain point the list
        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        nums.stream().limit(7).forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.println("----------------------------------------------");

        //reduce() -- used to remove elements based on the orders
        List<Integer> listforReduceMethod = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        int result = listforReduceMethod.stream().filter(p -> p%2 != 0).reduce(0,(x,y) -> x+y);
        System.out.println("result = " + result);
        // identity or that is called accumulator in other way will be added to result automatically
        // suppose that you pick 5 as identity, then it will be added to result and result will be +5
        int result2 = listforReduceMethod.stream().filter(p -> p%2 == 0).reduce(5,(x,y) -> x+y);
        System.out.println("result2 = " + result2);
        //get the palindrome names and print them
        List<String> words = new ArrayList<>(Arrays.asList("Java","Java","Anna","Level","Kayak","Phyton", "Bob"));
        String palindromes = words.stream().filter(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p))
                .reduce("",(x,y) -> x+ " "+ y);
        System.out.println("palindromes = " + palindromes);

        System.out.println("----------------------------------------------");

        //allMatch() -- used to provide a verification for all elements at one shot..any of them is matched..true or false
        List<Integer> listforAllMatchMethod = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean allEven = listforAllMatchMethod.stream().allMatch(p -> p%2 == 0); // --> it will be return as false because not every one of them is even
        System.out.println("allEven = " + allEven);
        boolean lessThan11 = listforAllMatchMethod.stream().allMatch(p -> p<11); // --> it will return as true because all of elements are smaller than 11
        System.out.println("lessThan11 = " + lessThan11);
        boolean eitherOddoreven = listforAllMatchMethod.stream().allMatch(p -> p%2 == 0 || p%2 != 0);
        System.out.println("eitherOddoreven = " + eitherOddoreven);

        System.out.println("----------------------------------------------");

        //anyMatch() -- used to provide a verification for some specific elements based on the condition that is given
        // at one shot..none of them is not matched..true or false
        List<Integer> listforAnyMatchMethod = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean t1 = listforAnyMatchMethod.stream().anyMatch(p -> p>5 && p<9); //to get true, it is enough to get at least one element that is suitable for condition
        System.out.println("t1 = " + t1); // means that there is at least one element that is covered by condition

        //reduce() method gives you just one value at result, not a list or something like that
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Cybertek","School","James","Anna","Phyton"));
        //get all strings which covers "a", concetenate them and give back as just one result
        String concetenationNames = names.stream().filter(p -> p.contains("a") || p.contains("A")).reduce("",(x,y) -> x+ "--" +y);
        System.out.println("concetenationNames = " + concetenationNames);

    }

}
