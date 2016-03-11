package com.pinme.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pinme.model.User;

/**
 * @author Shivanagesh Chandra Mar 7, 2016 11:32:31 PM fileUserDao.java
 */
public class UserDao extends DBConnect {
	public static List<User> users = new ArrayList<User>();;

	// private static AtomicInteger uniqueId = new AtomicInteger();

	Connection dbConnection = getDBConnection();

	/**
	 * 
	 */
	public UserDao() {

	}

	public int addUser(User user) {
		String sql = "INSERT INTO users(first_name, last_name, password, email, phone, since) VALUES (?, ?, ?, ?,?, ?)";
		PreparedStatement userInsertStatement = null;
		try {
			userInsertStatement = dbConnection.prepareStatement(sql);
			userInsertStatement.setString(1, user.getFirstName());
			userInsertStatement.setString(2, user.getLastName());
			userInsertStatement.setString(3, user.getPassword());
			userInsertStatement.setString(4, user.getEmail());
			userInsertStatement.setString(5, user.getPhoneNumber());
			userInsertStatement.setDate(6, new java.sql.Date(System.currentTimeMillis()));
			int id = userInsertStatement.executeUpdate();
			return id;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user.getId();
	}

	public User getUser(int id) {
		String sql = "Select * from users where id = ?";
		PreparedStatement userSelectStatement = null;
		User us = null;
		try {
			userSelectStatement = dbConnection.prepareStatement(sql);
			userSelectStatement.setInt(1, id);
			ResultSet rs = userSelectStatement.executeQuery();

			while (rs.next()) {
				us = new User();
				us.setFirstName(rs.getString("first_name"));
				us.setLastName(rs.getString("last_name"));
				us.setId(rs.getInt("id"));
				us.setEmail(rs.getString("email"));
				us.setPhoneNumber(rs.getString("phone"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;

	}

	public User getUserByEmail(String email, String password) {
		String sql = "Select * from users where email = ? and password = ?";
		PreparedStatement userSelectStatement = null;
		User us = null;
		try {
			userSelectStatement = dbConnection.prepareStatement(sql);
			userSelectStatement.setString(1, email);
			userSelectStatement.setString(2, password);
			ResultSet rs = userSelectStatement.executeQuery();

			while (rs.next()) {
				us = new User();
				us.setFirstName(rs.getString("first_name"));
				us.setLastName(rs.getString("last_name"));
				us.setId(rs.getInt("id"));
				us.setEmail(rs.getString("email"));
				us.setPhoneNumber(rs.getString("phone"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}

	public User getUserByUserName(String userName, String password) {
		String sql = "Select * from users where user_name = ? and password = ?";
		PreparedStatement userSelectStatement = null;
		User us = null;
		try {
			userSelectStatement = dbConnection.prepareStatement(sql);
			userSelectStatement.setString(1, userName);
			userSelectStatement.setString(2, password);
			ResultSet rs = userSelectStatement.executeQuery();

			while (rs.next()) {
				us = new User();
				us.setFirstName(rs.getString("first_name"));
				us.setLastName(rs.getString("last_name"));
				us.setId(rs.getInt("id"));
				us.setEmail(rs.getString("email"));
				us.setPhoneNumber(rs.getString("phone"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return us;
	}

	public void removeUser(String emailOrUserName, String password) {
		String sql = "DELETE from users where (user_name = ? and password = ?) or (email = ? and password = ?)";
		PreparedStatement userDeleteStatement = null;
		try {
			userDeleteStatement = dbConnection.prepareStatement(sql);
			userDeleteStatement.setString(1, emailOrUserName);
			userDeleteStatement.setString(2, password);
			userDeleteStatement.setString(3, emailOrUserName);
			userDeleteStatement.setString(4, password);
			userDeleteStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateUser(int userId, User updateUser) {
		String sql = "UPDATE users set user_name = ?, password = ?, first_name = ?, last_name = ?, email = ? , phone = ? where id = ?";
		PreparedStatement userUpdatetatement = null;
		try {
			userUpdatetatement = dbConnection.prepareStatement(sql);
			userUpdatetatement.setString(1, updateUser.getUsername());
			userUpdatetatement.setString(2, updateUser.getPassword());
			userUpdatetatement.setString(3, updateUser.getFirstName());
			userUpdatetatement.setString(4, updateUser.getLastName());
			userUpdatetatement.setString(5, updateUser.getEmail());
			userUpdatetatement.setString(6, updateUser.getPhoneNumber());
			userUpdatetatement.setInt(7, updateUser.getId());
			userUpdatetatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
