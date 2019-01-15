// ÇÏ»şµå ¼ö
// https://programmers.co.kr/learn/courses/30/lessons/12947
package level1;

public class solution25 {
	  public boolean solution(int x) {
		  int num=0;
		  int val=x;
		  while(val>=10) {
			  num+=val%10;
			  val/=10;
		  }
          num+=val;
		  return x%num==0?true:false;
	  }
}
