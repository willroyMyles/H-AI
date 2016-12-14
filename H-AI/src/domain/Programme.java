//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

public class Programme {

	private String code, courseName, award, accreditation, type;
	private int maximumNumberOfCourses;

	public Programme(String code, String courseName, int maximumNumberOfCourses, String award,
			String accreditation, String type) {
		super();
		this.code = code;
		this.courseName = courseName;
		this.maximumNumberOfCourses = maximumNumberOfCourses;
		this.award = award;
		this.accreditation = accreditation;
		this.type = type;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Programme(){
		this.code = "000";
		this.courseName = null;
		this.maximumNumberOfCourses = 0;
		this.award = null;
		this.accreditation = null;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getMaximumNumberOfCourses() {
		return maximumNumberOfCourses;
	}

	public void setMaximumNumberOfCourses(int maximumNumberOfCourses) {
		this.maximumNumberOfCourses = maximumNumberOfCourses;
	}

	public String getAward() {
		return award;
	}

	public void setAward(String award) {
		this.award = award;
	}

	public String getAccreditation() {
		return accreditation;
	}

	public void setAccreditation(String accreditation) {
		this.accreditation = accreditation;
	}
	
	
	
}
