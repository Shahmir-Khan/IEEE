/**
 * author: Shahmir Khan
 * date: Jun 13, 2013
 * SCIT- Beaconhouse National University
 */
package edu.ieee.lahoresection.ieeebnu.bean;

import java.util.List;

/**
 * Description of the Type
 * 
 */
public class Group {

	private long groupId;
	private long projectId;
	private String name;
	private List<Person> persons;
	private Project project;
	private List<Student> students;

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
