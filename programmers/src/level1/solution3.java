// 같은 숫자는 싫어
// https://programmers.co.kr/learn/courses/30/lessons/12906
package level1;

import java.util.Scanner;

public class solution3 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in); 
		int n=kb.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++) {
			data[i]=kb.nextInt();
		}
		kb.close();

		int[] a=solution(data);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

	public static int[] solution(int []arr) {
		int n=0;
		for(int i=0;i<arr.length-1;i++) 
			if(arr[i]!=arr[i+1])
				n++;		
        int[] answer = new int[n+1];
        int j=0;
        answer[0]=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(answer[j]!=arr[i]) {
        		j++;	
        		answer[j]=arr[i];
        	}
        }
        return answer;
	}
}
