package Q1;
public class BookDemo {
    public static void main(String[] args) {
        Book a = new Book("Developing Java Software","Russel Winderand",79.75d);
        System.out.println(a.getTitle());
        System.out.println(a.getAuthor());
    }
}
