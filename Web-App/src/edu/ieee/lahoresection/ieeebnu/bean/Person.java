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
public class Person {

	private long personId;
	private String name;
	private String email;
	private String phoneNumber;
	private String occupation;
	private boolean isJudge;
	private long groupId;
	private Group group;
	private List<PersonHasEvaluation> evaluations;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public boolean isJudge() {
		return isJudge;
	}

	public void setJudge(boolean isJudge) {
		this.isJudge = isJudge;
	}

	public long getGroupId() {
		return groupId;
	}

	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public List<PersonHasEvaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<PersonHasEvaluation> evaluations) {
		this.evaluations = evaluations;
	}

}
