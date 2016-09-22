import java.util.Arrays;

public class Wriggle_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1, 5, 1, 1, 6, 4};
		Arrays.sort(array);
		for(int i=2;i<array.length;i++){
			if(i%2==0){
				int temp=array[i-1];
				array[i-1]=array[i];
				array[i]=temp;
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
