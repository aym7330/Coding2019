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
			//return;	main�Լ��� �����Ƿ� ���α׷� ����
			System.exit(9);
			/*
			 * ���� ���� 0, ������ ���� 0�̿�
			 * checkExit()���� ���� ���°��� �����ؼ� Ư�� ���� �Էµ��� ������
			 * SecurityException�� �߻����� System.exit()�� ȣ���� ������ ����ó���� �� �ֵ��� ���� ��
			 */
		}
		for(int i=0;i<n;i++) {
			System.out.println(name[i]+": "+number[i]);
		}
	}
}
