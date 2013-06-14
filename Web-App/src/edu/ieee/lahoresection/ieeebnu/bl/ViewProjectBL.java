/**
 * 
 */
package edu.ieee.lahoresection.ieeebnu.bl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.ieee.lahoresection.ieeebnu.bean.Project;
import edu.ieee.lahoresection.ieeebnu.dao.ProjectDAO;

/**
 * @author Mehmood
 * 
 */
public class ViewProjectBL {
	Connection connection;

	public ViewProjectBL(Connection connection) {
		super();
		this.connection = connection;
	}

	public List<Project> getAllProjects() throws SQLException {

		
		ProjectDAO projectDAO = new ProjectDAO(connection);
		
		
		
		return projectDAO.selectAllProjects();

	}
}
