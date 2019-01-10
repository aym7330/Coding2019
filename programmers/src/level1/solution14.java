// 문자열 내림차순으로 배치하기
// https://programmers.co.kr/learn/courses/30/lessons/12917?language=java

package level1;

import java.util.Arrays;
import java.util.Collections;

public class solution14 {
	public String solution(String s) {
	      String answer = "";
	      int n=s.length();
	      char[] str=new char[n];
	      for(int i=0;i<n;i++) {
	    	  str[i]=s.charAt(i);
	      }
	      Arrays.sort(str);
	      for(char a:str)
	    	  System.out.println(a+" ");
	      StringBuffer strb=new StringBuffer();
	      for(int i=n-1;i>0;i--)
	      {
	    	  strb.append(str[i]);
	      }
	      answer=strb.toString();
	      return answer;
	  }
	
/*	public String reverseStr(String str) {
		char[] sol = str.toCharArray();
		Arrays.sort(sol);
		return new StringBuilder(new String(sol)).reverse().toString();
	}*/
}
