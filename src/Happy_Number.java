import java.util.HashMap;
import java.util.Scanner;

public class Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		boolean b=check_happy(num);
	}

	private static boolean check_happy(int n) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map=new HashMap<>();
		int sum=0;
		while(sum!=1){
			int x=n%10;
			sum=(int) (sum+(Math.pow(x,2)));
			n=n/10;
			if(sum==1){
				break;
			}
			if(n==0){
				n=sum;
				System.out.println(n);
				sum=0;
				map.put(sum, sum);
			}
		}
		System.out.println(sum);
		return false;
	}

}
