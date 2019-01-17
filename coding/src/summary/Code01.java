package summary;

public class Code01 {
	public static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
	}
	public static void main(String[] args) {
		int[] arr= {1,2};
		System.out.println("swap Àü, arr[0] : "+arr[0]+" arr[1] : "+arr[1]);

		swap(arr[0],arr[1]);
		System.out.println("swap ÈÄ, arr[0] : "+arr[0]+" arr[1] : "+arr[1]);
	}
	
}
