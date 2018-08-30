package cup_schedulers;

public class PS_p {

	//Data Members
	protected Process[] processArray;
	protected double averageWaitTime;
	protected Process temp;
	protected int numberOfProcessCompleted = 0;
	
	//Constructors
	public PS_p(Process[] processArray){
		this.processArray = processArray;
		calculateAverageWaitTime();
	}
	
	
	
	//Methods 
	
	//First sorts the array in ascending order of their arrival time and then sets the wait time for each process.
	public void setTheWaitTime(){
		
		//Sorts the Process array in ascending order of the Arrival time.
		for(int i=0; i<processArray.length; i++) {
			for(int j=i+1; j<processArray.length; j++) {
				if(processArray[i].getArrivalTime() > processArray[j].getArrivalTime()) {
					temp = processArray[i];
					processArray[i] = processArray[j];
					processArray[j] = temp;
				}
			}
		}
		
		
		
		
		
		
		while(numberOfProcessCompleted != processArray.length) {
			for(int i=0; i<processArray.length; i++) {
				if(!processArray[i].getProcessComplete()) {
					if(!(processArray[i].getNumberOfTimesProcessRan() >= 1)) {
						if(i == 0) {
							processArray[i].setWaitTime(0);
							if(processArray[i].getCpuBurstTime() == 1) {
								processArray[i].setProcessComplete(true);
								processArray[i].setNumberOfTimesProcessRan(processArray[i].getNumberOfTimesProcessRan() + 1);
								processArray[i].setCpuBurstTime(0);
								processArray[i].setTimeProcessRan(processArray[i].getCpuBurstTime());
								numberOfProcessCompleted += 1;
							} else {
								processArray[i].setNumberOfTimesProcessRan(processArray[i].getNumberOfTimesProcessRan() + 1);
								processArray[i].setCpuBurstTime(processArray[i].getCpuBurstTime() - 1);
								processArray[i].setTimeProcessRan(processArray[i].getTimeProcessRan() + 1);
							}
						} else {
							//find the process with the shortest burst time in the array.
							int location = i;
							int smallest = processArray[i].getCpuBurstTime();
							for(int j=0; j<processArray.length; j++) {
								if(processArray[j].getCpuBurstTime() < smallest && !processArray[j].getProcessComplete()) {
									smallest = processArray[j].getCpuBurstTime();
									location = j;
								}
							}
						
						
							int locationOfLargest = 0;
							int largest = processArray[0].getTimeProcessRan();
							for(int j=0; j<processArray.length; j++) {
								if(processArray[j].getTimeProcessRan() > largest) {
									largest = processArray[j].getTimeProcessRan();
									locationOfLargest = j;
								}
							}
							processArray[location].setWaitTime(processArray[locationOfLargest].getTimeProcessRan() + processArray[locationOfLargest].getWaitTime());
							processArray[location].setProcessComplete(true);
							processArray[location].setTimeProcessRan(processArray[location].getCpuBurstTime());
							processArray[location].setCpuBurstTime(0);
							processArray[location].setNumberOfTimesProcessRan(processArray[location].getNumberOfTimesProcessRan() + 1);
							numberOfProcessCompleted += 1;
											
						}
					
					
					} else {
						//find the process with the shortest burst time in the array.
						int location = i;
						int smallest = processArray[i].getCpuBurstTime();
						for(int j=0; j<processArray.length; j++) {
							if(processArray[j].getCpuBurstTime() < smallest && !processArray[j].getProcessComplete()) {
								smallest = processArray[j].getCpuBurstTime();
								location = j;
							}
						}
					
					
						int locationOfLargest = 0;
						int largest = processArray[0].getTimeProcessRan();
						for(int j=0; j<processArray.length; j++) {
							if(processArray[j].getTimeProcessRan() > largest) {
								largest = processArray[j].getTimeProcessRan();
								locationOfLargest = j;
							}
						}
						processArray[location].setWaitTime(processArray[location].getWaitTime() + processArray[locationOfLargest].getTimeProcessRan() + processArray[locationOfLargest].getWaitTime());
						processArray[location].setProcessComplete(true);
						processArray[location].setTimeProcessRan(processArray[location].getCpuBurstTime());
						processArray[location].setCpuBurstTime(0);
						processArray[location].setNumberOfTimesProcessRan(processArray[location].getNumberOfTimesProcessRan() + 1);
						numberOfProcessCompleted += 1;
										
					}
				}
			}
		}
	
	


	}
		

		
		//Calculate the average wait time.
		public void calculateAverageWaitTime(){
			setTheWaitTime();
			double totalWaitTime = 0;
			for(int i=0; i<processArray.length; i++) {
				totalWaitTime += processArray[i].getWaitTime();
				System.out.println(processArray[i].getCpuBurstTime());
			}
			averageWaitTime = totalWaitTime / processArray.length;
			System.out.println("The Average Waiting Time for PS_p is: " + averageWaitTime);
		}
		
			
}
