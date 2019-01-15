// 최대공약수와 최소공배수
// https://programmers.co.kr/learn/courses/30/lessons/12940?language=java
package level1;

public class solution22 {
	  public int[] solution(int n, int m) {
	      int[] answer = new int[2];
	      int num=1;
	      int i=2;
	      while(i<=n||i<=m)
	      {
	    	if(n%i==0&&m%i==0) {
	    		num*=i;
	    		n/=i;
	    		m/=i;
	    	}
	    	else
	    		i++;
	      }	  	      
	      answer[0]=num;
	      answer[1]=num*n*m;
	      return answer;
	  }
}
