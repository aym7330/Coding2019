package datastructure2;

public class Term3 {
	public int coef;
	public int expo;
	public Term3(int c, int e) {
		coef=c;
		expo=e;
	}
	public int calcTerm( int x) {
		return (int)(coef * Math.pow(x,expo));
	}
	public void printTerms() {
		System.out.print(coef+"x^"+expo);
		
	}
}
