
public class Atoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="+1";
		int sum=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			int num=ch-48;
			if(num>9 || num<0){
				sum=0;
				break;
			}
			sum=(sum*10)+num;
		}
		System.out.println(sum);
	}

}
