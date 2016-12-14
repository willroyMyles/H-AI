//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package developement;

import javafx.beans.property.SimpleStringProperty;

public class PsuedoCourse {
	
	private SimpleStringProperty code, name, description, credits, preRequisite, cost;
	
	private SimpleStringProperty studId;
	private SimpleStringProperty studFirst;
	private SimpleStringProperty studLast;
	
	public String getStudId(){
		return studId.get();
	}

	public void setStudId(String s){
		this.studId.set(s);
	}
	
	public String getStudFirst(){
		return studFirst.get();
	}

	public void setStudFirst(String s){
		this.studFirst.set(s);
	}
	
	public String getStudLast(){
		return studLast.get();
	}

	public void setStudLast(String s){
		this.studLast.set(s);
	}
	
	
	
	public PsuedoCourse(){
		
		code = new SimpleStringProperty();
		name  = new SimpleStringProperty();
		description  = new SimpleStringProperty();
		credits  = new SimpleStringProperty();
		preRequisite  = new SimpleStringProperty();
		cost  = new SimpleStringProperty();
		studId = new SimpleStringProperty();
		studFirst = new SimpleStringProperty();
		studLast  = new SimpleStringProperty();
		
		
		
	}
	
	public void setCode(String s){
		code.set(s);
	}
	
	public String getCode(){
		return code.get();
	}
	
	
	public void setName(String s){
		name.set(s);
	}
	
	public String getName(){
		return name.get();
	}
	
	public void setDescription(String s){
		description.set(s);
	}
	
	public String getDescription(){
		return description.get();
	}
	
	public void setCredits(String s){
		credits.set(s);
	}
	
	public String getCredits(){
		return credits.get();
	}
	
	public void setPreRequisites(String s){
		preRequisite.set(s);
	}
	
	public String getPreRequsites(){
		return preRequisite.get();
	}
	
	public void setCost(String s){
		cost.set(s);
	}
	
	public String getCost(){
		return cost.get();
	}

}
