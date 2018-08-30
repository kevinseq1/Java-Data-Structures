package cup_schedulers;

public class RR_np {
	

	//Data Members
	protected Process[] processArray;
	protected double averageWaitTime;
	protected Process temp;
	protected int numberOfProcessCompleted = 0;
	
	//Constructors
	public RR_np(Process[] processArray){
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
				

		for(int i=0; i<processArray.length; i++) {
			if(i == 0) {
				processArray[i].setWaitTime(0);
				if(processArray[i].getCpuBurstTime() > processArray[i].getTimeQuantumValue()) {
					processArray[i].setCpuBurstTime(processArray[i].getCpuBurstTime() - processArray[i].getTimeQuantumValue());
					processArray[i].setTimeProcessRan(processArray[i].getTimeQuantumValue());
					processArray[i].setNumberOfTimesProcessRan(processArray[i].getNumberOfTimesProcessRan() + 1);
				} else {
					processArray[i].setTimeProcessRan(processArray[i].getCpuBurstTime());
					processArray[i].setCpuBurstTime(0);
					processArray[i].setNumberOfTimesProcessRan(processArray[i].getNumberOfTimesProcessRan() + 1);
					processArray[i].setProcessComplete(true);
					numberOfProcessCompleted  += 1;
				}
			} else {
				processArray[i].setWaitTime(processArray[i-1].getTimeProcessRan() + processArray[i-1].getWaitTime());
				if(processArray[i].getCpuBurstTime() > processArray[i].getTimeQuantumValue()) {
					processArray[i].setCpuBurstTime(processArray[i].getCpuBurstTime() - processArray[i].getTimeQuantumValue());
					processArray[i].setTimeProcessRan(processArray[i].getTimeQuantumValue());
					processArray[i].setNumberOfTimesProcessRan(processArray[i].getNumberOfTimesProcessRan() + 1);
				} else {
					processArray[i].setTimeProcessRan(processArray[i].getCpuBurstTime());
					processArray[i].setCpuBurstTime(0);
					processArray[i].setNumberOfTimesProcessRan(processArray[i].getNumberOfTimesProcessRan() + 1);
					processArray[i].setProcessComplete(true);
					numberOfProcessCompleted  += 1;
				}
			} 
		}
	
		
		while(numberOfProcessCompleted != processArray.length) {
			for(int i=0; i<processArray.length; i++) {
				if(!processArray[i].getProcessComplete()) {

					int location = 0;
					int largest = 0;
					for(int j=0; j<processArray.length; j++) {
						if(processArray[j].getWaitTime() > largest) {
							largest = processArray[j].getWaitTime();
								location = j;
						}
					}
						
					processArray[i].setWaitTime(processArray[location].getTimeProcessRan() + processArray[location].getWaitTime());
					if(processArray[i].getCpuBurstTime() > processArray[i].getTimeQuantumValue()) {
						processArray[i].setCpuBurstTime(processArray[i].getCpuBurstTime() - processArray[i].getTimeQuantumValue());
						processArray[i].setTimeProcessRan(processArray[i].getTimeQuantumValue());
						processArray[i].setNumberOfTimesProcessRan(processArray[i].getNumberOfTimesProcessRan() + 1);
					} else {
						processArray[i].setTimeProcessRan(processArray[i].getCpuBurstTime());
						processArray[i].setCpuBurstTime(0);
						processArray[i].setNumberOfTimesProcessRan(processArray[i].getNumberOfTimesProcessRan() + 1);
						processArray[i].setProcessComplete(true);
						numberOfProcessCompleted  += 1;
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
				totalWaitTime += (processArray[i].getWaitTime() - ((processArray[i].getNumberOfTimesProcessRan() - 1) * processArray[i].getTimeQuantumValue()));
			}
		averageWaitTime = totalWaitTime / processArray.length;
		System.out.println("\nThe Average Waiting Time for RR_np is: " + averageWaitTime);
		}

}
