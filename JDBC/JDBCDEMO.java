package JDBC;

import java.sql.*;

public class JDBCDEMO {
    public static void main(String[] args) {
        try{
           // Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","Surendra@639");
            Statement stmt = con.createStatement();
            PreparedStatement ps=con.prepareStatement("select * from HR.EMP where EMPLOYEE_ID=?");
            ps.setInt(1,6);
            ResultSet rs1=ps.executeQuery();
            while (rs1.next()) {
                int id = rs1.getInt("EMPLOYEE_ID");
                String EMPLOYEE_NAME=rs1.getString("EMPLOYEE_NAME");
                System.out.println("ID: " + id+ ", Name: " + EMPLOYEE_NAME );
            }

//            System.out.println(rs1.toString());

//             stmt.executeQuery("SELECT * from HR.EMP");
//            ResultSet rs =stmt.executeQuery("SELECT * from HR.EMP ");
//            while (rs.next()){
//
//                System.out.println(rs.getInt(1)+" "+rs.getString(2));
//            }
//           stmt.executeUpdate("update HR.EMP set EMPLOYEE_NAME='dunnaa1'" +
//                    " where EMPLOYEE_NAME='bhanu' ");
//
//            if(hello>0){
//                System.out.println(hello+" rows affected");
//            }


        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
