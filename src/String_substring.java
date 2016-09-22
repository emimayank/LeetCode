
public class String_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="bfaegs";
		String s2="feg";
		int x=0;
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)==s2.charAt(x)){
				x++;
				if(x==s2.length()){
					break;
				}
			}
			else{
				x=0;
			}
		}
		if(x!=0){
			System.out.println("Found");
		}
		else{
			System.out.println("Not Found");
		}
	}

}
