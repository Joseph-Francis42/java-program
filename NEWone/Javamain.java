package NEWone;
class Book{
	String title;
	String author;
	double price;
	
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displaydetails() {
		System.out.println("Author:"+author);
		System.out.println("Title:"+title);
		System.out.println("Price:"+price);
		
	}
}
class Ebook extends Book{
	double fileSizeMB;
	Ebook(String title,String author,double price,double fileSizeMB){
		super(title,author,price);
		this.fileSizeMB=fileSizeMB;
	}	
		public void displaydetails() {
			super.displaydetails();
			System.out.println("File Size:"+fileSizeMB)	;
		}
		
	
}
class PrintedBook extends Book{
	int noOfPages;
	PrintedBook(String title,String author,double price,int noOfPages){
		super(title,author,price);
		this.noOfPages=noOfPages;
		
	}
	public void displaydetails() {
		super.displaydetails();
		System.out.println("No of pages:"+noOfPages);
	}
	
}
public class Javamain {
	public static void main(String[]args) {
    Ebook book1 = new Ebook("GOT","Denis",200.45,210.56);	
    book1.displaydetails();
    System.out.println();
	PrintedBook book2=new PrintedBook("HOTD","djavid",210.00,150);
	book2.displaydetails(); 		
	}

}
