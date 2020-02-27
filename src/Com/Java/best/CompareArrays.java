package Com.Java.best;

import java.util.Arrays;

public class CompareArrays {
    public static void main(String[] args){

//        int[] a ={1,3,5};
//        int[] b ={1,3,5};

        String[] a={"apple","bad","car"};
        String[] b={"apple","bad","car"};

        if(Arrays.equals(a,b)){
            System.out.println("Both the Arrays are EQUAL.");
        }
        else {
            System.out.println("Both the Arrarys are NOT EQUAL.");
        }
    }
}
