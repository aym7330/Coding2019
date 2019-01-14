// 정수 제곱근 판별
// https://programmers.co.kr/learn/courses/30/lessons/12934?language=java
package level1;

public class solution19 {
/*	public long solution(long n) {
		long answer = 0;
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n)
				return (i + 1) * (i + 1);
		}
		return -1;
	}*/
	
/*	public long solution(long n) {
		long answer = 0;
		int i=1;
		while(true) {
			if(i*i<n) 
				i++;
			else if(i*i>n) {
				return -1;
			}
			else{
				++i;
				return i*i;
			}
		}
	}*/
	public long solution(long n) {
		double r=Math.sqrt(n);
		return r%1==0?(long) ((r+1)*(r+1)): -1;
	}
}
