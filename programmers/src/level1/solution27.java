// Çà·ÄÀÇ µ¡¼À
// https://programmers.co.kr/learn/courses/30/lessons/12950?language=java
package level1;

public class solution27 {
	  public int[][] solution(int[][] arr1, int[][] arr2) {
		  int n1=arr1.length;
		  int n2=arr1[0].length;
	      int[][] answer = new int[n1][n2];
	      for(int i=0;i<n1;i++) 
	    	  for(int j=0;j<n2;j++)
	    		  answer[i][j]=arr1[i][j]+arr2[i][j];	      
	      return answer;
	  }
}
