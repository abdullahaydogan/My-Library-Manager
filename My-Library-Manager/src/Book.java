public class Book {
    //this class have properties of Books
    private String bookName;
    private String authorBook;
    private int idBook;
    private int stockBook;

    public Book() {
        this.bookName = bookName;
        this.authorBook=authorBook;
        this.idBook=idBook;
        this.stockBook=stockBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getStockBook() {
        return stockBook;
    }

    public void setStockBook(int stockBook) {
        this.stockBook = stockBook;
    }

}
