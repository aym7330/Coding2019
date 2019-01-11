package datastructure3;

public abstract class Event {
	public String title;
	public Event(String title) {
		this.title=title;
	}
	public abstract boolean isRelevant(MyDate date);
		// ? => 실제 구현되지 않음
		// ruturn false; 무의미한 코드 => 해결되긴 함
	
}
