/**
 * 
 */
package edu.ieee.lahoresection.ieeebnu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import edu.ieee.lahoresection.ieeebnu.bean.Project;

/**
 * @author Mehmood
 * 
 */
public class ProjectDAO {
	Connection connection;

	public ProjectDAO(Connection connection) {
		super();
		this.connection = connection;
	}
    public List<Project> selectAllProjects() throws SQLException
    {
    	
    	String sql ="Select * from project";
    	Statement s = connection.createStatement();
    	ResultSet rs= s.executeQuery(sql);
    	List<Project> projectList = new ArrayList<Project>();
    	while(rs.next())
    	{
    		Project project =new Project();
    		project.setTitle(rs.getString("title"));
    		project.setShortlisted(rs.getBoolean("is_shortlisted"));
    		project.setProjectId(rs.getLong("project_id"));
    		project.setInstitutionId(rs.getLong("Institution_institution_id"));
    		project.setDescription(rs.getString("description"));
    		project.setCategory(rs.getString("category"));
    		
    		projectList.add(project);
    	
    	}
    	
    	
		return projectList;
    	
    }
}
