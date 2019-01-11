// 자릿수 더하기
// https://programmers.co.kr/learn/courses/30/lessons/12931?language=java
package level1;

public class solution16 {
	 public int solution(int n) {
	        int answer = 0;
	        String str=String.valueOf(n);
	        String[] strs=str.split("");
	        for(int i=0;i<strs.length;i++)
	        	answer+=Integer.parseInt(strs[i]);
	        return answer;
	    }
	 public static void main(String[] args) {
		solution16 app=new solution16();
		System.out.println(app.solution(14));
	}
/*	   public int solution(int n) {
	        int answer = 0;

	        while(true){
	            answer+=n%10;
	            if(n<10)
	                break;

	            n=n/10;
	        }*/
	 
/*	    public int solution(int n) {
	        int answer = 0;
	        String[] array = String.valueOf(n).split("");
	        for(String s : array){
	            answer += Integer.parseInt(s);
	        }
	        return answer;
	    }*/
}
