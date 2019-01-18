package summary;

import java.util.Arrays;

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

	int capacity = 10;
	int[] arr = new int[capacity];

	private void reallocate1() {
		int[] tmp = new int[capacity * 2];
		for (int i = 0; i < 10; i++)
			tmp[i] = arr[i];
		arr = tmp;
		capacity *= 2;
	}

	private void reallocate2() {
		int[] tmp = new int[capacity * 2];
		System.arraycopy(arr, 0, tmp, 0, arr.length);
		arr = tmp;
		capacity *= 2;
	}

	private void reallocate3() {
		capacity *= 2;
		arr = Arrays.copyOf(arr, capacity);
	}
	


}
