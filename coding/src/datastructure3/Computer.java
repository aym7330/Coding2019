package datastructure3;

public class Computer {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	public Computer(String man, String proc, int ram, int disk, double speed) {
		manufacturer=man;
		processor=proc;
		ramSize= ram;
		diskSize= disk;
		processorSpeed= speed;

	}
/*	public Computer() {
		
	}*/
	public double computerPower() {
		return ramSize*processorSpeed;
	}
	public String toString() {
		String result="Manufacturer : "+manufacturer+
				"\nCPU : "+processor+
				"\nRAM : "+ramSize+
				"\nDisk : "+diskSize+
				"\nProcessor Speed : "+processorSpeed;
		return result;
	}
	public int getRamSize() {
		return ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	
}
