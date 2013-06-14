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
public class Evaluation {

	private long evaluationId;
	private long finalEvaluationId;
	private int innovativeIdea;
	private int designMethodology;
	private int qualityImplementation;
	private int potentialUsage;
	private int testingDocumentation;
	private int totalSum;
	private String reviews;
	private List<PersonHasEvaluation> evaluations;
	private FinalEvaluation finalEvaluation;

	public long getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(long evaluationId) {
		this.evaluationId = evaluationId;
	}

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

	public int getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}

	public String getReviews() {
		return reviews;
	}

	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public List<PersonHasEvaluation> getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(List<PersonHasEvaluation> evaluations) {
		this.evaluations = evaluations;
	}

	public FinalEvaluation getFinalEvaluation() {
		return finalEvaluation;
	}

	public void setFinalEvaluation(FinalEvaluation finalEvaluation) {
		this.finalEvaluation = finalEvaluation;
	}

}
