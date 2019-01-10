package datastructure3;

import java.util.Scanner;

public class Scheduler {
	
/*	OneDayEvent[] ondays=new OneDayEvent[100];
	DurationEvent[] durations=new DurationEvent[100];
	DeadlinedEvent[] deadlines=new DeadlinedEvent[100];
	int n1=0, n2=0, n3=0; */
	public Event[] events=new Event[100];
	public int n=0;
	
	
	public void processCommand() {
		Scanner kb=new Scanner(System.in);
		while(true) {
			System.out.print("$ ");
			String command=kb.next();
			if(command.equals("addevent")) {
				
			}
			else if(command.equals("list")) {
				
			}
			else if (command.equals("show")) {

			} else if (command.equals("exit")) {
				break;
			}	
		}
		kb.close();
	}
	public static void main(String[] args) {
		Scheduler app=new Scheduler();
		app.processCommand();
	}
}
