import java.lang.reflect.Array;
import java.util.Arrays;

public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]={1,1,2,3,5,6,2,7,2,9,2,10,2,2,2,1,2,2,2,10,10},var=0;
		//int nums[]={3,2,3},var=0;
		Arrays.sort(nums);
		int counter=1;
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]==nums[i+1]){
				counter++;
				var=nums[i];
			}
			else{

				if(counter>(nums.length/2)){
					System.out.println(nums[i]);
					//return nums[i];

				}
				counter=1;
			}
		}
		if(counter==nums.length ||counter>nums.length/2){
			System.out.println(var);
		}
		//return -1;
	}

}
