import java.util.Scanner;

public class Time_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the time");
		String time=input.nextLine(), time24="";
		String ampm=time.substring(time.length() - 2); 
		if(ampm.equals("AM")){
			time24=time;
		}
		else{
			int t=Integer.parseInt(time.substring(0, 2));
			t=t+12;
			time24=t+"";
			System.out.println(time24+time.substring(2, 8));
		}
	}

}
