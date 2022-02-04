package day2;

import java.time.LocalTime;
import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionFunctionalInterface {

    public static void main(String[] args) {
        BiFunction<int[],int[], List<Integer>> addArraysToList = (a,b) -> {
            List<Integer> list = new ArrayList<>();
            for (int i : a) list.add(i);
            for (int i : b) list.add(i);
            return list;
        };
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9};
        List<Integer> nums = addArraysToList.apply(arr1, arr2);
        System.out.println(nums);

        System.out.println("--------------------------------");

        BiFunction<List<String>,List<Integer>, Map<String,Integer>> addListMap = (x,y) -> {
            Map<String ,Integer> map = new LinkedHashMap<>();
            for (int i=0;i<x.size();i++) {
                map.put(x.get(i),y.get(i));
            }
            return map;
        };
        List<String> list1 = new ArrayList<>();
        list1.add("Şerife");
        list1.add("Eren");
        list1.add("Alperen");
        list1.add("Aslıhan");
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        Map<String, Integer> apply = addListMap.apply(list1, list2);
        apply.forEach((k,v) -> System.out.println(v+"-"+k));
        System.out.println(apply);

    }

}
