/**
 * author: Shahmir Khan
 * date: Jun 13, 2013
 * SCIT- Beaconhouse National University
 */
package edu.ieee.lahoresection.ieeebnu.bean;

/**
 * Description of the Type
 * 
 */
public class Project {

	private long projectId;
	private String title;
	private String description;
	private long institutionId;
	private String category;
	private boolean isShortlisted;
	private Institution institution;
	private Group group;
	private FinalEvaluation finalEvaluation;

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getInstitutionId() {
		return institutionId;
	}

	public void setInstitutionId(long institutionId) {
		this.institutionId = institutionId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isShortlisted() {
		return isShortlisted;
	}

	public void setShortlisted(boolean isShortlisted) {
		this.isShortlisted = isShortlisted;
	}

	public Institution getInstitution() {
		return institution;
	}

	public void setInstitution(Institution institution) {
		this.institution = institution;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public FinalEvaluation getFinalEvaluation() {
		return finalEvaluation;
	}

	public void setFinalEvaluation(FinalEvaluation finalEvaluation) {
		this.finalEvaluation = finalEvaluation;
	}

}
