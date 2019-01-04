package methods;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in); 
		int n=kb.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=kb.nextInt();
		}
		kb.close();
		
/*		arrayOneShift(data);
		for(int i=0;i<n;i++) {
			System.out.print(data[i]+" ");
		}*/
		System.out.println(arraySumMax(data));
	}
	
	public static void arrayOneShift(int[] data) {
		int n=data.length;
		int temp=data[n-1];
		for(int i=n-2;i>=0;i--) {
			data[i+1]=data[i];
		}
		data[0]=temp;
	}
	public static int arraySumMax(int[] data) {
		int max = data[0];
		int n=data.length;
		for(int i=0;i<n;i++) {
			int sum=0;
			for (int j = i; j < n; j++) {
				sum += data[j];
				if (max < sum)
					max = sum;
			}
		}
		return max;
	}

}
