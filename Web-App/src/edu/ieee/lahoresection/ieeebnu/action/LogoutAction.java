package edu.ieee.lahoresection.ieeebnu.action;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction extends Action {

	@Override
	public String performAction(HttpServletRequest request,
			HttpServletResponse response, Connection connection)
			throws Exception {
		// TODO Auto-generated method stub
		
		request.getSession().invalidate();
		
		return "/login.jsp";
	}

}
