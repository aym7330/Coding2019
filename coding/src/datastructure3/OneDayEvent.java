package datastructure3;

public class OneDayEvent extends Event{
//	public String title;
	public MyDate date;
	
	public OneDayEvent(String title, MyDate date) {
		super(title);
//		this.title=title;
		this.date=date;
	}
	
	public String toString() {	//overriding
		return title+", "+date.toString();
	}
}
