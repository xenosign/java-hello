package extends1.ex;

public class ItemExMain {
    public static void main(String[] args) {
        Book book = new Book("JAVA", 10000, "han", 12345);
        Album album = new Album("New Jeans", 30000, "뉴진스");
        Movie movie = new Movie("살인의추억", 15000, "봉준호", "송강호");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("총계 : " + sum);
    }
}
