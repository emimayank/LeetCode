import java.util.Arrays;
import java.util.HashSet;

public class Anagram_Solver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anagram";
		String t="nagarams";
		char ch[]=s.toCharArray();
		Arrays.sort(ch);
		String s1=new String(ch);
		ch=t.toCharArray();
		Arrays.sort(ch);
		String t1=new String(ch);
		if(t1.equals(s1)){
			System.out.println("They are anagrams");
		}
		else{
			System.out.println("They are NOT anagrams");
			
		}
		HashSet<Integer>set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		Integer nums[]=new Integer[set.size()];
		int arr[]=new int[set.size()];
		set.toArray(nums);
		for(int i=0;i<set.size();i++){
			arr[i]=nums[i];
		}
		for(int i=0;i<set.size();i++){
			System.out.println(arr[i]);
		}
	}


}
