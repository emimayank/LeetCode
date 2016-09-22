import java.util.Scanner;

public class Number_in_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		String num_words=convert_number(number);
		System.out.println(num_words);
	}

	private static String convert_number(int n) {
		// TODO Auto-generated method stub
		String result="";
		if(n<=20){
			result=val_under_20(n);
		}
		
		if(n>=20&&n<=99){
			int tens=n/10;
			result=val_over_20(tens);
		}
		int ones=n%10;
		result=result+val_under_20(ones);
		if(n>99&&n<1000){
			result="";
			int hundereds=n/100;
			result=val_under_20(hundereds);
			int x=n%100;
			if(x>=20&&x<=99){
				result=result+"hundered "+val_over_20(x/10)+val_under_20(x%10);
			}
			if(x<=20){
				result=result+"hundered "+val_under_20(x);
			}
			
		}
		return result;
	}

	private static String val_over_20(int tens) {
		// TODO Auto-generated method stub
		String result="";
		switch(tens){
		case 2:
			result="twenty ";
		case 3:
			result="thirty ";
			break;
		case 4:
			result="fourty ";
			break;
		case 5:
			result="fifty ";
			break;
		case 6:
			result="sixty ";
			break;
		case 7:
			result="seventy ";
			break;
		case 8:
			result="eighty ";
			break;
		case 9:
			result="ninty ";
			break;
		}
		return result;
	}

	private static String val_under_20(int n) {
		// TODO Auto-generated method stub
		String result="";
		switch(n){
		case 1:
			result="one ";
			break;
		case 2:
			result="two ";
			break;
		case 3:
			result="three ";
			break;
		case 4:
			result="four ";
			break;
		case 5:
			result="five ";
			break;
		case 6:
			result="six ";
			break;
		case 7:
			result="seven ";
			break;
		case 8:
			result="eight ";
			break;
		case 9:
			result="nine ";
			break;
		case 10:
			result="ten ";
			break;
		case 11:
			result="eleven ";
			break;
		case 12:
			result="twelve ";
			break;
		case 13:
			result="thirteen ";
			break;
		case 14:
			result="fourteen ";
			break;
		case 15:
			result="fifteen ";
			break;
		case 16:
			result="sixteen ";
			break;
		case 17:
			result="seventeen ";
			break;
		case 18:
			result="eighteen ";
			break;
		case 19:
			result="nineteen ";
			break;
		case 20:
			result="twenty ";
			break;
		}
		return result;
	}

}
