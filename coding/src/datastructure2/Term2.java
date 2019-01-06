package datastructure2;

public class Term2 {
	public int coef;
	public int expo;
	public int calcTerm( int x) {
		return (int)(coef * Math.pow(x,expo));
	}
	public void printTerms() {
		System.out.print(coef+"x^"+expo);
		
	}
}
