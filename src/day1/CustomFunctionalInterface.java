package day1;

public class CustomFunctionalInterface {

    public static void main(String[] args) {
        StringFunctions longestString = (s1,s2) -> {
            if(s1.length()>s2.length()){
                return s1;
            }else if(s2.length()>s1.length()){
                return s2;
            }else {
                return "same";
            }
        };

        // "java" , "C#"

        System.out.println(longestString.function("java","C#"));
        System.out.println(longestString.function("eren", "alperen"));

        System.out.println("---------------------");

        DataFunction<String> reverse = s -> new StringBuilder(s).reverse().toString();
        System.out.println(reverse.function("Alperen"));

        DataFunction<String> reverse2 = (s) -> {
            String neo="";
            for(int i=s.length()-1;i>=0;i--){
                neo+=s.charAt(i);
            }
            return neo;
        };
        System.out.println(reverse2.function("eren"));

        System.out.println("---------------------");

        DataFunction<Integer> cube = x -> x*x*x;
        System.out.println("cube.function(5) = " + cube.function(5));

        DataFunction2<String,Integer> dataFunction2 = (s,r) -> {
            if((r == Integer.parseInt(s))){
                return s + " equals to " + r;
            }else {
                return s + " is not equal to " + r;
            }
        };

        System.out.println(dataFunction2.function("3", 5));
        System.out.println(dataFunction2.function("3", 3));

    }

}
