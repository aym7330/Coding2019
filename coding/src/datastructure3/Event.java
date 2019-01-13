package datastructure3;

public abstract class Event implements Comparable{
	public String title;
	public Event(String title) {
		this.title=title;
	}
	public abstract boolean isRelevant(MyDate date);
		// ? => 실제 구현되지 않음
		// ruturn false; 무의미한 코드 => 해결되긴 함
	public abstract MyDate getRepresentativeDate();
	
	public int compareTo(Object other) {
		MyDate mine=getRepresentativeDate();
		MyDate yours=((Event)other).getRepresentativeDate();
		return mine.compareTo(yours);
	}
}
