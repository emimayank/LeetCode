import java.util.Arrays;

public class Array_Contains_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[]={0, 2, 1, 8, 7, 6, 5, 2, 9, 0, 5, 3, 2, 1};
		int nums[]={1,2,3,4};
		boolean b=containsDuplicate(nums);
		System.out.println(b);

	}
public static boolean containsDuplicate(int[] nums) {
	Arrays.sort(nums);
	int x=0;
	for(int i=0;i<nums.length-1;i++){
		if(nums[i]==nums[i+1]){
			x=1;
			return true;
		}
	}
	return false;
    }

}
