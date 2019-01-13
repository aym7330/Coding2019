// 정수 내림차순으로 배치하기
// https://programmers.co.kr/learn/courses/30/lessons/12933?language=java

package level1;

import java.util.Arrays;

public class solution18_f {
	  public long solution(long n) {
		  String[] str=String.valueOf(n).split("");
		  Arrays.sort(str);
		  StringBuffer sb=new StringBuffer();
		  for(int i=str.length-1;i>=0;i--)
		  {
			  sb.append(str[i]);
		  }   
	      return  (long)Integer.valueOf(sb.toString());
	  }
	
	/*  public long solution(long n) {
		  String s=String.valueOf(n);
		  String[] str=s.split("");
		  StringBuffer sb=new StringBuffer();
		  for(int i=9;i>=0;i--) {
			  s=String.valueOf(i);
			  for(String tmp:str) {
				  if(tmp.equals(s))
					  sb.append(tmp);
			  }
		  }
		  s=sb.toString();
		  long answer = (long)Integer.valueOf(s);
	      return answer;
	  }*/
	  
	  
	  public static void main(String[] args) {
		solution18_f app=new solution18_f();
		System.out.println(app.solution(118372));
	}
}
