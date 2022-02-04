package day3;

import day1.DataFunction;
import day1.DataFunction2;
import day1.DataFunction3;
import day1.StringFunctions;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class practice {

    public static void main(String[] args) {
        StringFunctions mergeTwoString = (str1,str2) -> str1 + "-" + str2;
        System.out.println(mergeTwoString.function("eren", "aslıhan"));
        StringFunctions getFirstandLast = (s1,s2) -> {
            return s1.charAt(0) + "-" + s1.charAt(s1.length()-1);
        };
        System.out.println(getFirstandLast.function("Aslıhan","Eren"));

        DataFunction<Integer> multiplywith5 = x -> 5*x;
        System.out.println(multiplywith5.function(10));

        DataFunction<String> reverse = s -> {
            return new StringBuilder(s).reverse().toString();
        };
        System.out.println(reverse.function("Aslıhan"));

        DataFunction3<String[],String> coverOrNot = (arr, s) -> {
            for (String s1 : arr) {
                if(s1.equals(s)) return true;
            }
            return false;
        };
        String[] array = {"Eren","Aslıhan", "Şerife", "Alperen"};
        System.out.println(coverOrNot.function(array, "Aslıhan"));
        System.out.println(coverOrNot.function(array, "Aslı"));

        Predicate<Integer> isEven = p -> p%2==0;
        System.out.println(isEven.test(100));
        System.out.println(isEven.test(101));

        List<String> programmingLanguages = new ArrayList<>(Arrays.asList("Java","C#","C#","C++"));
        Predicate<String> isUnique = p -> Collections.frequency(programmingLanguages,p) == 1;
        System.out.println(isUnique.test("Java"));
        System.out.println(isUnique.test("C#"));

        List<Integer> preNums = new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,40,40,50,60,70,80));
        List<Integer> preNumsNeo = new ArrayList<>();
        preNums.removeIf(p -> p<50);
        System.out.println(preNums);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.forEach(n -> System.out.print(5*n+5 + " "));
        System.out.println();

        Supplier<int[]> returnElements = () -> {
            int[] array1 = new int[5];
            for (int i=0;i<array1.length;i++){
                array1[i] = new Random().nextInt(100);
            }
            return array1;
        };
        System.out.println(Arrays.toString(returnElements.get()));

        Function<String,String> reversee = s -> new StringBuilder(s).reverse().toString();
        Function<String,Boolean> isPalindrome = s -> reversee.apply(s).equalsIgnoreCase(s);
        System.out.println(isPalindrome.apply("eren"));
        System.out.println(isPalindrome.apply("radar"));

    }

}
