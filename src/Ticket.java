
public class Ticket {
	private String to="";
	private String from="";
	public Ticket next;
	public Ticket(String from, String to){
		set_to(to);
		set_from(from);
	}
	public void set_from(String from2) {
		// TODO Auto-generated method stub
		this.from=from2;
	}
	public void set_to(String to2) {
		// TODO Auto-generated method stub
		this.to=to2;
	}
	public void set_next(Ticket ticket){
		next=ticket;
	}
	public String get_to(){
		return to;
	}
	public String get_from(){
		return from;
	}
}
