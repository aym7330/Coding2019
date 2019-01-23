// 정수 내림차순으로 배치하기
// https://programmers.co.kr/learn/courses/30/lessons/12933?language=java

package level1;

import java.util.Arrays;

public class solution18 {
	  public long solution(long n) {
		  String[] str=String.valueOf(n).split("");
		  Arrays.sort(str);
		  StringBuffer sb=new StringBuffer();
		  for(int i=str.length-1;i>=0;i--)
		  {
			  sb.append(str[i]);
		  }   
	      return  Long.parseLong(sb.toString());
	  }	  
	  
	  public static void main(String[] args) {
		solution18 app=new solution18();
		System.out.println(app.solution(118372));
	}
}
