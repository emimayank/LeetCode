import java.util.HashMap;

public class Array_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]={1,2,7, 8,0,9,10,23,65};
		int array2[]={2,10, 8,6,5,23,46,21,99,2};
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<array1.length;i++){
			map.put(i,array1[i]);
		}
		
		for(int i=0;i<array2.length;i++){
			if(map.containsValue(array2[i])){
				System.out.println(array2[i]);
				map.remove(i);
			}
		}
	}

}
