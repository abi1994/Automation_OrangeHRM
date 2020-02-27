package Com.Java.best;

public class StringReverse {
    public static void main(String[] args) {


        String InputString = "AblewasIereIsawElba";

        //--------------------method 1-------------------
        char[] chars = InputString.toCharArray();
        int length = chars.length;
        System.out.println("String Length is :" + length);
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

        //--------------method 2--------------

        System.out.println("\n----------------------------");
        String reverse ="";
        for (int i=length-1;i>=0;i--){
            reverse=reverse+InputString.charAt(i);
        }
        System.out.print(reverse);

        //--------------method 3--------------

        System.out.println("\n----------------------------");
        StringBuffer StringBuffer =new StringBuffer(InputString);
        System.out.print(StringBuffer.reverse());

        //--------------method 2--------------

        System.out.println("\n----------------------------");
        StringBuilder StringBuilder =new StringBuilder(InputString);
        System.out.print(StringBuilder.reverse());

    }

}
