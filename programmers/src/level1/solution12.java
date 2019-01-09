// 문자열 내 p와 y의 개수
// https://programmers.co.kr/learn/courses/30/lessons/12916?language=java

package level1;

public class solution12 {
	boolean solution(String s) {
		String trans=s.toLowerCase();
		int pcount=0;
		int ycount=0;
		for(int i=0;i<s.length();i++)
		{
			if(trans.charAt(i)=='p')
				pcount++;
			if(trans.charAt(i)=='y')
				ycount++;
			
		}
		if(pcount==ycount)
			return true;
		else 
			return false;
	}
/*	   boolean solution(String s) {
	        s = s.toUpperCase();

	        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
	    }*/
}
