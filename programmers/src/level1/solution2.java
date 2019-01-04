// 가운데 글자 가져오기
// https://programmers.co.kr/learn/courses/30/lessons/12903
package level1;

public class solution2 {
	  public String solution(String s) {
	      int n=s.length();
	      String anwser="";
	      if(n%2==0)
	    	  return s.substring(n/2-1, n/2+1);
	      else 
	    	 return s.substring(n/2-1,n/2);
	  }
/*	  
      int length = word.length();
      int mid = length / 2;
      return length%2==0 ? word.substring(mid-1, mid+1) : word.substring(mid, mid+1) ; 
  */    
}
