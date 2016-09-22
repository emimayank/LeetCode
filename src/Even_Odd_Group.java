

public class Even_Odd_Group {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List l6=new Linked_List(6,null);
		Linked_List l5=new Linked_List(5,l6);
		Linked_List l4=new Linked_List(4,l5);
		Linked_List l3=new Linked_List(3,l4);
		Linked_List l2=new Linked_List(2,l3);
		Linked_List l1=new Linked_List(1,l2);
		Linked_List odd_head=l1;
		Linked_List start=new Linked_List();
		Linked_List begin=odd_head;
		start=l1;
		Linked_List odd_tail=new Linked_List();
		Linked_List even_tail=l1.next;
		Linked_List even_head=even_tail;
		while(start!=null){
			if(start.next!=null){
				odd_tail=start.next.next;
				even_tail=start.next;
				start=start.next;
				odd_head.next=odd_tail;
				even_head.next=even_tail;
			}
		}
		while(begin!=null){
			System.out.println(begin);
			begin=begin.next;
		}
	}

}
