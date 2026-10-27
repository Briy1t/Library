public class TestBook {
    public static void main(String[] args) {

        Author anAuthor = new Author("es","es@gmail.com", 'f');
        Book aBook = new Book("Java for dummy", anAuthor,19.65,100  );

        System.out.println("Title "+ aBook.getTitle()+ "  at  "+ anAuthor.getEmail());



    }
}
