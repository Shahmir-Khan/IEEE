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
public class Institution {

	private long institutionId;
	private String name;
	private String address;
	private String phoneNumber;
	private List<Project> projects;

	public long getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(long institutionId) {
		this.institutionId = institutionId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

}
