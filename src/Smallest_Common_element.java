import java.util.Arrays;
import java.util.HashMap;

public class Smallest_Common_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]={1,92,7, 8,0,9,10,23,65};
		int array2[]={100,10, 8,6,5,23,46,21,99};
		HashMap<Integer, Integer>map=new HashMap<>();
		Arrays.sort(array1);
		for(int i=0;i<array2.length;i++){
			map.put(i, array2[i]);
		}
		for(int i=0;i<array1.length;i++){
			if(map.containsValue(array1[i])){
				System.out.println(array1[i]);
				break;
			}
		}
	}

}
