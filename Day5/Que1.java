// package Day5


class Book {
    private String title = "Programming in JAVA";
    private String author = "Sandeep";
    private int ISBN = 1234;
    private float price = 100.0f;
    private String publisher = "Tech Book Publisher";

    public String bookTitle(){
        return title;
    }
    public String bookAuthor(){
        return author;
    }
    public int bookISBN(){
        return ISBN;
    }
    public float bookPrice(){
        return price;
    }
    public String bookPublisher(){
        return publisher;
    }

    public float discount(){
        return price - (price * 0.25f);
    }

    public void display(){
        System.out.println("Book Title : " + bookTitle());
        System.out.println("Book Author : " + bookAuthor());
        System.out.println("Book ISBN : " + bookISBN());
        System.out.println("Book Original price : " + bookPrice());
        System.out.println("Book Publisher : " + bookPublisher());
        System.out.println("Book Price after discount : " + discount());
    }
}
public class Que1 {
    public static void main(String[] args) {
        Book book = new Book();

        book.display();
    }
}