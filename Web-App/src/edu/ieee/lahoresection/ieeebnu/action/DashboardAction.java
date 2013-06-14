package edu.ieee.lahoresection.ieeebnu.action;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ieee.lahoresection.ieeebnu.bean.User;
import edu.ieee.lahoresection.ieeebnu.bl.LoginBL;
import edu.ieee.lahoresection.ieeebnu.utils.DBConnectionUtil;

public class DashboardAction extends Action {

	@Override
	public String performAction(HttpServletRequest request,
			HttpServletResponse response, Connection connection)
			throws Exception {
		// TODO Auto-generated method stub
		String path = "/login.jsp";
		connection = DBConnectionUtil.openConnection();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		LoginBL loginBL = new LoginBL(connection);
		User user = loginBL.getUser(username, password);
		if(user != null)
		{
			path = "/dashboard.jsp";
			
			request.getSession().setAttribute("USER",user);
		}
		
		return path;
	}

}
