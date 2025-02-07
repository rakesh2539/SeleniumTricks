package mytest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.BeforeMethod;

public class ValidateData_inDatabase {
	
	
	public static void main(String[] args) throws SQLException {
		
    String prot="jdbc:mysql://localhost:3306/testdb";
    String username="root";
    String password="raki123";
    
    Connection conn=DriverManager.getConnection(prot,username,password);
    
    Statement stmt= conn.createStatement();
    
  //  String s="select empId,empName from employeedata where empaddress='hydrabad';";
    
   String s="select empId,empName from employeedata where empaddress Like 'del%'";
    
    
    ResultSet rs=stmt.executeQuery(s);
    
    while (rs.next()) {
        int empId = rs.getInt("empid"); 
        String empName = rs.getString("empname");
        

        System.out.println("Emp ID: " + empId + ", Emp Name: " + empName);
        
        
    }
    

    
    conn.close();
    
    System.out.println("program is executed");
		
		
		
	}
	

}
