package pl.bookstore.zad14;

public class TestBook {

    public static void main(String[] args) {
        Book b1 = new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1866, "Eksmo", 598 );
        System.out.println(b1.showInformation());
    }
}
