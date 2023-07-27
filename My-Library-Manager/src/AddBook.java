import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddBook {
    DbHelper dbHelper = new DbHelper();
    Connection connection = null;
    public void addBook(String title, String author, int stock) {
        PreparedStatement preparedStatement = null;
        if (title != null && author != null) {
            try {
                connection = dbHelper.getConnection();
                String sql = "INSERT INTO kitaplar (`Kitap Adı`, `Kitap Yazarı`, `Stok Adedi`) VALUES (?, ?, ?)";
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setString(1, title);
                preparedStatement.setString(2, author);
                preparedStatement.setInt(3, stock);
                preparedStatement.executeUpdate();
                System.out.println("Book successfully added to database.");

            } catch (SQLException e) {
                System.out.println("Connection failed ");
                throw new RuntimeException(e);
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException e) {
                    System.out.println("An error occurred while disconnecting");
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
