// Æò±Õ ±¸ÇÏ±â
// https://programmers.co.kr/learn/courses/30/lessons/12944?language=java
package level1;

public class solution24 {
	  public double solution(int[] arr) {
	      double answer = 0;
	      for(int a: arr)
	    	  answer+=a;
	      answer/=arr.length;
	      return answer;
	  }
}
