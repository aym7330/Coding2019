// 문자열 내 마음대로 정렬하기
// https://programmers.co.kr/learn/courses/30/lessons/12915?language=java
package level1;

import java.util.Arrays;

public class solution13_f {

	public String[] solution(String[] strings, int n) {
		for (int i = strings.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (strings[j].charAt(n)>strings[j + 1].charAt(n)) {
					String tmp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = tmp;
				}
				else if (strings[j].charAt(n)==strings[j + 1].charAt(n)) {
					if(strings[j].compareTo(strings[j+1])>0) {
					String tmp = strings[j];
					strings[j] = strings[j + 1];
					strings[j + 1] = tmp;
					}
				}
				
			}
		}
		return strings;
	}

	/*
	 * public String[] solution(String[] strings, int n) {
	 * 
	 * for (int i = strings.length - 1; i > 0; i--) { for (int j = 0; j < i; j++) {
	 * char a = strings[j].charAt(n); char b = strings[j + 1].charAt(n); if
	 * (check(a, b) == 1) { String tmp = strings[j]; strings[j] = strings[j + 1];
	 * strings[j + 1] = tmp; } else if (check(a, b) == 0) { n++; a =
	 * strings[j].charAt(n); b = strings[j + 1].charAt(n); if (check(a, b) == 1) {
	 * String tmp = strings[j]; strings[j] = strings[j + 1]; strings[j + 1] = tmp; }
	 * n--; } } } return strings; }
	 * 
	 * public int check(char a, char b) { if (a > b) return 1; else if (a == b)
	 * return 0; else return -1; }
	 */

}
