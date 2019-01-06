// 나누어 떨어지는 숫자 배열
// https://programmers.co.kr/learn/courses/30/lessons/12910
// arraylist로 다시 풀어보기
package level1;

public class solution6 {
	  public static int[] solution(int[] arr, int divisor) {
		  int count=0;
		  int n=arr.length;
	      for(int i=0;i<n;i++)
	    	  if(arr[i]%divisor==0)
	    		  count++;
	      int[] answer;
	      if(count==0) {
	    	  answer=new int[1];
	    	  answer[0]= -1;
	    	  return answer;
	      }
	      else {
	    	  answer=new int[count];
	    	  int k=0;
			  for(int i=0;i<n;i++) {
		    	  if(arr[i]%divisor==0) {
		    		  answer[k]=arr[i];
		    		  k++;
		    	  }
			  }
			  for(int i=count-1;i>0;i--) {
				  for(int j=0;j<i;j++) {
					  if(answer[j]>answer[j+1]) {
						int temp=answer[j];
						answer[j]=answer[j+1];
						answer[j+1]=temp;
					  }
				  }
						  
			  }
		      return answer;
	      }
	  }
	  public static void main(String[] args) {
		  int[] arr= {2,36,1,3};
		  int[] arr1=solution(arr, 1);
		  for(int i=0;i<arr1.length;i++)
			  System.out.println(arr1[i]);
	}
}
