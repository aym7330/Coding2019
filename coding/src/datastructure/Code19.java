package datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
	public static void main(String[] args) {
		String[] name=new String[1000];
		String[] number=new String[1000];
		int n=0;
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
		for(int i=0;i<n;i++) {
			System.out.println(name[i]+": "+number[i]);
		}
	}
}
