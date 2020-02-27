package Com.Java.best;

public class SumOfNumberDigit {
    public static void main(String[] args){
        int num =839028764;
        //char [] chars =num.
        int sum = 0;
        int remainder=0;
        while (num>0){
            remainder =num % 10;
            sum = sum + remainder;
            num =num / 10;

        }
        System.out.println(sum);
    }
}
