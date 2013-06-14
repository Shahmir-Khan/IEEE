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
public class PersonHasEvaluation {

	private long personId;
	private long evaluationId;
	private Person person;
	private Evaluation evaluation;

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public long getEvaluationId() {
		return evaluationId;
	}

	public void setEvaluationId(long evaluationId) {
		this.evaluationId = evaluationId;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}

}
