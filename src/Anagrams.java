import java.util.HashMap;

public class Anagrams{
	public static void main(String args[]){
		String str="Mayank";
		StringBuilder orig=new StringBuilder(str);
		int x=0;
		//char ch1[]=str.toCharArray();
		HashMap<Integer, StringBuilder>map=new HashMap<>();
		map.put(0, orig);
		int len=str.length();
		for(int i=0;i<len;i++){
			//char mov=str.charAt(i);
			char mov=str.charAt(i);
			String sub="";
			for(int j=0;j<len;j++){
				if(j!=i){
					sub=sub+str.charAt(j);
				}
			}
			for(int k=0;k<sub.length()+1;k++){
				StringBuilder temp = new StringBuilder(sub);
				temp.insert(k,mov);
				x++;
			
				if(map.containsValue(temp)){
					continue;
				}
				else{
					System.out.println(temp);
					//sub="";
					map.put(x, temp);
				}
			}
		}
	}
}