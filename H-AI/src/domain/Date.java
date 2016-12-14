//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package domain;

public class Date {
	
	private int day;
	private int month;
	private int year;
	
	public Date(){
		setDay(0);
		setMonth(0);
		setYear(0);
	}
	
	public Date(int day, int month, int year){
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public Date(String day, String month, String year){
		this.day = Integer.valueOf(day);
		this.month = Integer.valueOf(month);
		this.year = Integer.valueOf(year);
	}
	
	
	
	public int getDay() {
		return day;
	}
	

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toNewStrings(){
		String out;
		
		String day = String.valueOf(this.day);
		String month = String.valueOf(this.month);
		String year = String.valueOf(this.year);
		
		out = day+"/"+month+"/"+year;
		
		return out;
	}
	
	public Date difference(Date one, Date two){
		
		Date difference= new Date();
		difference.setDay( one.day - two.day);
		difference.setMonth(one.month - two.month);
		difference.setYear(one.year - two.year);
		
		return difference;
		
		
	}

}
