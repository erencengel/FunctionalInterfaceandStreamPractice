package java_iq;

import java.util.Arrays;
import java.util.List;

public class five {

    public static void main(String[] args) {

    }

    String x = "(";
    String y = ")";

    public String changeCharacters(String str){
        return str.replace(x,"x").replace(y,"y");
    }

    public boolean isOdd(int num){
        if(num%2 == 1) return true;
        return false;
    }

    public boolean checkFirstCharacterIsValid(String s){
        return changeCharacters(changeCharacters(s).substring(0,1)).equals("y");
    }

    /*public List<String> getStringAsList(String str){
        String[] split = str.split("");
        List<String> strings = Arrays.asList(split);

    }*/

}
