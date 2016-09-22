import java.util.Scanner;

public final class Bulb_switcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int array[]={1,1,1};
		Scanner input= new Scanner(System.in);

		System.out.println("Enter the value of n: ");
		int n= input.nextInt();
		int i=1;
		while(n!=1){
			if(array[i]==0){
				array[i]=1;
			}
			else{
				array[i]=0;
			}
			if(array.length==i){
				i=1;
			}
			else{
				i=i+1;
			}
			n=n-1;
		}
		for(int j=0;j<array.length;j++){
			System.out.println(array[j]);
		}
		
	}

}
