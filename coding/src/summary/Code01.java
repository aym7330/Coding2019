package summary;

public class Code01 {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2 };
		System.out.println("swap ��, arr[0] : " + arr[0] + " arr[1] : " + arr[1]);

		swap(arr[0], arr[1]);
		System.out.println("swap ��, arr[0] : " + arr[0] + " arr[1] : " + arr[1]);

		char c = 'a';
		short s = 1;
		int cs = c + s; // cs�� Ÿ���� int�ؾ� ������ ���� �ʴ´�.

		int i = 1;
		double d = 1.0;
		double id = i + d; // id�� Ÿ���� double�ؾ� ������ ���� �ʴ´�.
	}

}
