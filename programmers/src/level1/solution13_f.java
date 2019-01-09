// 문자열 내 마음대로 정렬하기
// https://programmers.co.kr/learn/courses/30/lessons/12915?language=java
package level1;

public class solution13_f {
	  public static String[] solution(String[] strings, int n) {
	      for(int i=strings.length-1;i>0;i--) {
	    	  for(int j=0;j<i;j++)
	    	  {
				if (n < strings[j].length() && n < strings[j + 1].length()) {
					String j1 = strings[j].substring(n, n+1);
					String j2 = strings[j + 1].substring(n, strings[j + 1].length());
					if (j1.compareTo(j2) > 0) {
						String temp = strings[j];
						strings[j] = strings[j + 1];
						strings[j + 1] = temp;
					}
				}
	    	  }
	      }
	      return strings;
	  }
	  public static void main(String[] args) {
		  String[] s= {"abcd", "abce", "cdx"};
		  solution(s,2);
	}
}
