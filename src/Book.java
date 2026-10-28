public class Book {

    private String title;
    private Author author;
    private double price;
    private int qtyStock;

    public Book(String title,Author autor,double price){
        this.title=title;
        this.author=autor;
        this.price=price;
        this.qtyStock=0;
    }

    public Book(String title,Author autor,double price,int qtyStock ){
        this.title=title;
        this.author=autor;
        this.price=price;
        this.qtyStock=qtyStock;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQtyStock() {
        return qtyStock;
    }

    public void setQtyStock(int qtyStock) {
        this.qtyStock = qtyStock;
    }

    @Override
    public String toString() {
        return "title  "+title+"  by Autor  "+author.getName()+" gender "+ author.getGender()+" at " + author.getEmail();
    }

    public String getAuthorName() {
        return this.author.getName();
    }

    public String getAuthorEmail(){
        return this.author.getEmail();
    }

    public char getAuthorGender(){
        return this.author.getGender();
    }
}
