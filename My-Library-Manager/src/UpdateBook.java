import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBook{
    DbHelper dbHelper = new DbHelper();
    Connection connection = null;
    public void updateBook(String title, String author,int stock) {
        PreparedStatement preparedStatement = null;
        if (title != null && author != null) {
            try {
                connection = dbHelper.getConnection();
                String sql = "UPDATE kitaplar SET `Kitap Adı`=?, `Kitap Yazarı`=? WHERE id=?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, title);
                preparedStatement.setString(2, author);
                preparedStatement.setInt(3, stock);

                preparedStatement.executeUpdate();

                System.out.println("Book successfully updated in the database.");

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
