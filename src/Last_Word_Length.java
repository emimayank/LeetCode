
public class Last_Word_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Mayank how are you doing?";
		String str_array[]=str.split(" ");
		int len=str_array.length;
		System.out.println(str_array[len-1].length());
	}

}
