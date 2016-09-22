import java.util.HashMap;

public class Sum_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,50,98,91,92,93,7,8,44,56,32,68,78,104,100,50,50},fifty=0;
		HashMap<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<array.length;i++){
			map.put(i, array[i]);
			if(array[i]==50){
				fifty++;
			}
		}
		for(int i=0;i<array.length;i++){

			if(map.containsValue(100-array[i])&&(fifty!=2)&&(array[i]!=50)){
				System.out.println(array[i]+" "+(100-array[i]));
				map.remove(i);
			}
		}
	}

}
