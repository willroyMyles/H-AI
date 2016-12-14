//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

import java.io.Serializable;

public class Course implements Serializable {

	private String code, name, description, credits, preRequisite, cost;

	public Course(String code, String name, String description, String credits, String preRequisite, String cost) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.credits = credits;
		this.preRequisite = preRequisite;
		this.setCost(cost);
	}
	

	public Course() {
		// TODO Auto-generated constructor stub
		
		this.code = "na";
		this.name = "na";
		this.description = "na";
		this.credits = "na";
		this.preRequisite = "na";
		this.setCost("na");
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}

	public String getPreRequisite() {
		return preRequisite;
	}

	public void setPreRequisite(String preRequisite) {
		this.preRequisite = preRequisite;
	}


	public String getCost() {
		return cost;
	}


	public void setCost(String cost) {
		this.cost = cost;
	}

	
}
