package datastructure2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code01 {

	public static void main(String[] args) {
		Person1 first;	// ��ü ����
		first=new Person1();	// ��ü ����
		
		first.name="John";
		first.number="01020445511";
		
		System.out.println("Name:"+first.name+",Number:"+first.number);
		
		Person1[] numbers=new Person1[100];
		numbers[0]=first;
		numbers[1]=new Person1();
		numbers[1].name="David";
		numbers[1].number="01023249551";
		
		System.out.println("Name:"+numbers[1].name+",Number:"+numbers[1].number);		
	}
}