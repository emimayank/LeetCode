import java.util.Arrays;

class Odd_number_finder{
	public static void main(String args[]){
		int array[]={1, 6,1,9,10, 3, 3,3, 4, 5, 7, 1, 1, 1,1};
		int counter=1;
		Arrays.sort(array);
		for(int i=0;i<array.length-1;i++){
			if(array[i]==array[i+1]){
				counter=counter+1;
			}
			else{
				if((counter%2)==1){
					System.out.println(array[i]);
				}
				counter=1;
			}
		}
		
	}
}