//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class PsuedoStudent {

	private SimpleStringProperty studentId;
	private SimpleStringProperty fname;
	private SimpleStringProperty lname;
	private SimpleStringProperty address;
	private SimpleStringProperty dateEnrolled;
	private SimpleStringProperty  contact;
	private SimpleStringProperty enrolmentStatus;
	
	
	
	public PsuedoStudent(){
		this.studentId = new SimpleStringProperty();
		this.fname = new SimpleStringProperty();
		this.lname = new SimpleStringProperty();
		this.address = new SimpleStringProperty();
		this.dateEnrolled = new SimpleStringProperty();
		this.contact = new SimpleStringProperty();
		this.enrolmentStatus = new SimpleStringProperty();
	
		this.studentId = new SimpleStringProperty();
	}
	
	
	public PsuedoStudent(String studentId, String fname, String lname,
			String address, String date_enrolled, String contact,
			String enrolmentStatus) {
	//	super();
		this.studentId = new SimpleStringProperty(studentId);
		this.fname = new SimpleStringProperty(fname);
		this.lname = new SimpleStringProperty(lname);
		this.address = new SimpleStringProperty(address);
		this.dateEnrolled = new SimpleStringProperty(date_enrolled);
		this.contact = new SimpleStringProperty(contact);
		this.enrolmentStatus = new SimpleStringProperty(enrolmentStatus);
		
		this.studentId = new SimpleStringProperty();
	}

	public String getStudentId(){
		return studentId.get();
	}

	public void setStudentId(String s){
		this.studentId.set(s);
	}
	
	
	public String getFname(){
		return fname.get();
	}

	public void setFname(String s){
		fname.set(s);
	}
	
	public String getLname(){
		return lname.get();
	}

	public void setLname(String s){
		lname.set(s);
	}
	
	public String getAddress(){
		return address.get();
	}

	public void setAddress(String s){
		address.set(s);
	}
	
	public void setDateEnrolled(String s){
		this.dateEnrolled.set(s);
	}
	
	public String getDateEnrolled(){
		return this.dateEnrolled.get();
	}
	
	public String getContact(){
		return contact.get();
	}

	public void setContact(String s){
		contact.set(s);
	}
	
	public String getEnrolmentStatus(){
		return enrolmentStatus.get();
	}

	public void setEnrolmentStatus(String s){
		enrolmentStatus.set(s);
	}
	
	
	
	
	
	
	
	
	
	
	
}
