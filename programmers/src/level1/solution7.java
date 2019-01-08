// 소수 찾기
// https://programmers.co.kr/learn/courses/30/lessons/12921?language=java
package level1;

public class solution7 {
	public static int solution(int n) {
	      int answer = 0;
			for(int j=2;j<=n; j++) {
				boolean isPrime=true;
				for(int i=2;i*i<=j; i++) {
					if(j%i==0) {
						isPrime=false;
						break;
					}
				}
				if(isPrime) answer++;
			}
	      return answer;
	  }
	  public static void main(String[] args) {
		System.out.println(solution(10));
	}
}
