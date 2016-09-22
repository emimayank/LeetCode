import java.util.Arrays;
import java.util.Scanner;

public class Coin_Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount= input.nextInt();
		int coins[]={186,419,83,408};
		int total=find_change(coins, amount);
		System.out.println(total);

	}
	public static int find_change(int[]coins, int amount){
		if(amount==0){
			return 0;
		}
		Arrays.sort(coins);
		int tot=0,i=(coins.length)-1;
		while(amount!=0){
			if(i==-1){
				break;
			}
			tot=tot+(amount/coins[i]);
			amount=amount%coins[i--];
		}
		if(tot==0 || amount!=0){
		    return -1;
		}
		return tot;
	}

}
