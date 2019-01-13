// 자연수 뒤집어 배열로 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12932?language=java

package level1;

public class solution17 {
	  public int[] solution(long n) {
		  String str=String.valueOf(n);
		  String[] strs=str.split("");
	      int[] answer =new int[strs.length];
	      int i=strs.length-1;
		  for(String tmp: strs) {
			  answer[i--]=Integer.parseInt(tmp);
		  }
	      return answer;
	  }
}
