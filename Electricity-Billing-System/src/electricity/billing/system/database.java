package electricity.billing.system;

import java.sql.*;

public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill_system","root","Kish@2006");
            statement = connection.createStatement();

            System.out.println("Connected to the database successfully");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


