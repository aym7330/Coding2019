package datastructure2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code10 {
	public static void main(String[] args) {
		try {
			Scanner in=new Scanner(new File("dataRet.txt"));
			int n= in.nextInt();
			OrthoPolygon thePolygon=new OrthoPolygon(n);
			for(int i=0;i<n;i++)
				thePolygon.addVertes(in.nextInt(), in.nextInt());
			MyPoint2 thePoint=new MyPoint2(in.nextInt(), in.nextInt());
			in.close();
			
			if(thePolygon.contains(thePoint))
				System.out.println("Yes");
			else
				System.out.println("No");
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(1);
		}
	}
}
