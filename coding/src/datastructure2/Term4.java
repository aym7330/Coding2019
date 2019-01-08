package datastructure2;

public class Term4 {
	private int coef;
	private int expo;	
	
	public int getCoef() {
		return coef;
	}
	public void setCoef(int coef) {
		this.coef = coef;
	}
	public int getExpo() {
		return expo;
	}

	public Term4(int c, int e) {
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
