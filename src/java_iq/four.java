package java_iq;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four {

    public static void main(String[] args) {
        String str = "green3 blue5 orange2";
        removeNumbers(sortStrings(putIndexesToBeginning(str)));
    }

    static List<String> putIndexesToBeginning(String str){
        List<String> unorganizedList = new ArrayList<>();
        List<String> organizedList = new ArrayList<>();
        String[] s = str.split(" ");
        for (int i = 0; i < s.length; i++) {
            unorganizedList.add(s[i]);
        }
        for (int i = 0; i < unorganizedList.size(); i++) {
            String numberOfString = unorganizedList.get(i).substring(unorganizedList.get(i).length()-1, unorganizedList.get(i).length());
            String removeNumber = unorganizedList.get(i).replace(numberOfString,"");
            String organizedString = numberOfString + removeNumber;
            organizedList.add(organizedString);
        }
        return organizedList;
    }

    static List<String> sortStrings(List<String> list){
        Object[] objects = list.toArray();
        Arrays.sort(objects);
        List<Object> list1 = new ArrayList<>(Arrays.asList(objects));
        List<String> sortedList = new ArrayList<>();
        for (Object o : list1) {
            sortedList.add(o.toString());
        }
        return sortedList;
    }

    static void removeNumbers(List<String> list){
        List<String> listWithoutNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listWithoutNumbers.add(list.get(i).substring(1,list.get(i).length()));
        }
        String result = "";
        for (String s : listWithoutNumbers) {
            result+= s + " ";
        }
        System.out.println("result: " + result.trim());
    }
}
