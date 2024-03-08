package btap4;

public class Book {
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void getInfo() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Publlisher:" + publisher);

    }
    public void search(String keyword) {
        if (title.contains(keyword) || author.contains(keyword) || publisher.contains(keyword)) {
            System.out.println("Book found: " + title);
        } else {
            System.out.println("Book not found.");
        }
    }
}
