package com.organizer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrganizerDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Organizer> validate(String userName, String password){
		
		//ArrayList<Organizer> org = new ArrayList<>();
		
		boolean istrue = false;
		
		//create database connection
        try {
        	
        	con = DBConnect.getConnection();    	        	      	
        	stmt = con.createStatement();
        	
        	String sql = "select * from organizer where username='"+userName+"' and password='"+password+"' ";
            rs = stmt.executeQuery(sql);
        	
        	if(rs.next()) {
        		String id = rs.getString(1);
        		String name = rs.getString(2);
        		String age = rs.getString(3);
        		String contact_no = rs.getString(4);
        		String email = rs.getString(5);
        		String experience_year = rs.getString(6);
        		String userN = rs.getString(7);
        		String pass = rs.getString(8);
        		
        		Organizer o = new Organizer(id, name, age, contact_no, experience_year, email, userN, pass );
        		org.add(o);
        	}
        }
        catch(Exception e) {
        	e.printStackTrace();
        }	
		
		return org;
			
    } 
		
	public static boolean insertorganizer(String id,String name, String age, String contact_no, String email, String experience_year, String username, String password) {
		
		boolean isSuccess = false;
		
		//create database
		
		try {
			
			con = DBConnect.getConnection();			
			stmt = con.createStatement();
			
			String sql = "insert into organizer values ('"+id+"','"+name+"','"+age+"','"+contact_no+"','"+email+"','"+experience_year+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
		return isSuccess;
		
	}
	
	public static boolean updateorganizer(String id, String name, String age, String contact_no, String email, String experience_year, String username, String password) {
		
		boolean isSuccess = false;
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update organizer set name='"+name+"',age='"+age+"',contact_no='"+contact_no+"',email='"+email+"',experience_year='"+experience_year+"',username='"+username+"',password='"+password+"'"
					+"where id='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess  = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Organizer> getOrganizerDetails(){
		
		
		
		ArrayList<Organizer> org = new ArrayList<>();
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from organizer ";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String id = rs.getString(1);
				String name = rs.getString(2);
				String age = rs.getString(3);
				String contact_no = rs.getString(4);
				String email = rs.getString(5);
				String experience_year = rs.getString(6);
				String username = rs.getString(7);
				String password = rs.getString(8);
				
				Organizer o = new Organizer(id,name,age,contact_no,email,experience_year,username,password);
				org.add(o);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

		return org;
	}

}

