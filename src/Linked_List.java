
public class Linked_List {
	public int val;
	public Linked_List next;
	public Linked_List(int val, Linked_List next){
		this.val=val;
		this.next=next;
	}
	public Linked_List(){
		this.val=0;
	}
	public String toString(){
		return val+"";
	}
	
}
