package project_book;

public class BookDetails {
	public static Branch showMechanical()
	{
	Book book[]=new Book[3];
	
	book[0]=new Book(1,"SOM",350,3);
	book[1]=new Book(2,"TOM",300,4);
	book[2]=new Book(3,"DME",400,3);
	 Branch b=new Branch("Mechanical",book);

	return b;
	}
	
	public static Branch showCivil()
	{
	Book book[]=new Book[3];
	
	book[0]=new Book(1,"SOM",350,3);
	book[1]=new Book(2,"Construction",300,4);
	book[2]=new Book(3,"Serveying",400,3);
	 Branch b=new Branch("Civil",book);

	return b;
	}
	
	public static Branch showElectrical()
	{
	Book book[]=new Book[3];
	
	book[0]=new Book(1,"Network Analysis",350,3);
	book[1]=new Book(2,"BEDC",300,4);
	book[2]=new Book(3,"DSP",400,3);
	 Branch b=new Branch("Electrical",book);
	 
	
	return b;
	}
	
	public static Branch showIT()
	{ Book book[]=new Book[4];
	
	book[0]=new Book(1,"c",350,3);
	book[1]=new Book(2,"c++",300,4);
	book[2]=new Book(3,"java",400,3);
	book[3]=new Book(4,"html",400,3);
	 Branch b=new Branch("I.T",book);
	
	
	return b;
	}


}
