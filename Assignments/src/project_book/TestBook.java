package project_book;

import java.util.Date;
import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		System.out.println("Branches");
		System.out.println("1.Electrical");
		System.out.println("2 I.T");
		System.out.println("3 Mechanical");
		System.out.println("4 Civil");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the branch");
		String branch=sc.next();

	/*	Branch b = BookDetails.showElectrical();
		Branch b1 = BookDetails.showIT();
		Branch b2 = BookDetails.showMechanical();
		Branch b3 = BookDetails.showCivil();*/
		
		switch(branch)
		{
			case "Mechanical":
				Branch b = BookDetails.showMechanical();
				Book book[] = b.getB();
				
				int i = 0;
				for( i=0;i<book.length;i++)
				{
					System.out.println(book[i].getId()+" "+book[i].getName()+" "+book[i].getPrice() + " " + book[i].getNo_of_copies());
				}
				
				System.out.println("Enter book you want to select");
				String book_name=sc.next();
				
				boolean flag = false;
				
				for( i=0;i<book.length;i++)
				{
					if(book[i].getName().equals(book_name))
					{
						flag = true;
						break;	
					}	
				}
				
				if(flag == true)
				{
					System.out.println("Checking for avilablity");
				}
				else
				{
					System.out.println("sorry this book is not available");
					return;
				}
				
				System.out.println("how many copies you want");
				int copies=sc.nextInt();
				
				if(copies > book[i].getNo_of_copies())
				{
					System.out.println("No such number of copies available");
					System.out.println("The available copies are : "+book[i].getNo_of_copies());
					
					System.out.println("Reenter how many copies you want");
					copies=sc.nextInt();
					
					if(copies > book[i].getNo_of_copies())
					{
						System.out.println("No such number of copies available");
						return;
					}
					
					
				}
				
				book[i].setNo_of_copies(book[i].getNo_of_copies()-copies);
			
				System.out.println("enter ur name");
				String name=sc.next();
				
				Date d=new Date();
				System.out.println(name +" ur book is booked on.."+d);
				System.out.println("Plz return book within 7 days");
				
				break;
				
			case "Civil":
				Branch b1 = BookDetails.showCivil();
				Book book1[] = b1.getB();
				
				int j = 0;
				for( j=0; j < book1.length; j++)
				{
					System.out.println(book1[j].getId()+" "+book1[j].getName()+" "+book1[j].getPrice() + " " + book1[j].getNo_of_copies());
				}
				
				System.out.println("Enter book you want to select");
				String book_name1=sc.next();
				
				boolean flag1 = false;
				
				for( j = 0; j < book1.length; j++)
				{
					if(book1[j].getName().equals(book_name1))
					{
						flag1 = true;
						break;	
					}	
				}
				
				if(flag1 == true)
				{
					System.out.println("Checking for avilablity");
				}
				else
				{
					System.out.println("sorry this book is not available");
					return;
				}
				
				System.out.println("how many copies you want");
				int copies1=sc.nextInt();
				
				if(copies1 > book1[j].getNo_of_copies())
				{
					System.out.println("No such number of copies available");
					System.out.println("The available copies are : "+book1[j].getNo_of_copies());
					
					System.out.println("Reenter how many copies you want");
					copies=sc.nextInt();
					
					if(copies1 > book1[j].getNo_of_copies())
					{
						System.out.println("No such number of copies available");
						return;
					}
					
					
				}
				
				book1[j].setNo_of_copies(book1[j].getNo_of_copies()-copies1);
			
				System.out.println("enter ur name");
				String name1=sc.next();
				
				Date d1=new Date();
				System.out.println(name1 +" ur book is booked on.."+d1);
				System.out.println("Plz return book within 7 days");
				
				break;
				
			case "I.T":
				Branch b2 = BookDetails.showIT();
				Book book2[] = b2.getB();
				
				j = 0;
				for( j=0; j < book2.length; j++)
				{
					System.out.println(book2[j].getId()+" "+book2[j].getName()+" "+book2[j].getPrice() + " " + book2[j].getNo_of_copies());
				}
				
				System.out.println("Enter book you want to select");
				String book_name2 = sc.next();
				
				flag1 = false;
				
				for( j = 0; j < book2.length; j++)
				{
					if(book2[j].getName().equals(book_name2))
					{
						flag1 = true;
						break;	
					}	
				}
				
				if(flag1 == true)
				{
					System.out.println("Checking for avilablity");
				}
				else
				{
					System.out.println("sorry this book is not available");
					return;
				}
				
				System.out.println("how many copies you want");
				int copies2=sc.nextInt();
				
				if(copies2 > book2[j].getNo_of_copies())
				{
					System.out.println("No such number of copies available");
					System.out.println("The available copies are : "+book2[j].getNo_of_copies());
					
					System.out.println("Reenter how many copies you want");
					copies=sc.nextInt();
					
					if(copies2 > book2[j].getNo_of_copies())
					{
						System.out.println("No such number of copies available");
						return;
					}
					
					
				}
				
				book2[j].setNo_of_copies(book2[j].getNo_of_copies()-copies2);
			
				System.out.println("enter ur name");
				String name2 = sc.next();
				
				Date d2=new Date();
				System.out.println(name2 +" ur book is booked on.."+d2);
				System.out.println("Plz return book within 7 days");
				
				break;
				
			case "Electrical":
				Branch b3 = BookDetails.showElectrical();
				Book book3[] = b3.getB();
				
				j = 0;
				for( j=0; j < book3.length; j++)
				{
					System.out.println(book3[j].getId()+" "+book3[j].getName()+" "+book3[j].getPrice() + " " + book3[j].getNo_of_copies());
				}
				
				System.out.println("Enter book you want to select");
				String book_name3 = sc.next();
				
				flag1 = false;
				
				for( j = 0; j < book3.length; j++)
				{
					if(book3[j].getName().equals(book_name3))
					{
						flag1 = true;
						break;	
					}	
				}
				
				if(flag1 == true)
				{
					System.out.println("Checking for avilablity");
				}
				else
				{
					System.out.println("sorry this book is not available");
					return;
				}
				
				System.out.println("how many copies you want");
				int copies3 = sc.nextInt();
				
				if(copies3 > book3[j].getNo_of_copies())
				{
					System.out.println("No such number of copies available");
					System.out.println("The available copies are : "+book3[j].getNo_of_copies());
					
					System.out.println("Reenter how many copies you want");
					copies=sc.nextInt();
					
					if(copies3 > book3[j].getNo_of_copies())
					{
						System.out.println("No such number of copies available");
						return;
					}
					
					
				}
				
				book3[j].setNo_of_copies(book3[j].getNo_of_copies()-copies3);
			
				System.out.println("enter ur name");
				String name3 = sc.next();
				
				Date d3 = new Date();
				System.out.println(name3 +" ur book is booked on.."+d3);
				System.out.println("Plz return book within 7 days");
				
				break;
				
			default:
				System.out.println("No such branch");
		}
		
	}

}

