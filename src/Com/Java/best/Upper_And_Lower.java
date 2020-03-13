public class Upper_And_Lower{
	
	
	
	public static void upper()
	{
		String Upper ="I AM THE PRINCE";
		String reup =Upper.toLowerCase();
		System.out.println(reup);
		System.out.println(" ");
			
	}
	
	public static void lower()
	{
			
		String s1="hello string";  
		String s1upper=s1.toUpperCase();  
		System.out.println(s1upper);  
		System.out.println(" ");
	}
	
	public static void replace(){
		String Upper ="I AM THE PRINCE";
		String replace =Upper.replace(" ","");
		System.out.println(replace);
		System.out.print(" ");
	}
	
	public static void missingValue(){
		int sum=0;
		int sum1=0;
		int num []={2,3,4,5,6,7};
		for(int i=0;i<num.length;i++){
			 sum =sum+num[i];
		}
		for(int j=0;j<8;j++){
			sum1=sum1+j;
		}
		int rel=sum1-sum;
		System.out.println(rel);
	}
	
	public static void removespecialcharater(){
		String special ="/*263dhfahfHF087))%87136%**^£";
		special =special.replaceAll("[^a-zA-Z]","");
		System.out.println(special);
	}
	public static void revers(){
		String str="madam";
		StringBuffer sb =new StringBuffer(str);
		String a =sb.reverse();
		System.out.println(a);
		
	}
	public static void revers1(){
		String str="madam";
		
	}
	
	
	public static void main (String [] args)
	{
		Upper_And_Lower obj =new Upper_And_Lower();
		obj.upper();
		obj.lower();
		obj.replace();
		obj.missingValue();
		obj.removespecialcharater();
		obj.revers();
		
		
	} 
	
}