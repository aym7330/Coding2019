// 문자열 다루기 기본
// https://programmers.co.kr/learn/courses/30/lessons/12918?language=java
package level1;

public class solution10 {
	public static boolean solution(String s) {
		boolean answer = false;
		int n = s.length();
		if (n == 4 || n == 6) {
			for (int i = 0; i < n; i++) {
				System.out.println(s.substring(i, i + 1));
				try {
					Integer.parseInt(s.substring(i, i + 1));
					answer=true;
				} catch (Exception e) {
					answer = false;
					break;
				}
			}
		}
		return answer;
	}
/*	  public boolean solution(String s) {
	        if (s.length() == 4 || s.length() == 6) return s.matches("(^[0-9]*$)");
	        return false;
	  }*/
	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}
}
