package assignments_7jan;

class Laptop
{
	private int noOfUSBPorts;
	private int processorSpeed;
	
	public void setNoOfUSBPorts(int noOfUSBPorts)
	{
		this.noOfUSBPorts = noOfUSBPorts;
	}
	public int getNoOfUSBPorts()
	{
		return noOfUSBPorts;
	}
	
	public void setProcessorSpeed(int processorSpeed)
	{
		this.processorSpeed = processorSpeed;
	}
	public int getProcessorSpeed()
	{
		return processorSpeed;
	}
}

public class LaptopMain {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		
		l.setNoOfUSBPorts(4);
		l.setProcessorSpeed(2);
		
		System.out.println("Number of ports are : "+l.getNoOfUSBPorts());
		System.out.println("Processor speed is : "+l.getProcessorSpeed() + " GHz");
	}

}
