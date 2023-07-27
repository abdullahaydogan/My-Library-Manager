import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        AddBook addBook=new AddBook();
        RemoveBook removeBook=new RemoveBook();
        UpdateBook updateBook=new UpdateBook();
        String title;
        String author;
        int id;
        int stock;
        int option;


        do {
            System.out.println("Please select the action you want to do");
            System.out.println("(1)-Add Book\n(2)-Remove Book\n(3)-Update Book\n(4)-Exit ");
            option = input.nextInt();
            input.nextLine(); // Satır sonu karakterini tüketmek için

            switch (option) {
                case 1:
                    System.out.println("Please enter Author of Book");
                    author = input.nextLine();

                    System.out.println("Please enter Stock of Book");
                    stock = input.nextInt();
                    input.nextLine(); // Satır sonu karakterini tüketmek için

                    System.out.println("Please enter Name of Book:");
                    title = input.nextLine();
                    addBook.addBook(title,author,stock);
                    break;
                case 2:
                    System.out.println("Please enter ID of Book:");
                    id=input.nextInt();
                    input.nextLine();
                    removeBook.removeBook(id);
                    break;
                case 3:
                    System.out.println("Please enter ID of Book");
                    id=input.nextInt();
                    input.nextLine();

                    System.out.println("Enter new Book Name:");
                    title=input.nextLine();
                    input.nextLine();

                    System.out.println("Enter new Book author:");
                    author=input.nextLine();
                    input.nextLine();

                    System.out.println("Enter new Stock book:");
                   stock=input.nextInt();

                    updateBook.updateBook(title,author,stock);
                    break;

                case 4:
                    System.out.println("Exiting the library manager system.");
                    break;

                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }

        } while (option != 4);


    }
}