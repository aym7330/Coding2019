package methods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AboutFile {
	public static void main(String[] args) {
		readFile("index.txt");
	}
	
	public static void readFile(String title) {
		String[] lines=new String[1000];
		int n=0;
		try {
			Scanner inFile=new Scanner(new File(title));
			while(inFile.hasNext()) {
				lines[n]=inFile.nextLine();	//next()
				n++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("No File");
			System.exit(1);
		}
		Sort.stringBubbleSort(n,lines);
		for(int i=0;i<n;i++) {
			System.out.println(lines[i]);
		}
		
	}

}
