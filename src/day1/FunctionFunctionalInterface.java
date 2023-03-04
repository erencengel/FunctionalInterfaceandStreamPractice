package day1;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {
        Function<String,String> reverse = s -> {
            String result="";
            for(int i=s.length()-1;i>=0;i--){
                result+=s.charAt(i);
            }
            return result;
        };
        String myDaughter = reverse.apply("Aslıhan");
        System.out.println("myDaughter = " + myDaughter);

        System.out.println("--------------------------");

        //you are going to check the word that is given is palindrome or not in just 2 line of code.
        Function<String,Boolean> isPalindrome = s -> reverse.apply(s).equalsIgnoreCase(s);
        boolean bool = isPalindrome.apply("Aslıhan");
        System.out.println(bool);

        System.out.println("--------------------------");
        Function<int[],int[]> reverseIntArray = a -> {
            int[]result = new int[a.length];
            for (int i = 0, j=a.length-1; i < a.length; i++,j--) {
                result[j] = a[i];
            }
            return result;
        };
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = reverseIntArray.apply(arr1);
        System.out.println(Arrays.toString(arr2));

        Integer[] numbers = {1,2,3,4,5,6,7,1,2,3,4,5,6,7,8};
        numbers = Arrays.asList(numbers).stream().distinct().collect(Collectors.toList()).toArray(new Integer[0]);
        System.out.println(Arrays.toString(numbers));
    }

}
