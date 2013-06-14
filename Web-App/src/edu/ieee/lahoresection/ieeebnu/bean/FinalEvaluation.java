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
public class FinalEvaluation {

	private long finalEvaluationId;
	private int innovativeIdea;
	private int designMethodology;
	private int qualityImplementation;
	private int potentialUsage;
	private int testingDocumentation;
	private long projectId;
	private int totalSum;
	private Project project;
	private List<Evaluation> evaluations;

	public long getFinalEvaluationId() {
		return finalEvaluationId;
	}

	public void setFinalEvaluationId(long finalEvaluationId) {
		this.finalEvaluationId = finalEvaluationId;
	}

	public int getInnovativeIdea() {
		return innovativeIdea;
	}

	public void setInnovativeIdea(int innovativeIdea) {
		this.innovativeIdea = innovativeIdea;
	}

	public int getDesignMethodology() {
		return designMethodology;
	}

	public void setDesignMethodology(int designMethodology) {
		this.designMethodology = designMethodology;
	}

	public int getQualityImplementation() {
		return qualityImplementation;
	}

	public void setQualityImplementation(int qualityImplementation) {
		this.qualityImplementation = qualityImplementation;
	}

	public int getPotentialUsage() {
		return potentialUsage;
	}

	public void setPotentialUsage(int potentialUsage) {
		this.potentialUsage = potentialUsage;
	}

	public int getTestingDocumentation() {
		return testingDocumentation;
	}

	public void setTestingDocumentation(int testingDocumentation) {
		this.testingDocumentation = testingDocumentation;
	}

	public long getProjectId() {
		return projectId;
	}

	public void setProjectId(long projectId) {
		this.projectId = projectId;
	}

	public int getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<Evaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}

}
