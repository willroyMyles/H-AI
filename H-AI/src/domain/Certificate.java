//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

import java.awt.List;
import java.util.ArrayList;

public class Certificate extends Programme {

	private Course courses[];
	private ArrayList<Course> c = new ArrayList<Course>();
	
	public Course getCourses(int i) {
		return courses[i];
	}

	public void setCourses(String string, int i) {
		
	}

	public Certificate(){
		super();
		super.setMaximumNumberOfCourses(4);
		super.setType("Cert.");
	}
	
	
}
