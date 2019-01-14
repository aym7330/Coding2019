// 제일 작은 수 제거하기
// https://programmers.co.kr/learn/courses/30/lessons/12935?language=java
package level1;

import java.util.Arrays;

public class solution20 {

	public int[] solution(int[] arr) {
		int n = arr.length == 1 ? 1 : arr.length - 1;
		int[] answer = new int[n];
		if (n == 1) {
			answer[0] = -1;
			return answer;
		} else {
			int min=arr[0];
			for(int i=0;i<n+1;i++) 
			if(min>arr[i])min=arr[i];
			int j=0;
			for(int i=0;i<n+1;i++)
			{
				if(min==arr[i]);
				else {
					answer[j]=arr[i];
					j++;
				}
			}
			return answer;
		}
	}

}
