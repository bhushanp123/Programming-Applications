package Assignment3;

public class Empoloye1Main {

	public static void main(String[] args) {
		Employe1 e = new Employe1();
		
		e.setemployeeId(101);
		e.setEmployeeName("Vivek");
		e.setSalary(20000);
		
		System.out.println(e.getemployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println(e.getSalary());
		
		e.calculateNetSlary(7);
	}
}
