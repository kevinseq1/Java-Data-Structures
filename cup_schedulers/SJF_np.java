package cup_schedulers;

public class SJF_np {

	//Data Members
		protected Process[] processArray;
		protected double averageWaitTime;
		protected Process temp;
		
		//Constructors
		public SJF_np(Process[] processArray){
			this.processArray = processArray;
			calculateAverageWaitTime();
		}
		
		
		
		//Methods 
		
		//First sorts the array in ascending order of their arrival time and then sets the wait time for each process.
		public void setTheWaitTime(){
			
			//Sorts the Process array in ascending order of the Arrival time.
			for(int i=0; i<processArray.length; i++) {
				for(int j=i+1; j<processArray.length; j++) {
					if(processArray[i].getCpuBurstTime() > processArray[j].getCpuBurstTime()) {
						temp = processArray[i];
						processArray[i] = processArray[j];
						processArray[j] = temp;
					}
				}
			}
					
			//Sets the wait time for each process.
			for(int i=0; i<processArray.length; i++) {
				if(i == 0) {
					processArray[i].setWaitTime(0); 
				} else if(i == 1) {
					processArray[i].setWaitTime(processArray[i-1].getCpuBurstTime());
				} else {
					processArray[i].setWaitTime(processArray[i-1].getCpuBurstTime() + processArray[i-1].getWaitTime());
				}
			}
		}
		

		
		//Calculate the average wait time.
		public void calculateAverageWaitTime(){
			setTheWaitTime();
			double totalWaitTime = 0;
			for(int i=0; i<processArray.length; i++) {
				totalWaitTime += processArray[i].getWaitTime();
			}
			averageWaitTime = totalWaitTime / processArray.length;
			System.out.println("\nThe Average Waiting Time for SJF_np is: " + averageWaitTime);
		}
		
			
}