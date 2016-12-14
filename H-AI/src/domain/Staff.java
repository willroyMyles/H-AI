//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;
import java.io.Serializable;

import domain.Date;

public class Staff implements Serializable {
	
	private String staffId;
	private String fname;
	private String lname;
	private String password;
	private String faculty;
	private String dateEmplyed;
	private String department;
	
	
	public Staff(String staffid, String fname, String lname, String password, String faculty, String department,String date) {
		super();
		this.setStaffId(staffid);
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.faculty = faculty;
		this.dateEmplyed = date;
		this.department = department;
	}
	
	public Staff(){
		setStaffId("1232016");
		fname = "willroy";
		lname = "myles";
		password = "12345";
		faculty = "SCIT";
		dateEmplyed = String.valueOf(new Date());
		department = "fenc";
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFaculty() {
		return faculty;
	}


	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}


	public String getDateEmplyed() {
		return dateEmplyed;
	}


	public void setDateEmplyed(String dateEmplyed) {
		this.dateEmplyed = dateEmplyed;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	
	
	public void display(){
		System.out.println(fname + lname + staffId+ dateEmplyed);
		
	//	System.out.println(staffId + " " + password);
	}
	
	
	
}
