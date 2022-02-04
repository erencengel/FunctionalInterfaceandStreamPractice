package day1;

import java.util.*;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> {
            if(number%2 == 0) return true;
            return false;
        };
        System.out.println(isEven.test(1000));
        System.out.println(isEven.test(1001));

        System.out.println("-----------------");


        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Java", "C#", "C#","C++"));
        //by Eren
        Predicate<String> isUniquee = p -> {
            int number=0;
            for(int i=0;i<list.size();i++){
                if(list.get(i).equals(p)) number++;
            }
            if(number==1) return true;
            return false;
        };
        System.out.println(isUniquee.test("Java"));
        System.out.println(isUniquee.test("C#"));
        System.out.println(isUniquee.test("C++"));
        //by Muhtar

        Predicate<String> isUnique = p -> Collections.frequency(list,p) == 1;
        boolean r2 = isUnique.test("C#");
        System.out.println(r2);

        for (String s : list) {
            if(isUnique.test(s)){
                System.out.println(s);
            }
        }

        System.out.println("-----------------");

        List<Integer> nums = new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,40,40,50,60,70,80));
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i)<40){
                nums.remove(i);
            }
        }
        System.out.println(nums);

        System.out.println("-----------------");
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,40,40,50,60,70,80));
        Iterator<Integer> iterator = nums2.iterator();
        while (iterator.hasNext()){
            if(iterator.next() < 40){
                iterator.remove();
            }
        }
        System.out.println(nums2);

        System.out.println("-----------------");
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(10,10,10,20,20,30,30,30,40,40,50,60,70,80));
        //removeif()
        //eren
        //nums3.removeIf(p -> p<40);
        //System.out.println(nums3);
        //muhtar
        Predicate<Integer> lessThan40 = p -> {
            if(p<40) return true;
            return false;
        };
        nums3.removeIf(lessThan40);
        System.out.println(nums3);


    }
}
