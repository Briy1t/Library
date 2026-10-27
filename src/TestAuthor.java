public class TestAuthor {
    public static void main(String[] args) {

        Author anAutor = new Author(" Tan Ah Teck  "," ahteck@somewhere.com  ",'m');
        System.out.println(anAutor);
        anAutor.setEmail("  paul@nowhere.com");
        System.out.println(anAutor);

    }
}
