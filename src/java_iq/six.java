package java_iq;

public class six {

    //how to remove tags from a string
    //<p><a>someString</p> --> someString
    public String getOnlyContext(String str){
        return str.replaceAll("<.*?>", "");
    }

    public static void main(String[] args) {
        six s = new six();
        System.out.println(s.getOnlyContext("<p><a>someString</p>"));
    }

}
