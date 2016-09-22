import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;

public class Pascal_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the row to be displayed");
		int row=input.nextInt();
		int result[]=findRow(row);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
	}

	private static int[] findRow(int row) {
		// TODO Auto-generated method stub
		if(row==0){
			int nums[]={1};
			return nums;
		}
		else if(row==1){
			int nums[]={1,1};
			return nums;
		}
		else{

			int prev[]={1,1};

			for(int j=2;j<row;j++){
				int nums[]=new int[j+1];
				nums[0]=1;
				nums[j]=1;
				for(int i=1;i<j;i++){
					nums[i]=prev[i-1]+prev[i];
				}
				prev=nums;
			}

			return prev;
		}
	}

}
