package datastructure2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code24 {
	static String[] name=new String[1000];
	static String[] number=new String[1000];
	static int n=0;
	public static void main(String[] args) {
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
			System.exit(9);
		}
		
		bubbleSort();
		for(int i=0;i<n;i++) {
			System.out.println(name[i]+": "+number[i]);
		}
	}
	static void bubbleSort() {
		for(int i=n-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(name[j].compareTo(name[j+1])>0) {
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
