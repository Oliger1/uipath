package creational.Builder;

public class BuilderClient {
    public static void main(String args[]) {
        Book book = new Book.Builder()
                .setTitle("Designe patterns")
                .setAuthor("GoF")
                .setIntro("Paternat e dizenjimit").build();
        System.out.println(book.getTitle());
    }
}
