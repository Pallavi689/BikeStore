package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.Customer;
import util.DBConnection;
import util.InputValidator;

public class CustomerDAO {
	
	public boolean addCustomer(Customer customer) throws ClassNotFoundException {
		try {
		   if(!InputValidator.isValidEmail(customer.getEmail())) {
			   throw new IllegalArgumentException("Invalid email format");
		   }
		   
		   if(!InputValidator.isValidName(customer.getFirstName())) {
			   throw new IllegalArgumentException("Invalid First name format");
		   }
		   
		   if(!InputValidator.isValidName(customer.getLastName())) {
			   throw new IllegalArgumentException("Invalid Last Name format");
		   }
		   
		   if(!InputValidator.isValidPhone(customer.getPhone())) {
			   throw new IllegalArgumentException("Invalid Phone Number format");
		   }
		   
		   if(!InputValidator.isValidZip(customer.getZipCode())) {
			   throw new IllegalArgumentException("Invalid Zip Code format");
		   }
		   
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		String sql = "INSERT INTO sales.customers (first_name, last_name, phone, email, street, city, state, zip_code) values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try(Connection con = DBConnection.getConnection();
		    PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS) ){
			ps.setString(1,customer.getFirstName());
			ps.setString(2, customer.getLastName());
	        ps.setString(3, customer.getPhone());
	        ps.setString(4, customer.getEmail());
	        ps.setString(5, customer.getStreet());
	        ps.setString(6, customer.getCity());
	        ps.setString(7, customer.getState());
	        ps.setString(8, customer.getZipCode());
	        
	        int rows = ps.executeUpdate();
	        if(rows > 0) {
	        	System.out.println("Data inserted successully");
	        	return true;
	        }
	        
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
		    	
		
	}
	
	

}
