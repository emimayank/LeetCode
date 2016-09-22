
public class Link_List_Delete {
	public int val;
	public Link_List_Delete next;
	public Link_List_Delete(int val, Link_List_Delete next) {
		// TODO Auto-generated constructor stub
		this.val=val;
		this.next=next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link_List_Delete l7=new Link_List_Delete(7, null);
		Link_List_Delete l6=new Link_List_Delete(6, l7);
		Link_List_Delete l5=new Link_List_Delete(5, l6);
		Link_List_Delete l4=new Link_List_Delete(4, l5);
		Link_List_Delete l3=new Link_List_Delete(3, l4);
		Link_List_Delete l2=new Link_List_Delete(2, l3);
		Link_List_Delete l1=new Link_List_Delete(1, l2);
		Link_List_Delete temp=l1,start=l1;
		int count=0;
		System.out.println("Orignal LinkedList");
		while(temp!=null){
			count=count+1;
			System.out.println(temp.val);
			temp=temp.next;
		}
		int numdel=3,j=1;
		numdel=count-numdel;
		while(j!=numdel){
			start=start.next;
			j++;
		}
		start.next=start.next.next;
		System.out.println("New LinkedList");
		while(l1!=null){
			System.out.println(l1.val);
			l1=l1.next;
		}
	}

}
