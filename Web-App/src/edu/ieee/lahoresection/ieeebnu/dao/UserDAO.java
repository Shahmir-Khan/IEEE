package edu.ieee.lahoresection.ieeebnu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.ieee.lahoresection.ieeebnu.bean.User;

public class UserDAO {
	Connection connection;

	public UserDAO(Connection connection) {
		super();
		this.connection = connection;
	}

	public List<User> getAllUsers() throws SQLException {

		String sql = "SELECT * FROM USER";
		Statement s = connection.createStatement();
		ResultSet rs = s.executeQuery(sql);
		List<User> userList = new ArrayList<User>();
		while (rs.next()) {
			User user = new User();

			user.setName(rs.getString("name"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));

			userList.add(user);
		}
		rs.close();
		s.close();

		return userList;
	}
}
