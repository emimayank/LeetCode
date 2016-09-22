
public class Add_digits_inNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=178, result=0;
		result =find_digit_sum(n);
		if(result>=9){
			result =find_digit_sum(result);
		}
		System.out.println(result);
	}

	private static int find_digit_sum(int n) {
		// TODO Auto-generated method stub
		int sum=0;
		while(n>=9){
			if(n>1000){
				sum=n/1000;
				n=n%1000;
			}
			else if(n>100){
				sum=sum+(n/100);
				n=n%100;
			}
			else if(n>10){
				sum=sum+(n/10);
				n=n%10;
			}
			else{
				sum=sum+n;
			}
		}
		sum=sum+n;
		return sum;
	}


}
