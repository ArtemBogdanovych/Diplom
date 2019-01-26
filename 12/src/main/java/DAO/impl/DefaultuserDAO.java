package DAO.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import DAO.UserDAO;
import DAO.UserData;
import DButils.DBconectionUtils;

public class DefaultuserDAO implements UserDAO{

	@Override
	public UserData getUserbyID(int iduser) {
		// TODO Auto-generated method stub
		UserData userdata = new UserData();
		try( Connection conn = DBconectionUtils.getConnection()){
			 Statement statement = conn.createStatement();
	          
	         ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE idusers="+ iduser );
	         
	         while(resultSet.next()){
	        	 userdata.setIduser(resultSet.getInt("idusers"));
	             userdata.setName( resultSet.getString("name"));
	             userdata.setEmail(resultSet.getString("email"));
	             
	         }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return userdata;
	}

	@Override
	public List<UserData> getusers() {
		// TODO Auto-generated method stub
		return null;
	}

}
