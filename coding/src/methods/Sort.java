package methods;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Sort {
	public static void main(String[] args) {
/*		Scanner kb=new Scanner(System.in); 
		int n=kb.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=kb.nextInt();
		}
		kb.close();
		
		bubbleSort(data);
		for(int i=0;i<n;i++) {
			System.out.print(data[i]+" ");
		}*/
		
		orderedListEx();
	}
	
	
	
	public static void bubbleSort(int[] data) {
		int n=data.length;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(data[j]>data[j+1]) {
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
			}
		}
	}
	static void swap(int a, int b) {	
		//primitive type(갑에 의한 호출), reference type(주소에 의한 호출)
		int temp=a;
		a=b;
		b=temp;
	}
	public static void orderedListEx() {
		Scanner kb=new Scanner(System.in);
		int n=kb.nextInt();
		int[] data=new int[n];
		
		for(int i=0;i<n;i++) {
			int temp=kb.nextInt();
			int j=i-1;
			while(j>=0&&data[j]>temp) {
				data[j+1]=data[j];
				System.out.println("j:"+j);
				j--;
			}
			data[j+1]=temp;
			
			for(int k=0;k<=i;k++)
				System.out.print(data[k]+" ");
			System.out.println();
		}
		kb.close();
	}
	public static void stringBubbleSort(int n,String[] str) {
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(str[j].compareToIgnoreCase(str[j+1])>0) {
					String temp=str[j];
					str[j]=str[j+1];
					str[j+1]=temp;
				}
			}
		}
		
	}
}
