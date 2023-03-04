package java_iq;

import java.util.*;

public class one {

    /*
     * get a string as "10 20 35 128, 3"
     * get all numbers one by one
     * create a new number by summing digits
     * do this for all of them
     * print it as a string ordering --> "1 2 3 8 11"
     */

    public static void main(String[] args) {
        System.out.println(new one().returnNumbersAsOrdered("128 2 3693 65 89 25 10"));
    }



    public String returnNumbersAsOrdered(String str){
        String result;
        String[] stringArray = str.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(stringArray));
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (String s : list) {
            list2.add(Integer.parseInt(s));
        }
        for (Integer integer : list2) {
            int num=0;
            String s = String.valueOf(integer);
            for (String s1 : s.split("")) {
                num+= Integer.parseInt(s1);
            }
        list3.add(num);
        }
        List<Integer> list4 = orderMaxToMin(list3);
        List<String> list5 = new ArrayList<>();
        for (Integer integer : list4) {
            list5.add(String.valueOf(integer));
        }
        result = list5.stream().reduce("",(x,y) -> x + " " + y);
        return result;
    }

    public List<Integer> orderMaxToMin(List<Integer>list){
        Integer[] array = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        Arrays.sort(array);
        return new ArrayList<>(Arrays.asList(array));
    }
}
