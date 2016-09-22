import java.util.Arrays;
import java.util.Scanner;

public class Remove_duplicate_letters {

	public static <catches> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String s= input.nextLine();
		char sortd[] = s.toCharArray();
		Arrays.sort(sortd);
		int i=0;
		String sorted = new String(sortd);
		for(char ch:sorted.toCharArray()){
			i=i+1;
			try{
				if(ch!=sorted.charAt(i)){
					System.out.print(ch);
				}
			}
			catch(Exception e){
				System.out.print(ch);
			}

		}
	}

}
