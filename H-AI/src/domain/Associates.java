//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

public class Associates extends Programme {
private Course courses[];
	
	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public Associates(){
		super();
		super.setMaximumNumberOfCourses(8);
		super.setType("Assoc.");
		courses = new Course[8];
	}
}
