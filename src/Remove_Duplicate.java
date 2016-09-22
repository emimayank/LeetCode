
public class Remove_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List l6=new Linked_List(1,null);
		Linked_List l5=new Linked_List(1,l6);
		Linked_List l4=new Linked_List(1,l5);
		Linked_List l3=new Linked_List(1,l4);
		Linked_List l2=new Linked_List(1,l3);
		Linked_List l1=new Linked_List(1,l2);
		Linked_List head=l1;
		Linked_List start=head;
        while(head!=null){
            if(head.next!=null){
                 if(head.val==head.next.val){
                	 head.next=head.next.next;
                 }
            }
            head=head.next;        
        }
        while(start!=null){
        	System.out.println(start);
        	start=start.next;
        }
	}

}
