package java_iq;

public class three {

    /*

     */

    public double factorial(int a){
        if(a == 0) return 1;
        double sum = 1;
        for (int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }

    public double takeTheExponent(int[] array, int a){
        if(a == 0) return 1;
        double sum=1;
        for (int i = 1; i <= a; i++) {
            sum*=array[a];
        }
        return sum;
    }

    public double divideAndSum(int[] array){
        double sum = 0;
        int num = 0;
        int length = array.length;
        for (int i = 0; i < length; i++) {
            double aboveTheDenominator = takeTheExponent(array,num);
            double belowTheDenominator = factorial(num);
            sum+= aboveTheDenominator/belowTheDenominator;
            num++;
        }
        return sum;
    }



    public static void main(String[] args) {
        int[] array = {1,2,2,3,3,3,5,7,11,15};
        System.out.println(new three().divideAndSum(array));
    }



    //ya da...
    public static double ratioExponentialAndFactorial(int[] arr) {
        double result=0;
        double exponential = 0;
        double factorial = 1;

        for (int i = 0; i < arr.length; i++) {
            exponential = Math.pow(arr[i], i);
            if (i==0) {factorial=1;}
            else {
                factorial *= i;
            }
            result+=exponential/factorial;
        }
        return result;
    }

}
