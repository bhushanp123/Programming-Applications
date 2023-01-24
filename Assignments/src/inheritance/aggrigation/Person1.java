package inheritance.aggrigation;

public class Person1 {
	String s_name;
	String s_mobileNo;
	Mobile1 m;
	
	Person1(String s_name, String s_mobileNo, Mobile1 m)
	{
		this.s_name = s_name;
		this.s_mobileNo = s_mobileNo;
		this.m = m;
	}
	
	public String toString()
	{
		return s_name + " " + s_mobileNo + " " + m;
	}
}
