//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

public class Diploma extends Programme {
private Course courses[];
	


	public Course[] getCourses() {
	return courses;
}



public void setCourses(Course[] courses) {
	this.courses = courses;
}



	public Diploma(){
		super();
		super.setMaximumNumberOfCourses(6);
		super.setType("Dips.");
		courses = new Course[6];
		
	}
}
