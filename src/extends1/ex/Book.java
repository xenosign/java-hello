package extends1.ex;

public class Book extends Item {
    private String author;
    private int isbn;

    public Book(String name, int price, String author, int isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    protected void print() {
        super.print();
        System.out.println("저자 : " + author + " / isbn : " + isbn);
    }
}
