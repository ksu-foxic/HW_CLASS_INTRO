public class Book {
    public String title;
    public int releseYear;
    public Autor autor;
    public int pages;
    public int costs;

    public Book(String title, int releseYear, Autor autor, int pages) {
        this.title = title;
        this.releseYear = releseYear;
        this.autor = autor;
        this.pages = pages;
    }

    public boolean isBig() {
        if (pages > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String word) {
        return ((title + " " + autor.name + " " + autor.surname).contains(word));
    }

    public int estimatePrice() {
        costs = (int) Math.floor(Math.sqrt(autor.rating * 3 * pages));
        return Math.max(costs, 250);
    }
}
