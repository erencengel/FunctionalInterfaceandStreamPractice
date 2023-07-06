package day3;

import java.util.Arrays;

public class practice3 {

    public static void main(String[] args) {

        getStrings("Eren", "Alperen", "Şerife", "Aslıhan");

    }

    public static void getStrings(String...str){
        System.out.println("str.length = " + str.length);
        System.out.println("Arrays.toString(str) = " + Arrays.toString(str));
        for (int i = 0; i<str.length;i++){
            System.out.println("str[i] = " + str[i]);
        }
        Arrays.stream(str).forEach(n -> System.out.println(n+ " this is varargs"));
    }

}
