package cup_schedulers;

public class Process {

	//Data Members
	protected int processNo = 0;
	protected int cpuBurstTime = 0;
	protected int arrivalTime = 0;
	protected int priorityLevel = 0;
	protected int timeQuantumValue = 0;
	protected int waitTime = 0;
	protected int incompleteProcessCpuBurstTime;
	protected int numberOfTimesProcessRan = 0;
	protected int timeProcessRan = 0;
	protected boolean processComplete = false;
	
	//Constructor
	public Process() {
	}
	
	public Process(int processNo, int cpuBurstTime, int arrivalTime, int priorityLevel, int timeQuantumValue) {
		this.processNo = processNo;
		this.cpuBurstTime = cpuBurstTime;
		this.arrivalTime = arrivalTime;
		this.priorityLevel = priorityLevel;
		this.timeQuantumValue = timeQuantumValue;
	}
	
	//Methods
	public int getProcessNo() {
		return processNo;
	}

	public void setProcessNo(int processNo) {
		this.processNo = processNo;
	}

	public int getCpuBurstTime() {
		return cpuBurstTime;
	}

	public void setCpuBurstTime(int cpuBurstTime) {
		this.cpuBurstTime = cpuBurstTime;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	
	public int getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public int getTimeQuantumValue() {
		return timeQuantumValue;
	}

	public void setTimeQuantumValue(int timeQuantumValue) {
		this.timeQuantumValue = timeQuantumValue;
	}
	
	public int getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}
	
	public int getIncompleteProcessCpuBurstTime() {
		return incompleteProcessCpuBurstTime;
	}

	public void setIncompleteProcessCpuBurstTime(int incompleteProcessCpuBurstTime) {
		this.incompleteProcessCpuBurstTime = incompleteProcessCpuBurstTime;
	}
	
	public int getNumberOfTimesProcessRan() {
		return numberOfTimesProcessRan;
	}

	public void setNumberOfTimesProcessRan(int numberOfTimesProcessRan) {
		this.numberOfTimesProcessRan = numberOfTimesProcessRan;
	}
	
	public int getTimeProcessRan() {
		return timeProcessRan;
	}

	public void setTimeProcessRan(int timeProcessRan) {
		this.timeProcessRan = timeProcessRan;
	}
	
	public boolean getProcessComplete() {
		return processComplete;
	}

	public void setProcessComplete(boolean processComplete) {
		this.processComplete = processComplete;
	}
	
}
