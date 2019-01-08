package datastructure2;

public class Polynomial4 {
	private char name;
	private Term4[] terms;
	private int nTerms;
	
	public char getName() {
		return name;
	}

	
	public Polynomial4() {
		nTerms=0;
		terms=new Term4[100];
	}
	public Polynomial4(char name) {
		this.name=name;
		nTerms=0;
		terms=new Term4[100];
	}
	public void printPolynomial() {
		for(int i=0;i<nTerms;i++) {
			terms[i].printTerms();
			System.out.print("+");
		}
		System.out.println();
	}
	public int calcPolynomial(int x) {
		int result=0;
		for(int i=0;i<nTerms;i++)
			result+=terms[i].calcTerm(x);
		return result;
	}
	public void addTerm(int c, int e) {
		int index=findTerm(e);
		if(index!=-1) {
			terms[index].setCoef(terms[index].getCoef()+c);
		}
		else {
			int i=nTerms-1;
			while(i>=0&&terms[i].getExpo()<e) {
				terms[i+1]=terms[i];
				i--;
			}
			terms[i+1]=new Term4(c,e);
/*			terms[i+1].coef=c;
			terms[i+1].expo=e;*/
			nTerms++;
		}
	}

	private int findTerm(int e) {
		for(int i=0;i<nTerms &&terms[i].getExpo()>=0;i++) {
			if(terms[i].getExpo()==e)
				return i;
		}
		return -1;
	}

}
