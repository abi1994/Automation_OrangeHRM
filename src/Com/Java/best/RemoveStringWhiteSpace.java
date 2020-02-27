package Com.Java.best;

public class RemoveStringWhiteSpace {
    public static void main(String[] args){
        String str ="Able was I, ere I saw Elba";

        //----------method1----------
        String str1 ="";
        char[] chars =str.toCharArray();

        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' '){
                str1=str1+chars[i];
            }
        }
        System.out.print(str1);
    //-------------method 2----------------
        System.out.println("\n-----------------------");
        String str2="";
        for(int i=0;i<chars.length;i++){
            if(chars[i]!=' '){
                str2=str2+str.charAt(i);
            }
        }
        System.out.print(str2);
        //-------------method3-----------
        System.out.println("\n------------------");
        String str3 =str.replace(" ","");
        System.out.print(str3);

    }

}
