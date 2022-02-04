package day1;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

    public static void main(String[] args) {
        Supplier<String> returnCybertek = () -> "Cybertek";
        System.out.println(returnCybertek.get());

        Supplier<int[]> returnIntArray = () -> {
            int[] array = new int[5];
            for (int i=0; i<array.length;i++){
                array[i] = new Random().nextInt(1000);
            }
            return array;
        };
        System.out.println(Arrays.toString(returnIntArray.get()));

        System.out.println("--------------------");

        Supplier<Double> returnDecimal = () -> new Random().nextDouble();
        System.out.println(returnDecimal.get());

    }

    }


