package java_iq;

import java.util.*;

public class two {

    /*
     * In this challenge, we want to iterate through on the characters of the input string and check whether the number of the occurences
     * for each characters are equal. For instance, "abcde" is a valid string, on the other hand, "abcdeee" is not because count of 'e' is
     * 3, not 1 as the others.
     * Moreover, we have a chance to remove only one character from the string in order to make it valid. Think of a scenario: "xyzz" is
     * given to us and we should remove one of these 'z' characters. In this case, we can assume that the string is valid since each existing
     * characters exist only single time after the removal operation.
     * isValid() --> return true or false based on the string that is given
     */
    public static void main(String[] args) {
        System.out.println(new two().isValid("eren"));
        System.out.println(new two().isValid("alperen"));
        System.out.println(new two().isValid("zeynep"));
        System.out.println(new two().isValid("aaabbbbbbccddddd"));
        System.out.println(new two().isValid("aaaaaaaa"));
        System.out.println(new two().isValid("aaadddc"));
        System.out.println(new two().isValid("aaabbbcccd"));
        System.out.println(new two().isValid("aabbccdd"));
        System.out.println(new two().isValid("efgh"));
        System.out.println(new two().isValid("mumukkpp"));
        System.out.println(new two().isValid("pppenm"));
        System.out.println(new two().isValid("ekekua"));
    }

    public boolean isValid(String str){
        String name = str;
        String control = "";
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            int count = 0;
            count = str.length()-str.replace(str.substring(0,1),"").length();
            list.add(count);
            str = str.replace(str.substring(0,1),"");
        }
        System.out.println("str = " + str);
        if(list.stream().distinct().count() == 1) return true;
        for (int i = 0; i < name.length(); i++) {
            list.clear();
            control = name.substring(0,i)+name.substring(i+1);
            for (int i1 = 0; i1 < control.length();) {
                int count1 = 0;
                count1 = control.length()-control.replace(control.substring(0,1),"").length();
                list.add(count1);
                control = control.replace(control.substring(0,1),"");
            }
            if(list.stream().distinct().count() == 1) return true;
        }
        return false;
    }

    public static boolean isValidİhsanHoca(String str) {
        String str1 = str.toLowerCase();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < str1.length(); ) {
            String control = str1.substring(0, 1);
            int count = str1.length() - str1.replace(control, "").length();
            list.add(count);
            str1 = str1.replace(control, "");
        }


        if (list.stream().distinct().count() == 1) {
            return true;
        }

        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);

            List<Integer> list2 = new ArrayList<>();

            for (int j = 0; j < newStr.length();) {
                String control = newStr.substring(0, 1);
                int count = newStr.length() - newStr.replace(control, "").length();
                list2.add(count);
                newStr = newStr.replace(control, "");
            }

            if (list2.stream().distinct().count() == 1) {
                return true;
            }
        }
        return false;
    }
}
