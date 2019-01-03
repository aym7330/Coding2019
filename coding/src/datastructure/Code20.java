package datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code20 {
	static String[] name=new String[1000];
	static String[] number=new String[1000];
	static int n=0;
	public static void main(String[] args) {

		/*String filename="input.txt";
		Scanner infile=new Scanner(new File(filename));*/
		try {
			Scanner infile = new Scanner(new File("input.txt"));
			while(infile.hasNext()) {	// detect end of file
				name[n]=infile.next();
				number[n]=infile.next();
				n++;
			}
			infile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			//return;	main함수에 있으므로 프로그램 종료
			System.exit(9);
			/*
			 * 정상 종료 0, 비정상 종료 0이외
			 * checkExit()에서 종료 상태값을 조사해서 특정 값이 입력되지 않으면
			 * SecurityException을 발생시켜 System.exit()를 호출할 곳에서 예외처리할 수 있도록 도와 줌
			 */
		}
		
		bubbleSort();
		for(int i=0;i<n;i++) {
			System.out.println(name[i]+": "+number[i]);
		}
	}
	static void bubbleSort() {
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(name[j].compareTo(name[j+1])>0) {	//오름차순
					//swap
					String temp=name[j];
					name[j]=name[j+1];
					name[j+1]=temp;
					
					temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
	}
}
