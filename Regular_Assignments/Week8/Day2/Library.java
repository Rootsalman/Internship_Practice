import java.util.*;
class Book {
    private String title, author, publisher;
    private int bNo;
    Book(String title, String author, String publisher, int bNo) {
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
        setBNo(bNo);
    }
    void setTitle(String title) {
        this.title = title;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    void setBNo(int bNo) {
        this.bNo = bNo;
    }
  String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    String getPublisher() {
        return publisher;
    }
    int getBNo() {
        return bNo;
    }
}
public class Library {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
      for (int i = 0; i < 5; i++) {
        books.add(new Book(sc.next(), sc.next(), sc.next(), sc.nextInt()));
        }
      for (Book book : books) {
            System.out.println(
                    book.getBNo() + " " + book.getTitle() + " " + book.getAuthor() + " " + book.getPublisher());
        }
    }
}