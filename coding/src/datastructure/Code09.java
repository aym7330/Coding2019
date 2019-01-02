// 한칸씩 자리 옮기기
package datastructure;

import java.util.Scanner;

public class Code09 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=kb.nextInt();
		}
		kb.close();

		int temp=data[n-1];
		for(int i=n-2;i>=0;i--) 
			data[i+1]=data[i];
		data[0]=temp;
		
		for(int i=0; i<n;i++)
			System.out.print(data[i]);
	}

}
