// 두 정수 a,b를 받아서 a의 b승을 계산

package datastructure1;

import java.util.Scanner;

public class Code16 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int a=kb.nextInt();
		int b=kb.nextInt();
		
		int result=power(a,b);	// 메서드 호출
		
		System.out.println(result);
		kb.close();
	}
	static int power(int n, int m){	// 매개변수로 두개의 정수를 받음
		int prod=1;
		for(int i=0;i<n;i++) {
			prod*=n;
		}
		return prod;	// 호출한 이에게 넘겨줌
	}
}
