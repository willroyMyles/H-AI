//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

	private String studentId;
	private String fname;
	private String lname;
	private String Address;
	private String Date_enrolled;
	private String password;
	private String ProgrammeCode, ContactNumber;
	private int EnrolmentStatus, noc;
	
	
	public int getNoc() {
		return noc;
	}

	public void setNoc(int noc) {
		this.noc = noc;
	}

//	private ArrayList<Course> courses;
		
		
	 
	 public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	 public Student(String studentId, String fname, String lname, String address,
			String programmeCode, String contactNumber) {
		super();
		this.studentId = studentId;
		this.fname = fname;
		this.lname = lname;
		Address = address;
		Date_enrolled =String.valueOf(new Date());
		ProgrammeCode = programmeCode;
		EnrolmentStatus = 0;
		ContactNumber = contactNumber;
	}
	 
	 public Student(){
		 
		 EnrolmentStatus = 0;
		 
		 
	 }

//	public ArrayList<Course> getCourses() {
//		return courses;
//	}
//
//	public void setCourses(ArrayList<Course> courses) {
//		this.courses = courses;
//	}


	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDate_enrolled() {
		return String.valueOf(Date_enrolled);
	}

	public void setDate_enrolled(String date_enrolled) {
		Date_enrolled = date_enrolled;
	}

	public String getProgrammeCode() {
		return ProgrammeCode;
	}

	public void setProgrammeCode(String programmeCode) {
		ProgrammeCode = programmeCode;
	}

	public int getEnrolmentStatus() {
		return EnrolmentStatus;
	}

	public void setEnrolmentStatus(int enrolmentStatus) {
		EnrolmentStatus = enrolmentStatus;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	
	public void display(){
		System.out.println(fname + lname + Date_enrolled);
	}
	 
	
	
}
