// x만큼 간격이 있는 n개의 숫자
// https://programmers.co.kr/learn/courses/30/lessons/12954?language=java
package level1;

public class solution28 {
	  public long[] solution(int x, int n) {
	      long[] answer = new long[n];
	      for(int i=1;i<=n;i++)
	    	  answer[i-1]=i*(long)x;
	      return answer;
	  }
}
