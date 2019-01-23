// 시저 암호
// https://programmers.co.kr/learn/courses/30/lessons/12926?language=java
package level1;

public class solution32 {
	  public String solution(String s, int n) {
		  char[] charr=s.toCharArray();
		  for(int i=0;i<charr.length;i++) {
			  char a=charr[i];
			  int num=0;
			  while(num<n){			  
			  if(a=='z'||a=='Z') a=(char) (a-25);
			  else if(a==' ');
			  else a+=1;
			  num++;
			  }
			  charr[i]=a;
		  }
	      return new String(charr);
	  }
	  public static void main(String[] args) {
		solution32 app=new solution32();
		System.out.println(app.solution("d b s Z S  G E W", 9));
	}
}
