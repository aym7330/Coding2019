package summary;

public class Code01 {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		System.out.println("swap 전, arr[0] : " + arr[0] + " arr[1] : " + arr[1]);

		swap(arr[0], arr[1]);
		System.out.println("swap 후, arr[0] : " + arr[0] + " arr[1] : " + arr[1]);

		char c = 'a';
		short s = 1;
		int cs = c + s; // cs의 타입을 int해야 에러가 나지 않는다.

		int i = 1;
		double d = 1.0;
		double id = i + d; // id의 타입을 double해야 에러가 나지 않는다.
	}

}
