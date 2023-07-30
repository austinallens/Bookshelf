/* Name: Austin Allen
 * Course: CSC 135
 * Project: Problem 4.3
 * File Name: Book.java
 */

//

public class Book {
    
    //Objects for Book
    private String title, author, publish;
    private int copyright;
    
    //Constructor
    Book(){
        title = "";
        author = "";
        publish = "";
        copyright = 0;
    }
    
    //mutator
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublish(String publish){
        this.publish = publish;
    }
    public void setCopyright(int copyright){
        this.copyright = copyright;
    }
    
    //accessors
    public String getTitle(String title){
        return title;
    }
    public String getAuthor(String author){
        return author;
    }
    public String getPublish(String publish){
        return publish;
    }
    public int getCopyright(int copyright){
        return copyright;
    }
    
    //toString
    public String toString(){
        return "The title is " + this.title + ".\n The author is " 
                + this.author + ".\n The publisher is " + this.publish
                + ".\n The copyright year is " 
                + Integer.toString(this.copyright);
    }
}
