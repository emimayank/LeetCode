//import java.util.*
public class Number_of_1_bits {

	public static void main(String args[]){
		int n=10;
		int counter=hammingWeight(n);
		System.out.println(counter);
		
	}
	
	public static int hammingWeight(int n) {
        
        String str= new String();
        int counter=0;
        str=n+"";
        for(char ch:str.toCharArray()){
            if(ch=='1'){
                counter++;
            }
        }
        return counter;
        
    }
}
