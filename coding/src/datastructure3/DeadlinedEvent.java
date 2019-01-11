package datastructure3;

public class DeadlinedEvent extends Event{
//	public String title;
	public MyDate deadline;
	
	public DeadlinedEvent(String title, MyDate date) {
		super(title);
//		this.title=title;
		this.deadline=date;
	}
	public String toString() {
		return title+", "+deadline.toString();
	}	
	public boolean isRelevant(MyDate date) {
		return deadline.compareTO(date)<=0;
	}
}
