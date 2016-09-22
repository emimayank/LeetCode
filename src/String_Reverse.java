import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=input.nextLine();
		String rev_string=ReverseString(str);
		System.out.println(rev_string);
	}
	public static String ReverseString(String str){
		String rev=new String();
		for(int i=0;i<str.length();i++){
			rev=str.charAt(i)+rev;
		}
		return rev;
	}

}
