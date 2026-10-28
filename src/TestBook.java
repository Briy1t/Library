public class TestBook {
    public static void main(String[] args) {


        Author anAuthor = new Author("es", "es@gmail.com", 'f');
        Book aBook = new Book("Java for dummy", anAuthor, 19.65, 100);

        System.out.println("Title " + aBook.getTitle() + "  at  " + anAuthor.getEmail());

        System.out.println("--- PRUEBA 3: Array de 5 libros ---");

        Book[] books = new Book[5];

        books[0] = aBook;
        books[1] = new Book("Python Basics", new Author("Carlos", "carlos@gmail.com", 'm'), 25.00, 50);
        books[2] = new Book("Web Design", new Author("Lucia", "lucia@gmail.com", 'f'), 30.00, 80);
        books[3] = new Book("Database 101", new Author("Juan", "juan@gmail.com", 'm'), 15.50, 40);
        books[4] = new Book("Advanced Java", new Author("Maria", "maria@gmail.com", 'f'), 45.00, 20);

        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}