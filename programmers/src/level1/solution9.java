// ���￡�� �輭�� ã��
// https://programmers.co.kr/learn/courses/30/lessons/12919?language=java
package level1;

public class solution9 {
	  public String solution(String[] seoul) {
	      for(int i=0;i<seoul.length;i++)
	          if(seoul[i].equals("Kim"))
	              return "�輭���� "+i+"�� �ִ�";
	      return "";
	  }
	  
/*	    public String findKim(String[] seoul){
	        //x�� �輭���� ��ġ�� �����ϼ���.
	        int x = Arrays.asList(seoul).indexOf("Kim");

	        return "�輭���� "+ x + "�� �ִ�";
	    }*/
}
