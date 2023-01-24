package Assignment3;

public class Employe1 {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	public void setemployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	public int getemployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void setNetSalary(double netSalary)
	{
		this.netSalary = netSalary;
	}
	public double getNetSalary()
	{
		return netSalary;
	}
	
	public void calculateNetSlary(int pfpercentage)
	{
		netSalary = salary - ((pfpercentage * salary) / 100);
		System.out.println(netSalary); 
	}

}
