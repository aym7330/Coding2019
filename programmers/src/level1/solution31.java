// 2016³â
// https://programmers.co.kr/learn/courses/30/lessons/12901?language=java
package level1;

public class solution31 {
	  public String solution(int a, int b) {
		  String[] day={"THU","FRI","SAT","SUN","MON","TUE","WED"};
		  int[] mon= {31,29,31,30,31,30,31,31,30,31,30,31};
		  int sum=b;
		  for(int i=0;i<a-1;i++) {
			  sum+=mon[i];
		  }	   
	      return day[sum%7];
	  }
}
