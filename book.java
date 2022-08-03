import java.io.*;
import java.util.HashSet;

public class Book{
    private String booktitle;
    private String bookauthor;
    private int bookNo;
    private int edition;
    private int NoOfPages;
    private int Price;
    
    public void setmethod(String booktitle, String bookauthor,int bookNo, int edition, int NoOfPages, int Price)
    {
        this.booktitle=booktitle;
        this.bookauthor=bookauthor;
        this.bookNo=bookNo;
        this.edition=edition;
        this.NoOfPages=NoOfPages;
        this.Price=Price;
        }
        
        HashSet<String> set = new HashSet<String>();


set.add(booktitle);
set.add(bookauthor);
set.add(bookNo);
set.add(edition);
set.add(NoOfPages);
set.add(Price);

System.out.println("HashSet: " + set);
}
     


public class HashSetTest {
public static void main(String args[])
{
Scanner Obj = new Scanner(System.in);  
    System.out.println("Enter booktitle");

    String booktitle = Obj.nextLine(); 
    System.out.println("Enter bookauthor");
    String bookauthor = Obj.nextLine(); 
    System.out.println("Enter bookNo");
    String bookNo = Obj.nextLine(); 
    System.out.println("Enter edition");
    String edition = Obj.nextLine(); 
    System.out.println("Enter NoOfPages");
    String NoOfPages = Obj.nextLine(); 
    System.out.println("Price");
    String Price = Obj.nextLine(); 
    
    Book book=new Book();
    book.setmethod(booktitle,bookauthor,bookNo,edition,NoOfPages,Price);
    
}
}
    
    
    
    

     
    