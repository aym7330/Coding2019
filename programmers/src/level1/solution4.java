// ���ڼ��ڼ��ڼ��ڼ��ڼ�?
// https://programmers.co.kr/learn/courses/30/lessons/12922
package level1;

public class solution4 {
	public static String solution(int n) {
		StringBuffer m = new StringBuffer();
		for (int i = 0; i < n / 2; i++)
			m.append("����");

		if (n % 2 == 1)
			m.append("��");
		String answer = m.toString();
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(3));
	}
	 
/*    public String watermelon(int n){
    String result = "";
    for (int i = 0; i < n; i++)
      result += i % 2 == 0 ? "��" : "��";
        return result;
    }*/
/*	public String watermelon(int n) {

		return new String(new char[n / 2 + 1]).replace("\0", "����").substring(0, n);
	}*/
}
