import java.util.Scanner;

public class Nim_stone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total number of stones");
		int stones= input.nextInt();
		Boolean result=canWinNim(stones);
		System.out.println(result);
	}
    public static Boolean canWinNim(int n) {
        return n % 4 > 0;
    }
}
