// 소수 구하기
package datastructure1;

public class Code10 {
	public static void main(String[] args) {
		for(int n=2;n<=10; n++) {
			boolean isPrime=true;
			for(int i=2;i<=n/2; i++) {
				if(n%i==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(n);
		}
		/*		
		for(int i=2;i<=n/2&&isPrime; i++) {
			if(n%i==0) 
				isPrime=false;
		}

		for(int i=2;i*i<=n&&isPrime; i++) {
			if(n%i==0) 
				isPrime=false;
		}
		 */

	}
}
