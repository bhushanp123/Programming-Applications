package Assignment3;

public class TestBook {
	
	public static void main(String[] arg)
	{
		Book b1 = new Book();
		
		b1.setBookName("Java");
		b1.setBookPrice(500);
		b1.setAuthorName("Einstine");
		
		System.out.println(b1.getBookName());
		System.out.println(b1.getBookPrice());
		System.out.println(b1.getAuthorName());
	}

}
