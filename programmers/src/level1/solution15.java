// 이상한 문자 만들기
// https://programmers.co.kr/learn/courses/30/lessons/12930?language=java

package level1;

import java.util.Arrays;
import java.util.Collections;

public class solution15 {
	public String solution(String s) {
		String[] str = s.split("");
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			while (true) {
				if (str[i].equals(" ")) {
					j=0;
					break;
				}
				if (j % 2 == 0) {
					str[i] = str[i].toUpperCase();
					j++;
					break;
				}
				else {
					str[i] = str[i].toLowerCase();
					j++;
					break;
				}
			}			
		}
		StringBuffer strs = new StringBuffer();
		for (String tmp : str) {
			strs.append(tmp);
		}
		String answer = strs.toString();
		return answer;
	}
	public static void main(String[] args) {
		solution15 app=new solution15();
		app.solution("try hello world");
	}
	
/*	  public String solution(String s) {

	        String answer = "";
	        int cnt = 0;
	        String[] array = s.split("");

	        for(String ss : array) {
	            cnt = ss.contains(" ") ? 0 : cnt + 1;
	            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
	        }
	      return answer;
	  }*/
}
