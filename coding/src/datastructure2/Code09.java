package datastructure2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;

public class Code09 {

	static MyRectangle2[] rects=new MyRectangle2[100];
	static int n = 0;

	public static void main(String[] args) {
		
		try {
			Scanner in = new Scanner(new File("dataR.txt"));
			while (in.hasNext()) {
				rects[n++]=new MyRectangle2(in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt());
/*				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt();
				rects[n].height = in.nextInt();
				n++;*/
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
		}
		
		bubblesort();
		
		for(int i=0;i<n;i++)
			System.out.println(rects[i].toString());
	}

	private static void bubblesort() {
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(rects[j].calcArea()>rects[j+1].calcArea()) {
					MyRectangle2 temp=rects[j];	// �ּҸ� swap�ϸ� ��
					rects[j]=rects[j+1];
					rects[j+1]=temp;
				}
			}
		}		
	}

}
