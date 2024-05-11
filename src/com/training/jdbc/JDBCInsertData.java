import java.sql.*;

public class JDBCInsertData {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost/details?user=root&password=sridhar49";

        // SQL query to insert data
        String insertSql = "INSERT INTO Employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";
        // SQL query to select all records from the Employee table
        String selectSql = "SELECT * FROM Employee";

        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement insertStmt = conn.prepareStatement(insertSql);
             Statement selectStmt = conn.createStatement()) {

            // Data to be inserted
            int[] empCodes = {101, 102, 103, 104, 105};
            String[] empNames = {"Jenny", "Jacky", "Joe", "John", "Shameer"};
            int[] empAges = {25, 30, 20, 40, 25};
            double[] empSalaries = {10000, 20000, 40000, 80000, 90000};

            // Inserting data into the table
            for (int i = 0; i < empCodes.length; i++) {
                insertStmt.setInt(1, empCodes[i]);
                insertStmt.setString(2, empNames[i]);
                insertStmt.setInt(3, empAges[i]);
                insertStmt.setDouble(4, empSalaries[i]);
                insertStmt.addBatch();
            }

            // Executing batch insert
            int[] affectedRows = insertStmt.executeBatch();

            // Printing the number of affected rows
            System.out.println("Rows affected: " + affectedRows.length);

            // Displaying the contents of the Employee table
            ResultSet rs = selectStmt.executeQuery(selectSql);

            // Print column headers
            ResultSetMetaData rsmd = rs.getMetaData();
            int numColumns = rsmd.getColumnCount();
            for (int i = 1; i <= numColumns; i++) {
                System.out.print(rsmd.getColumnName(i) + "\t");
            }
            System.out.println();

            // Print each row of the result set
            while (rs.next()) {
                for (int i = 1; i <= numColumns; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

/*
Output:

Rows affected: 5
empcode	empname	empage	esalary
101	Jenny	25	10000
102	Jacky	30	20000
103	Joe	20	40000
104	John	40	80000
105	Shameer	25	90000

Process finished with exit code 0
*/
