package cup_schedulers;

import java.util.Scanner;

public class ScheduleTester{

	public static void main(String[] args) {
		
		String sr = "";
		sr += "1.First-Come-First-Serve Scheduling\n";
		sr += "2.Shortest-Job-First (Non-Preemptive) Scheduling\n";
		sr += "3.Shortest-Job-First (Preemptive) Scheduling\n";
		sr += "4.Priority (Non-Preemptive) Scheduling\n";
		sr += "5.Priority (Preemptive) Scheduling\n";
		sr += "6.Round-Robin (Non-Preemptive) Scheduling\n";
		sr += "7.Round-Robin (Preemptive) Scheduling\n";
		System.out.println(sr);
		
		//Asks the user what type of algorithm they want to run.
		Scanner algorithm = new Scanner(System.in);
		System.out.print("From the list above choose the algorithm (Enter a number): ");
		int choice = algorithm.nextInt();
		
		
		//Asks the user for the inputs.
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the number of Processes: ");
		int noOfProcesses = input.nextInt();
		
	
		//Creates a new array of type Process to store Process objects.
		Process[] processArray = new Process[noOfProcesses];
		
		//Keeps asking the same questions for each Process until it fills up the array.
		for(int i=0; i<processArray.length; i++) {
			System.out.print("\nEnter the Process Number and press enter: ");
			int processNumber = input.nextInt();
			System.out.print("Enter the CPU Burst Time in ms and press enter: ");
			int cpuBurstTime = input.nextInt();
			System.out.print("Enter the Arrival Time (0-100) and press enter: ");
			int arrivalTime = input.nextInt();
			System.out.print("Enter the Priority Level (0-127) and press enter: ");
			int priorityLevel = input.nextInt();
			System.out.print("Enter the Time Quantum Value (1-100)(Value shoud be the same for all processes) and press enter: ");
			int timeQuantumValue = input.nextInt();
			processArray[i] = new Process(processNumber,cpuBurstTime,arrivalTime,priorityLevel,timeQuantumValue);
		}
		
		//Displays the users input
		System.out.println("\n\n Proess No | CPU Burst Time | Arrival Time | Priority Level | Time Quantum Value \n");
		for(int i=0; i<processArray.length; i++) {
			System.out.println("     " + processArray[i].getProcessNo() + "\t\t   " + processArray[i].getCpuBurstTime() + "\t\t    " + processArray[i].getArrivalTime() + "\t\t    " + processArray[i].getPriorityLevel() + "\t\t     " + processArray[i].getTimeQuantumValue());
		}
		
		switch(choice) {
			case 1: FCFS f1 = new FCFS(processArray); 
	        break;
			case 2: SJF_np sjnp = new SJF_np(processArray); 
	        break;
			case 3: SJF_p sjp = new SJF_p(processArray); 
	        break;
			case 4:	PS_np psnp = new PS_np(processArray); 
	        break;
			case 5:	PS_p psp = new PS_p(processArray);
	        break;
			case 6:	RR_np RRnp = new RR_np(processArray);; 
	        break;
			case 7:	RR_p RRp = new RR_p(processArray);; 
	        break;
		}
		
		input.close();
		algorithm.close();
	}
}
