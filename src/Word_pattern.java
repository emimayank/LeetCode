import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Word_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the pattern");
		String pattern= input.nextLine();
		System.out.println("Enter the String");
		String str= input.nextLine();
		String result_str="";
		int i=0;
		for(char ch:str.toCharArray()){
			if(i==0){
				result_str=result_str+ch;
			}
			if(ch==' '){
				result_str=result_str+str.charAt(i+1);
			}
			i=i+1;
		}
		i=0;
		int len=result_str.length();
		int array1[]=new int [len];
		int array2[]= new int[len],counter=1;
		for(char ch:pattern.toCharArray()){

			try{
				if(ch!=pattern.charAt(i-1)){
					counter=1;
					array1[i]=counter;
				}
				if(ch==pattern.charAt(i-1)){
					counter++;
					array1[i]=counter;
				}
				i=i+1;
			}
			catch(Exception e){
				break;
			}
		}
		
		for(char ch:result_str.toCharArray()){

			try{
				if(ch!=result_str.charAt(i-1)){
					counter=1;
					array2[i]=counter;
				}
				if(ch==result_str.charAt(i-1)){
					counter++;
					array2[i]=counter;
				}
				i=i+1;
			}
			catch(Exception e){
				break;
			}
		}
		if(array1.equals(array2)){
			System.out.println("Pattern Found");
		}
		else{
			System.out.println("Pattern NOT Found");
		}
	}
	
}
