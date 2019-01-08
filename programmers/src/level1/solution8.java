// 약수의 합
// https://programmers.co.kr/learn/courses/30/lessons/12928?language=java
package level1;

public class solution8 {
	  public int solution(int n) {
	      int answer = 0;
	      for(int i=1;i<=n;i++)
	    	  if(n%i==0)
	    		  answer+=i;
	      return answer;
	  }
/*	    public int sumDivisor(int num) {
	        int answer = 0;
	            for(int i = 1; i <= num/2; i++){
	        if(num%i == 0) answer += i;
	      }
	        return answer+num;
	    }*/
}
