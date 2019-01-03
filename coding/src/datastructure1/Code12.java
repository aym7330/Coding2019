// 연속적인 수의 최대합
package datastructure1;

import java.util.Scanner;

public class Code12 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=kb.nextInt();
		}
		kb.close();
		
		int max=0;
/*		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) 
					sum+=data[k];
				if(sum>max)
					max=sum;
				// add data[i] ~ data[j]
				// if the sum > max
				// max = the sum
			}
		}*/
		
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j++) {
					sum+=data[j];
				if(sum>max)
					max=sum;
			}
		}
		System.out.println(max);
	}
}
