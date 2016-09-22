
public class Reverse_linked_list{
	public int node;
	public Reverse_linked_list next;
	public Reverse_linked_list(int node, Reverse_linked_list next){
		this.node=node;
		this.next=next;
	}
	public String toString(){
		return node+"";
	}
	public static void main(String args[]){
		Reverse_linked_list l1= new Reverse_linked_list(1, null);
		Reverse_linked_list l2= new Reverse_linked_list(2, l1);
		Reverse_linked_list l3= new Reverse_linked_list(3, l2);
		Reverse_linked_list l4= new Reverse_linked_list(4, l3);
		Reverse_linked_list l5= new Reverse_linked_list(5, l4);
		Reverse_linked_list temp=l5;
		//Reverse_linked_list prev=null, curr=null;
		int stack[]=new int[100];
		int i=0;
		stack[i++]=-1;
		System.out.println("Orignal order of the Linked List");
		while(temp!=null){
			//stack[i++]=temp.node;
			System.out.println(temp);
			temp=temp.next;
		}
		Reverse_linked_list prev = null, result=null;
		Reverse_linked_list current = l5;
		Reverse_linked_list next = null;
        while (current != null) {
        	next=current.next;
        	current.next=prev;
        	prev=current;
        	current=next;
        	
        }
        result=prev;
		System.out.println("Reverse order of the Linked List");
        while(result!=null){
        	System.out.println(result);
        	result=result.next;
        }
	}
}

