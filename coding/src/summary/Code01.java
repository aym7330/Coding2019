package summary;

import java.util.Arrays;

public class Code01 {
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
/*		int[] arr = { 1, 2 };
		System.out.println("swap ��, arr[0] : " + arr[0] + " arr[1] : " + arr[1]);

		swap(arr[0], arr[1]);
		System.out.println("swap ��, arr[0] : " + arr[0] + " arr[1] : " + arr[1]);

		char c = 'a';
		short s = 1;
		int cs = c + s; // cs�� Ÿ���� int�ؾ� ������ ���� �ʴ´�.

		int i = 1;
		double d = 1.0;
		double id = i + d; // id�� Ÿ���� double�ؾ� ������ ���� �ʴ´�.
*/		
		char[] c= {'��','��','��'};		
		String str1="������";
		
		String str2=new String(c);	// char[] -> String	
		char ch[]=str2.toCharArray();	// String -> char[]
	}

	int capacity = 10;
	int[] arr = new int[capacity];

	private void reallocate1() {
		int[] tmp = new int[capacity * 2];
		for (int i = 0; i < 10; i++)	// �迭�� ��� ���� ��� 1
			tmp[i] = arr[i];
		arr = tmp;	// tmp�� ����� �ּ� ���� arr�� �����Ѵ�.
		capacity *= 2;
	}

	private void reallocate2() {
		int[] tmp = new int[capacity * 2];
		System.arraycopy(arr, 0, tmp, 0, arr.length);	// �迭�� ��� ���� ��� 2
		arr = tmp;
		capacity *= 2;
	}

	private void reallocate3() {
		capacity *= 2;
		arr = Arrays.copyOf(arr, capacity);	// �迭�� ��� ���� ��� 3
	}
	


}
