package datastructure2;

public class Code01_2 {
	public static void main(String[] args) {
		Person1 first;	// ��ü ����
		first=new Person1();	// ��ü ����
		
		first.name="John";
		first.number="01020445511";
		
		System.out.println("Name:"+first.name+",Number:"+first.number);
		
		Person1 second=first;	// second�� �ּҸ� ����
		System.out.println("Name:"+second.name+",Number:"+second.number);
		
		second.name="Tom";
		System.out.println("Name:"+first.name+",Number:"+first.number);

		Person1[] numbers=new Person1[100];
		numbers[0]=first;	// �ּҰ��� ����
		numbers[1]=second;
	    System.out.println("Name:"+numbers[0].name+",Number:"+numbers[0].number);		
	    System.out.println("Name:"+numbers[1].name+",Number:"+numbers[1].number);		
	    
	    numbers[2]=new Person1();
	    numbers[2].name="Daivd";
	    numbers[2].number="887554311";
	    System.out.println("Name:"+numbers[2].name+",Number:"+numbers[2].number);		

	}
}
