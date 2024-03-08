package btap4;

public class main {
    public static void main(String[] args) {
        Book book1 = new FictionBook("Harry Potter", "J.K. Rowling", "Bloomsbury Publishing");
        book1.getInfo();
        book1.search("Harry");

        Book book2 = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "Harper");
        book2.getInfo();
        book2.search("Brief");

        Book book3 = new ScienceBook("The Grand Design", "Stephen Hawking", "Bantam Books");
        book3.getInfo();
        book3.search("Design");
    }
}
