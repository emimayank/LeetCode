
public class Itenary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dest1="",from1="";
		int n=0;
		Ticket t1 = new Ticket("JFK","SFO");
		Ticket t2 = new Ticket("JFK","ATL");
		Ticket t3 = new Ticket("SFO","ATL");
		Ticket t4 = new Ticket("ATL","JFK");
		Ticket t5 = new Ticket("ATL","SFO");
		t1.set_next(t2);
		t2.set_next(t3);
		t3.set_next(t4);
		t4.set_next(t5);
		t5.set_next(t1);
		Ticket temp=t1;
		dest1="JFK";
		System.out.println(dest1);
		while(n!=8){
			from1=temp.get_from();
			if(from1==dest1){
				dest1=temp.get_to();
				n=n+2;
				System.out.println(dest1);
				from1=dest1;
			}
			temp=temp.next;
		}

	}

}
