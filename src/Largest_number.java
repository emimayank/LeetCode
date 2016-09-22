import java.util.Scanner;

public class Largest_number {
	public static int pointer=0;
	public static int array[]=new int[1000];
	public static int max=0;
	public static void push(int i){
		array[pointer++]=i;
		if(i>max){
			max=i;
		}
	}
	public static void main(String args[]){
		int i=0;
		while(i!=-1){
			Scanner input= new Scanner(System.in);
			System.out.println("Enter the element to be pushed");
			i=input.nextInt();
			push(i);
		}
		System.out.println(max);
	}
}
