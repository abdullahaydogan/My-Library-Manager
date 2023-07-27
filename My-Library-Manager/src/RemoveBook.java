import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveBook {
    DbHelper dbHelper = new DbHelper();
    Connection connection = null;
    public void removeBook( int id) {
        PreparedStatement preparedStatement = null;
        if (id !=0) {
            try {
                connection = dbHelper.getConnection();
                String sql = "DELETE FROM kitaplar WHERE id=?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1,id);
                preparedStatement.executeUpdate();
                System.out.println("Book successfully removed from database.");
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
