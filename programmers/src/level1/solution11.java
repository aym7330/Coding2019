// 두 정수 사이의 합
// https://programmers.co.kr/learn/courses/30/lessons/12912?language=java
package level1;

public class solution11 {

	public long solution(int a, int b) {
		long answer = 0;
		if(a>b) {
			int temp=a;
			a=b;
			b=temp;
		}
		for(int i=a;i<=b;i++)
		{
			answer+=i;
		}
		return answer;
	}
/*	   public long solution(int a, int b) {
	        return sumAtoB(Math.min(a, b), Math.max(b, a));
	    }

	    private long sumAtoB(long a, long b) {
	        return (b - a + 1) * (a + b) / 2;
	    }*/
}
