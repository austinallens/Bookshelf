/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 4.3
 * File Name: BookShelf.java
 */

//

public class BookShelf {
    public static void main(String[] args) {
            Book b1, b2, b3;
            
            b1 = new Book();
            b1.setTitle("Book1"); 
            b1.setAuthor("Joe");
            b1.setPublish("Scholastic");
            b1.setCopyright(1999);
            
            b2 = new Book();
            b2.setTitle("Book2"); 
            b2.setAuthor("Joes");
            b2.setPublish("Scholastic");
            b2.setCopyright(2000);
            
            b3 = new Book();
            b3.setTitle("Book3"); 
            b3.setAuthor("Joeseph");
            b3.setPublish("Scholastic");
            b3.setCopyright(2001);
            
            System.out.println(b1 + " " + b2 + " " + b3);
    }
}
