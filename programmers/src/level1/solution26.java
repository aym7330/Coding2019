// 핸드폰 번호 가리기
// https://programmers.co.kr/learn/courses/30/lessons/12948?language=java
package level1;

public class solution26 {
	  public String solution(String phone_number) {
		  int n=phone_number.length();
		  StringBuffer sb=new StringBuffer();
		  for(int i=0;i<n-4;i++) 
			  sb.append("*");	  
	      return sb.append(phone_number.substring(n-4, n)).toString();
	  }
/*	  public String solution(String phone_number) {
		     char[] ch = phone_number.toCharArray();
		     for(int i = 0; i < ch.length - 4; i ++){
		         ch[i] = '*';
		     }
		     return String.valueOf(ch);
		  }
		}*/
}
