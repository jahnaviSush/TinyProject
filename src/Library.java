import java.sql.*;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;
public class Library 
{ 
	public void Read()
	{
	try
	{
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Crud","root","Jahnavi");
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from admin");
	while(rs.next())
	{
	System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	}
	}
	catch(SQLException e)
	{
	System.out.println(e.toString());
	}
	}	

	public void Insert() {
		
		// TODO Auto-generated method stub
				try
				{
				try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Crud","root","Jahnavi");
				Statement st=con.createStatement();				
				int rows=st.executeUpdate("insert into admin values( 4,'sushmitha','Sush@123')");
						
				if(rows>=0) {
					System.out.println("inserted");
					}
				
				else {
					System.out.println("Not Inserted");
				}
				
				} catch(SQLException e) {
					System.out.println(e.toString());
				}
	}	
	public void Delete() {
		
		try
		{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Crud","root","Jahnavi");
		Statement st=con.createStatement();
		int rs=st.executeUpdate("delete  from admin where idAdmin=3;");
		if(rs>=0) {
			System.out.println("row deleted");
		}
		else {
			System.out.println("Not deleted");
		}
		}
		catch(SQLException e)
		{
		System.out.println(e.toString());
		}
	
}
	public void Update() {
		try
		{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Crud","root","Jahnavi");
		Statement st=con.createStatement();
		int rs=st.executeUpdate("update admin set admin_name='Anusha' where idAdmin=1;");
		if(rs>0) {
			System.out.println("row updated");
		}
		else {
			System.out.println("Not updated");
		}
		} catch(SQLException e)
		{
		System.out.println(e.toString());
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		
		Library lib=new Library();
		
		System.out.println("Enter your Choice ");
		Scanner sc=new Scanner(System.in);
	        int i = sc.nextInt();    
	        switch(i)
			{
			case 1:System.out.println("Insert operation");
			         lib.Insert();
			         break;
			case 2:System.out.println(" Read operation");
			        lib.Read();
			        break;
			case 3:System.out.println("Update operation");
					 lib.Update();
					 break;
			case 4:System.out.println("Delete operation");
			         lib.Delete();
			} 
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	