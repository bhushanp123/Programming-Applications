package Assignment31_Dec;

public class Student {
	private int studentId;
	private String studentName,studentAddress,collegeName;
	
	Student(int studentId,String studentName,String studentAddress)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public String getCollegeName()
	{
		return "NIT";
	}
	
	Student(int studentId,String studentName,String studentAddress,String collegeName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}
}

