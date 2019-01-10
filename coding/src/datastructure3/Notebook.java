package datastructure3;

public class Notebook extends Computer{
	public double screenSize;
	public double weight;
	
	public Notebook(String man, String proc, int ram, int disk, double speed, double screen, double weight) {
		super(man, proc, ram,disk, speed);
		/*manufacturer=man;
		processor=proc;
		ramSize= ram;
		diskSize= disk;
		processorSpeed= speed;*/
		screenSize=screen;
		this.weight=weight;
	}
	public String toString() {	//오버라이딩
		String result=super.toString()+
				"\nScreen Size : "+screenSize+
				"\nWeight : "+weight;
		return result;
	}
	public static void main(String[] args) {
		// 다형성!!!
		Computer test=new Notebook("Dell","i5",4,1000,3.2,15.6,1.2);
/*		test.manufacturer="Dell";
		test.processor="i5";
		test.ramSize=4;
		test.diskSize=1000;
		test.processorSpeed=3.2;
		
		test.screenSize=15.6;
		test.weight=1.2;*/
			
//		System.out.println(test.computerPower());
		System.out.println(test.toString());
	}

}
