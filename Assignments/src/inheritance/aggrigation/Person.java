package inheritance.aggrigation;

public class Person {
	String s_name;
	String s_mobileNo;
	Mobile m;
	
	public void setS_name(String s_name)
	{
		this.s_name = s_name;
	}
	public String getS_name()
	{
		return s_name;
	}
	
	public void setS_mobileNo(String s_mobileNo)
	{
		this.s_mobileNo = s_mobileNo;
	}
	public String getS_mobileNo()
	{
		return s_mobileNo;
	}
	
	public Mobile getM()
	{
		return m;
	}
	public void setM(Mobile m)
	{
		this.m = m;
	}
	
	public String toString()
	{
		return s_name + " " + s_mobileNo + " " + m;
	}
}
