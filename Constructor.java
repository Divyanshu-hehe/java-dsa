// Create a constructor to initialize object values.
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    void display() {
        System.out.println("Book: " + title);
    }

    public static void main(String[] args) {
        Book b = new Book("Java Programming");
        b.display();
    }
}