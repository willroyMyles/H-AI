//Carlisle Welsh
//Willroy Myles
//Damani Poyser

package developement;

import java.awt.List;
import java.io.File;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.*;

public class sqliteConnection {
static Connection conn = null;
	
	public static Connection dbConnector(){
		try{
			Class.forName("org.sqlite.JDBC");
			
			File exist = new File("h&aiDatabase.sqlite");
			if(exist.exists())
				 conn = DriverManager.getConnection("jdbc:sqlite:h&aiDatabase.sqlite");

			
			if(!exist.exists()){
			exist.createNewFile();
			Connection conn = DriverManager.getConnection("jdbc:sqlite:h&aiDatabase.sqlite");
			String createStud = "create table stud (IdNumber,FirstName,LastName,Address,DateEnrolled,Password,ProgramCode,ContactNumber,EnrolmentStatus,noc)";
			String createPro = "create table pro (Code, Name, Maximum number of courses, Award, Accreditation)";
			String createStudCourse = "create table studCourse (studId, Code, constraint pk primary key (studId, Code)) ";
			String createCourse = "create table courses (Code, Name, Credit,Prerequisites, Cost, Description)  ";
			String insertCourse1 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('cmp103','OOP','4','NA','40000','Learn about computer networking')";
			String insertCourse2 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('cit103','Web Programming','4','NA','40000','Learn about computer networking')";
			String insertCourse3 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('cmp108','Programming 2','4','NA','40000','Learn about computer networking')";
			String insertCourse4 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('cmp1004','Programming 1','4','NA','40000','Learn about computer networking')";
			String insertCourse5 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('col103','Collage Lingustics','4','NA','40000','Learn about computer networking')";
			String insertCourse6 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('ctp103','Tele Communications','4','NA','40000','Learn about computer networking')";
			String insertCourse7 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('cpp103','Clock Processing','4','NA','40000','Learn about computer networking')";
			String insertCourse8 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('cml103','Computer Management','4','NA','40000','Learn about computer networking')";
			String insertCourse9 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('cas09','Computer Assurance','4','NA','40000','Learn about computer networking')";
			String insertCourse10 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('zip105','Radio network','4','NA','40000','Learn about computer networking')";
			String insertCourse11= "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('zip103','Radio Stations','4','NA','40000','Learn about computer networking')";
			String insertCourse12 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('cvm103','Comm Netwokrs','4','NA','40000','Learn about computer networking')";
			String insertCourse13 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('mat108','Differential Maths','4','NA','40000','Learn about computer networking')";
			String insertCourse14 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('phy103','Physics','4','NA','40000','Learn about computer networking')";
			String insertCourse15 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('sci103','Computer Science','4','NA','40000','Learn about computer networking')";
			String insertCourse16 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('eng103','Engine Maths','4','NA','40000','Learn about computer networking')";
			String insertCourse17 = "INSERT INTO courses (Code, Name, Credit,Prerequisites, Cost, Description) VALUES('mat103','Collage Maths','4','NA','40000','Learn about computer networking')";

			ArrayList<String> list = new ArrayList<String>();
			list.add(insertCourse1);
			list.add(insertCourse2);
			list.add(insertCourse3);
			list.add(insertCourse4);
			list.add(insertCourse5);
			list.add(insertCourse6);
			list.add(insertCourse7);
			list.add(insertCourse8);
			list.add(insertCourse9);
			list.add(insertCourse10);
			list.add(insertCourse11);
			list.add(insertCourse12);
			list.add(insertCourse13);
			list.add(insertCourse14);
			list.add(insertCourse15);
			list.add(insertCourse16);
			list.add(insertCourse17);

			
			
			PreparedStatement pst = conn.prepareStatement(createCourse);
			pst.execute();
									
			pst = conn.prepareStatement(createStud);
			pst.execute();
			
			pst = conn.prepareStatement(createPro);
			pst.execute();
			
			pst = conn.prepareStatement(createStudCourse);
			pst.execute();
			
			
			
			for (int i = 0; i <= 16;i++){				
				
				pst = conn.prepareStatement(String.valueOf(list.get(i)));
				pst.execute();
				
			}
			
			
			
			
			pst.close();
			
			
			}
			

			

			
		//	Connection conn = DriverManager.getConnection("jdbc:sqlite:HomeAndAwayData.sqlite");
			System.out.println("work");


	//		Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\WM\\oop\\H&AI\\HomeAndAwayData.sqlite");
//			JOptionPane.showMessageDialog(null,"Connection Successful");
			return conn;
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			System.out.println("didnt work");
			return null;
		}
	}
}
