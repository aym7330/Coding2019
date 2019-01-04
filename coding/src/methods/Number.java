package methods;

public class Number {

	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}

	public static boolean isPrime(int n) {
		if(n<2)
			return false;
		
		for(int j=2;j*j<=n;j++) {
			if(n%j==0) 
				return false;
		}
		return true;
	}
	public static int power(int n, int m) {
		int prod=1;
		for(int i=0;i<m;m++)
			prod*=n;
		return prod;
	}

}
