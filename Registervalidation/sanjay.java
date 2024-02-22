package Registervalidation;


		import java.sql.*;

		public class sanjay {
		    // JDBC URL, username, and password of MySQL server
		    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/my_database";
		    private static final String JDBC_USER = "admin";
		    private static final String JDBC_PASSWORD = "admin";

		    public static void main(String[] args) {
		        try {
		            // Register MySQL JDBC driver
		            Class.forName("com.mysql.cj.jdbc.Driver");

		            // Connect to MySQL
		            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

		            // Perform CRUD operations
		            createRecord(conn, "John Doe", 30);
		            readRecords(conn);
		            updateRecord(conn, 1, "Jane Doe", 35);
		            deleteRecord(conn, 1);
		            readRecords(conn);

		            // Close the connection
		            conn.close();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
		    }

		    // Create a new record
		    private static void createRecord(Connection conn, String name, int age) throws SQLException {
		        String sql = "INSERT INTO my_table (name, age) VALUES (?, ?)";
		        PreparedStatement statement = conn.prepareStatement(sql);
		        statement.setString(1, name);
		        statement.setInt(2, age);
		        int rowsInserted = statement.executeUpdate();
		        if (rowsInserted > 0) {
		            System.out.println("A new record was created successfully.");
		        }
		    }

		    // Read all records
		    private static void readRecords(Connection conn) throws SQLException {
		        String sql = "SELECT * FROM my_table";
		        Statement statement = conn.createStatement();
		        ResultSet resultSet = statement.executeQuery(sql);
		        while (resultSet.next()) {
		            System.out.println("ID: " + resultSet.getInt("id") +
		                               ", Name: " + resultSet.getString("name") +
		                               ", Age: " + resultSet.getInt("age"));
		        }
		        resultSet.close();
		    }

		    // Update an existing record
		    private static void updateRecord(Connection conn, int id, String name, int age) throws SQLException {
		        String sql = "UPDATE my_table SET name=?, age=? WHERE id=?";
		        PreparedStatement statement = conn.prepareStatement(sql);
		        statement.setString(1, name);
		        statement.setInt(2, age);
		        statement.setInt(3, id);
		        int rowsUpdated = statement.executeUpdate();
		        if (rowsUpdated > 0) {
		            System.out.println("Record with ID " + id + " was updated successfully.");
		        }
		    }

		    // Delete a record
		    private static void deleteRecord(Connection conn, int id) throws SQLException {
		        String sql = "DELETE FROM my_table WHERE id=?";
		        PreparedStatement statement = conn.prepareStatement(sql);
		        statement.setInt(1, id);
		        int rowsDeleted = statement.executeUpdate();
		        if (rowsDeleted > 0) {
		            System.out.println("Record with ID " + id + " was deleted successfully.");
		        }
		    }
		
	}


