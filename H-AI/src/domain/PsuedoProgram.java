//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

import javafx.beans.property.SimpleStringProperty;

public class PsuedoProgram {

	private SimpleStringProperty code, name, award, accreditation, MNC;
	
	public PsuedoProgram(){
		code = new SimpleStringProperty();
		name = new SimpleStringProperty();
		award = new SimpleStringProperty();
		accreditation = new SimpleStringProperty();
		MNC = new SimpleStringProperty();
	
	}
	
	public PsuedoProgram(String a, String b, String c, String d, String e){
		
		code = new SimpleStringProperty(a);
		name = new SimpleStringProperty(b);
		award = new SimpleStringProperty(c);
		accreditation = new SimpleStringProperty(d);
		MNC = new SimpleStringProperty(e);		
	}
	
	public void setCode(String a){
		code.set(a);
	}
	
	public String getCode(){
		return code.get();
	}
	
	public void setName(String a){
		name.set(a);
	}
	
	public String getName(){
		return name.get();
	}
	
	public void setAward(String a){
		award.set(a);
	}
	
	public String getAward(){
		return award.get();
	}
	
	public void setAccreditation(String a){
	accreditation.set(a);
	}
	
	public String getAccreditation(){
		return accreditation.get();
	}
	
	public void setMNC(String a){
		MNC.set(a);
	}
	
	public String getMNC(){
		return MNC.get();
	}
	
}
