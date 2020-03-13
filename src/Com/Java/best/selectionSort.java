public class selectionSort{
	public static void main(String []args){
		
		int array[]={7,9,3,6,4,1};
		int min=0;
		int n =array.length;
		for(int i=0;i<n-1;i++){
			int index=i;
			for(int j=i+1;j<n;j++){
				
				if(array[j]<array[index]){
					index =j;
					
				}
			}
			 min=array[index];
			array[index]=array[i];
			array[i]=min;
			
			
		}
		for(int k=0;k<n-1;k++){
			System.out.print(array[k]+" ");
		}
	}

	
}