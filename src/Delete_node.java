
public class Delete_node {
	public int val=0;
	public Delete_node next;
	public Delete_node(int val, Delete_node next){
		this.val=val;
		this.next=next;
	}
	public String toString(){
		return val+"";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delete_node l5= new Delete_node(5,null);
		Delete_node l4=new Delete_node(4, l5);
		Delete_node l3=new Delete_node(3, l4);
		Delete_node l2=new Delete_node(2, l3);
		Delete_node l1=new Delete_node(1, l2);
		Delete_node temp=l1;
		int count=2, del=2;
		while(temp!=null){
			if(del==count){
				temp.next=temp.next.next;
				break;
			}
			else{
				count++;
				temp=temp.next;
			}
		}
		while(l1!=null){
			System.out.println(l1.val);
			l1=l1.next;
		}
		
	}

}
