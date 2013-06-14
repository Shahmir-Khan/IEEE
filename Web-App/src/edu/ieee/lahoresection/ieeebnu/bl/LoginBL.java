package edu.ieee.lahoresection.ieeebnu.bl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.ieee.lahoresection.ieeebnu.bean.User;
import edu.ieee.lahoresection.ieeebnu.dao.UserDAO;

public class LoginBL {
	Connection connection;

	public LoginBL(Connection connection) {
		super();
		this.connection = connection;
	}

	public User getUser(String username, String password) throws SQLException {

		UserDAO userDAO = new UserDAO(connection);
		List<User> userList = userDAO.getAllUsers();
		User result = null;
		for (User user : userList) {
			if (user.getUsername().equals(username)) {
				if (user.getPassword().equals(password)) {
					result = user;
				}
			}
		}
		return result;
	}
}
