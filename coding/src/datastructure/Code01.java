package datastructure;

public class Code01 {
	static int num;			// 외부에 선언 가능 but 클래스 외부 선언 불가능
	public static void main(String[] args) {
		int anotherNum=5;	// 메서드 내부에만 사용 가능
		num=2;				// 클래스 내부 사용 가능
		
		System.out.println(num+anotherNum);
		System.out.println("Sum : "+num+anotherNum);
		System.out.println("Sum : "+(num+anotherNum));

	}
}
