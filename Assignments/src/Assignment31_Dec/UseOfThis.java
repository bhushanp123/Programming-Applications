package Assignment31_Dec;

public class UseOfThis {
	int id;
	String password;
	String name;
	
	UseOfThis(int id,String password,String name)
	{
		this.id = id;
		this.password = password;
		this.name = name;
	}
	public void display()
	{
		System.out.println("Id is : "+id);
		System.out.println("name is : "+name);
		this.checkPassword();
		
	}
	public void checkPassword()
	{
		if(this.password.equals(password))
		{
			System.out.println("Welcome !!!");
		}
		else
		{
			System.out.println("Wrong password");
		}
	}

	public static void main(String[] args) {
		UseOfThis obj = new UseOfThis(123,"123456","Bhushan");
		
		obj.display();

	}

}
