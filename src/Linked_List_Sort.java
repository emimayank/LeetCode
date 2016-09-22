
public class Linked_List_Sort {
	public int val;
	public Linked_List_Sort next;
	public Linked_List_Sort(){
		
	}
	public Linked_List_Sort(int val, Linked_List_Sort next){
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List_Sort l6= new Linked_List_Sort(1,null);
		Linked_List_Sort l5= new Linked_List_Sort(2,l6);
		Linked_List_Sort l4= new Linked_List_Sort(14,l5);
		Linked_List_Sort l3= new Linked_List_Sort(4,l4);
		Linked_List_Sort l2= new Linked_List_Sort(5,l3);
		Linked_List_Sort l1= new Linked_List_Sort(66,l2);
		
		Linked_List_Sort head1=l1,head2=l1;
		while(head1!=null){
				head2=l1;
				while(head2!=null){
				if(head2.next!=null){
					if(head2.val>head2.next.val){
						//head2.val=temp;
						int temp=head2.val;
						head2.val=head2.next.val;
						head2.next.val=temp;
					}
				}	
				head2=head2.next;
			}
			head1=head1.next;
		}
		while(l1!=null){
			System.out.println(l1.val);
			l1=l1.next;
		}
		
		
	}

}
