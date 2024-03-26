package construct.ex;

public class BookMain1 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("Hello Java", "SEO");
        book2.displayInfo();

        Book book3 = new Book("JPA 프로그래밍", "김영한", 700);
        book3.displayInfo();

    }
}
