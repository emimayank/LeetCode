
public class Link_List_Repetition {
	public int val;
	public Link_List_Repetition next;
	public Link_List_Repetition(int val, Link_List_Repetition next) {
		// TODO Auto-generated constructor stub
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link_List_Repetition l7=new Link_List_Repetition(7, null);
		Link_List_Repetition l6=new Link_List_Repetition(7, l7);
		Link_List_Repetition l5=new Link_List_Repetition(5, l6);
		Link_List_Repetition l4=new Link_List_Repetition(4, l5);
		Link_List_Repetition l3=new Link_List_Repetition(4, l4);
		Link_List_Repetition l2=new Link_List_Repetition(2, l3);
		Link_List_Repetition l1=new Link_List_Repetition(1, l2);
		Link_List_Repetition curr=l1,prev=null,next;

		while(curr!=null){
			if(curr.val==curr.next.val){
				curr.next=curr.next.next;
			}
			curr=curr.next;
		}
		while(l1!=null){
			System.out.println(l1.val);
			l1=l1.next;
		}
			
	}

}
