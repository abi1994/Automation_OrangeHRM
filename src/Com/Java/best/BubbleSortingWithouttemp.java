public class BubbleSortingWithuouttemp{
	public static void main(String []args){
		int Array[]={3,1,6,9,2,4,8};
		
		for(int i=0;i<Array.length-1;i++){
			for(int j=0;j<Array.length-1;j++){
				if(Array[j]>Array[j+1]){
					Array[j+1]=Array[j+1]+Array[j];
					Array[j]=Array[j+1]-Array[j];
					Array[j+1]=Array[j+1]-Array[j];
		
		//System.out.print(""+Array[i]);
		}
		
		/*else{
			System.out.print(""+Array[j]);
		}*/
		//System.out.print(Array[j]);
		}
		}
		for(int k=0;k<Array.length-1;k++){
			System.out.print(Array[k]);
		}
}
}