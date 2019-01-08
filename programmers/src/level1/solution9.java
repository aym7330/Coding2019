// 서울에서 김서방 찾기
// https://programmers.co.kr/learn/courses/30/lessons/12919?language=java
package level1;

public class solution9 {
	  public String solution(String[] seoul) {
	      for(int i=0;i<seoul.length;i++)
	          if(seoul[i].equals("Kim"))
	              return "김서방은 "+i+"에 있다";
	      return "";
	  }
	  
/*	    public String findKim(String[] seoul){
	        //x에 김서방의 위치를 저장하세요.
	        int x = Arrays.asList(seoul).indexOf("Kim");

	        return "김서방은 "+ x + "에 있다";
	    }*/
}
