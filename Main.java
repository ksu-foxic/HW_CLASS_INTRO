import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Нил", "Гейман", 87);
        Book book = new Book("Американские боги", 2001, autor, 704);

        System.out.println(book.isBig() ? "Книга большая" : "Книга не большая");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Веедите слово: ");
        String word = scanner.nextLine();
        System.out.println(book.matches(word) ? "В описании книги содержится слово " + word : "В описании книги не содержится слово " + word);

        System.out.println("Стоимость книги: " + book.estimatePrice() + "руб.");
    }
}
