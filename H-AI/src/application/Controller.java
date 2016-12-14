//Carlisle Welsh
//Willroy Myles
//Damani Poyser




package application;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.jfoenix.controls.*;
import developement.FileProcess;
import developement.PsuedoCourse;
import domain.Associates;
import domain.Certificate;
import domain.Course;
import domain.Diploma;
import domain.Programme;
import domain.Staff;
import domain.Student;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * @author WM
 *
 */
public class Controller implements Initializable {

	private class RowSelectChangeListener implements ChangeListener {
		@Override
		public void changed(ObservableValue ov, Object oldv, Object newv) {

			value = oldv;

			int a = (int) ov.getValue();
			System.out.println(a);


		}		
	}
	private static Programme p, p2;
	private static ObservableList studCourseData;
	private static String userStud;
	private static String valCode;

	// staff fields

	static Object value;

	@FXML // fx:id="myButton"
	private JFXButton admin, staff; // Value injected by FXMLLoader

	@FXML
	private JFXButton adminBack, enrolBtn;

	@FXML
	private JFXPasswordField adminPass, staffPass;
	@FXML
	private JFXTextField adminUser, staffUser, proAward, proAcc, proCode, proName, studUser;
	private ObservableList data, courseData;
	public Button dismiss;
	private FileProcess fillip = new FileProcess();
	private FXMLLoader fxmlLoader;
	@FXML
	private JFXComboBox<String> mpBox = new JFXComboBox<String>();
	
	private ObservableList proData;
	private ObservableList<String> staffDepts = FXCollections.observableArrayList("DEPT1", "DEPT2", "DEPT3");
	private ObservableList<String> staffFacs = FXCollections.observableArrayList("FENC", "FOSS", "FELS");
	private ObservableList<String> prog = FXCollections.observableArrayList("Certificate", "Diploma", "Associates");
	
	@FXML
	private JFXComboBox<String> courseBox = new JFXComboBox<String>(prog);
	@FXML
	private JFXComboBox<String> staffDept = new JFXComboBox<String>(staffDepts);
	@FXML
	private JFXComboBox<String> staffFacualty = new JFXComboBox<String>(staffFacs);
	
	@FXML
	private Label proLabel, creditLabel, costLabel, LPC, costLabel1;
	private AnchorPane root;
	private Scene scene;
	@FXML
	private TableColumn SStudentId, SFirstName, SLastName, SED, SStatus, SContact, SAddress, PCode, PName, PAward, PAcc,
	PMNC, SCN, SCR, SCO, SCCode, SCCost, SCCredit, SCName,  gfbSTID, gfbSTFN, gfbSTLN, gfbSTCC, gfbSTCN, gfbSTCCO, gprCourseCode, gprCourseName;
	@FXML
	private JFXButton staffCreationBack, staffSubmit, Back, proSubmit, studSubmit, addCourseBtn;
	@FXML
	private DatePicker staffDate, studDate;
	@FXML
	private JFXTextField staffFN, studFN, staffId, studId, studAdd, studCont, staffLN, studLN;
	@FXML
	private JFXTextField mpCode, mpName, mpAward, mpAcc, mpCourse;
	@FXML
	private JFXPasswordField staffPW, studPass;
	private Stage stage;
	@FXML
	private JFXComboBox<String> studentProg = new JFXComboBox<String>(prog);

	@FXML
	private JFXComboBox<String> studentProg1 = new JFXComboBox<String>(prog);
	
	@FXML
	private ListView<String> studListView, courseList;

	@FXML
	private TableView studTable, proTable, ACTable, SCTable, studTableGFB, gprTable;// = new
	
	
	

	public Controller() {

	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addCourse() {

		Course c = fillip.getCourse(courseBox.getValue());
		fillip.saveCourseStud(c, userStud);

		SCCost.setCellValueFactory(new PropertyValueFactory("cost"));
		SCCredit.setCellValueFactory(new PropertyValueFactory("credits"));
		SCCode.setCellValueFactory(new PropertyValueFactory("code"));
		SCName.setCellValueFactory(new PropertyValueFactory("name"));
		studCourseData = fillip.getStudCourseData(userStud);
		SCTable.setItems(null);
		SCTable.setItems(studCourseData);

	}


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addCourseView() {

		SCN.setCellValueFactory(new PropertyValueFactory("name"));
		SCR.setCellValueFactory(new PropertyValueFactory("credits"));
		SCO.setCellValueFactory(new PropertyValueFactory("cost"));

		courseData = fillip.courseList(0);

		// studListView = new ListView();
		ACTable.setItems(courseData);
		ACTable.getSelectionModel().getSelectedItem().toString();
		// ACTable.getSelectionModel().selectedIndexProperty().addListener(new RowSelectChangeListener());

	}


	public void adminCheck() {
		String user = adminUser.getText();
		String pass = adminPass.getText();

		System.out.println(user + "  " + pass);
		Stage ok = new Stage();
		try {
			if (user.equals("admin") && pass.equals("alpine")) {

				root = FXMLLoader.load(getClass().getResource("/frames/loginSuccess.fxml"));
				ok.setScene(new Scene(root));
				ok.initModality(Modality.APPLICATION_MODAL);
				ok.initOwner(adminUser.getScene().getWindow());
				ok.showAndWait();

				stage = (Stage) admin.getScene().getWindow();
				fxmlLoader = new FXMLLoader(getClass().getResource("/frames/staffCreation.fxml"));
				generic(fxmlLoader);

			} else {

				root = FXMLLoader.load(getClass().getResource("/frames/loginUnsuccess.fxml"));
				ok.setScene(new Scene(root));
				ok.initModality(Modality.APPLICATION_MODAL);
				ok.initOwner(adminUser.getScene().getWindow());
				ok.showAndWait();

				adminUser.clear();
				adminPass.clear();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void createStaff() {

		Staff S = new Staff();
		S.setStaffId(staffId.getText());
		S.setFname(staffFN.getText());
		S.setLname(staffLN.getText());
		S.setPassword(staffPW.getText());
		S.setFaculty(staffFacualty.getEditor().getText());
		S.setDepartment(staffDept.getEditor().getText());
		S.setDateEmplyed(String.valueOf(staffDate.getValue()));
		// staffFacualty.setValue(staffFacualty.getEditor().getText());
		fillip.saveStaff(S);
	}

	public void createStudent() {

		Student S = new Student();
		if (studentProg.getValue().equals("")) {
			S.setNoc(0);
			S.setProgrammeCode("00");
		}

		if (studentProg.getValue().equals("Certificate")) {
			S.setNoc(4);
			S.setProgrammeCode("04");
		}
		if (studentProg.getValue().equals("Diploma")) {
			S.setNoc(6);
			S.setProgrammeCode("06");
		}
		if (studentProg.getValue().equals("Associates")) {
			S.setNoc(8);
			S.setProgrammeCode("08");
		}
		String studIdGen = studDate.getValue().getYear() + S.getProgrammeCode() + "+" + fillip.studNum();

		S.setStudentId(studIdGen);
		S.setFname(studFN.getText());
		S.setLname(studLN.getText());
		S.setPassword(studPass.getText());
		S.setAddress(studAdd.getText());
		S.setContactNumber(studCont.getText());
		S.setDate_enrolled(String.valueOf(studDate.getValue()));

		studId.setText(studIdGen);

		fillip.saveStudent(S);
	}



	public void dismiss() {
		stage = (Stage) dismiss.getScene().getWindow();
		stage.close();
	}

	public void enroll(){

		fillip.setEnroll(userStud);
		//	enrolBtn.setDisable(true);

	}

	public void generateFeeBreakdown() {

		int totalC = fillip.genFeeBreak(userStud);
		System.out.println(userStud+"thisis it");
		String cost = String.valueOf(totalC);

		costLabel1.setText(cost);

		gfbSTID.setCellValueFactory(new PropertyValueFactory("studId"));
		gfbSTFN.setCellValueFactory(new PropertyValueFactory("studFirst"));
		gfbSTLN.setCellValueFactory(new PropertyValueFactory("studLast"));
		gfbSTCC.setCellValueFactory(new PropertyValueFactory("code"));
		gfbSTCN.setCellValueFactory(new PropertyValueFactory("name"));
		gfbSTCCO.setCellValueFactory(new PropertyValueFactory("cost"));

		ObservableList ov = fillip.getGFB(userStud);

		studTableGFB.setItems(ov);
	}

	public void generateProgressReport(){
		
		
		gprCourseCode.setCellValueFactory(new PropertyValueFactory("code"));
		gprCourseName.setCellValueFactory(new PropertyValueFactory("name"));
		
		ObservableList ov = fillip.getGPR(userStud);

		gprTable.setItems(ov);
		
	}
	
	public void generic(FXMLLoader fxml) {
		try {
			// System.out.println(root+" "+"this is from generic");

			root = fxml.load();
			// System.out.println(root+" "+"this is from generic");
			scene = new Scene(root);
			stage.hide();
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	@FXML
	private void handleButtonAction(ActionEvent event) throws IOException {

		if (event.getSource() == admin) {
			// get reference to the button's stage
			stage = (Stage) admin.getScene().getWindow();
			// load up OTHER FXML document
			root = FXMLLoader.load(getClass().getResource("/frames/h&aiadmin.fxml"));
		} else {
			stage = (Stage) admin.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource("/frames/h&aialt.fxml"));
		}
		// create a new scene with root and set the stage
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@Override // This method is called by the FXMLLoader when initialization is
	// complete
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		// assert admin != null : "fx:id=\"admin\" was not injected: check your
		// FXML file 'simple.fxml'.";

		// initialize your logic here: all @FXML variables will have been
		// injected

		// connection = sqliteConnection.dbConnector();

		staffFacualty.setItems(staffFacs);
		staffDept.setItems(staffDepts);
		studentProg.setItems(prog);
		studentProg1.setItems(prog);

		System.out.println(fxmlFileLocation);
		// System.out.println(root+" "+"this is from inti");

	}
	public void loadCourseData() {

		// courseBox.getValue();
		Course c = fillip.getCourse(courseBox.getValue());
		creditLabel.setText(c.getCredits());
		costLabel.setText(c.getCost());
		LPC.setText(c.getCode());

	}

	@FXML
	public void loadHome(ActionEvent event) throws IOException {

		if (event.getSource() == Back)
			stage = (Stage) Back.getScene().getWindow();

		if (event.getSource() == admin)
			stage = (Stage) admin.getScene().getWindow();

		if (event.getSource() == adminBack)
			stage = (Stage) adminBack.getScene().getWindow();

		if (event.getSource() == staffCreationBack)
			stage = (Stage) staffCreationBack.getScene().getWindow();

		System.out.println(event.getSource());

		fxmlLoader = new FXMLLoader(getClass().getResource("/frames/h&aialt.fxml"));
		generic(fxmlLoader);

	}

	public void login(ActionEvent event) {

		if (event.getSource() == admin) {
			stage = (Stage) admin.getScene().getWindow();
			fxmlLoader = new FXMLLoader(getClass().getResource("/frames/h&aiadmin.fxml"));
			generic(fxmlLoader);
		}

		if (event.getSource() == staff) {
			stage = (Stage) admin.getScene().getWindow();
			fxmlLoader = new FXMLLoader(getClass().getResource("/frames/h&aiaStaff.fxml"));
			generic(fxmlLoader);

		}

	}

	public void removeCourse(){


		PsuedoCourse selectedCourse = (PsuedoCourse) SCTable.getSelectionModel().getSelectedItem();
		ObservableList list = 	fillip.removeCourse(userStud, selectedCourse);
		SCTable.setItems(null);
		SCTable.setItems(list);

	}

	public void saveProgram() {
		// = new Programme();

		if (studentProg1.getValue().equals("Certificate"))
			p = new Certificate();
		if (studentProg1.getValue().equals("Diploma"))
			p = new Diploma();
		if (studentProg1.getValue().equals("Associates"))
			p = new Associates();

		p.setCode(proCode.getText());
		p.setCourseName(proName.getText());
		p.setAccreditation(proAcc.getText());
		p.setAward(proAward.getText());
		p.setMaximumNumberOfCourses(Integer.parseInt(proLabel.getText()));

		fillip.saveProgram(p);

	}


	public void saveProgram2(){

		p2.setCourseName(mpName.getText());
		p2.setAccreditation(mpAcc.getText());
		p2.setAward(mpAward.getText());
		p2.setMaximumNumberOfCourses(Integer.parseInt(mpCourse.getText()));

		fillip.editProgram(p2, valCode);
	}

	@SuppressWarnings({ "unchecked", "rawtypes", "unchecked" })
	public void setList() throws SQLException {

		SStudentId.setCellValueFactory(new PropertyValueFactory("studentId"));
		SFirstName.setCellValueFactory(new PropertyValueFactory("fname"));
		SLastName.setCellValueFactory(new PropertyValueFactory("lname"));
		SED.setCellValueFactory(new PropertyValueFactory("dateEnrolled"));
		SStatus.setCellValueFactory(new PropertyValueFactory("enrolmentStatus"));
		SContact.setCellValueFactory(new PropertyValueFactory("contact"));
		SAddress.setCellValueFactory(new PropertyValueFactory("address"));

		data = fillip.getSTudentList();

		studTable.setItems(data);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void setProList() {
		PCode.setCellValueFactory(new PropertyValueFactory("code"));
		PName.setCellValueFactory(new PropertyValueFactory("name"));
		PAward.setCellValueFactory(new PropertyValueFactory("award"));
		PAcc.setCellValueFactory(new PropertyValueFactory("accreditation"));
		PMNC.setCellValueFactory(new PropertyValueFactory("MNC"));

		proData = fillip.getProList(0);

		proTable.setItems(proData);
	}

	public void setUp() {
		if (studentProg1.getValue().equals("")) {
			proLabel.setText("NA");
			proAward.setText("NA");
			proAcc.setText("0");
		}

		if (studentProg1.getValue().equals("Certificate")) {
			proLabel.setText("4");
			proAward.setText("CSc");
			proAcc.setText("Credits: 4");
		}
		if (studentProg1.getValue().equals("Diploma")) {
			proLabel.setText("6");
			proAward.setText("DSc");
			proAcc.setText("Credits: 6");
		}
		if (studentProg1.getValue().equals("Associates")) {
			proLabel.setText("8");
			proAward.setText("ASc");
			proAcc.setText("Credits: 8");
		}

	}

	public void setupModifyOthers(){
		valCode = mpBox.getValue();
		p2 = fillip.getProgram(valCode);

		mpCode.setText(p2.getCode());
		mpName.setText(p2.getCourseName());
		mpAward.setText(p2.getAward());
		mpAcc.setText(p2.getAccreditation());
		mpCourse.setText(String.valueOf(p2.getMaximumNumberOfCourses()));
	}

	public void setupModifyPro(){
		@SuppressWarnings("unchecked")
		ObservableList<String> ov = fillip.getProListBox();
		mpBox.setItems(ov);

	}

	public void setupStud() {
		courseData = fillip.courseList(1);
		courseBox.setItems(courseData);
	}

	public void showCourse(){


		studCourseData = fillip.getStudCourseData(userStud);
		SCTable.setItems(null);
		SCTable.setItems(studCourseData);

	}

	public void staffCheck() {
		String user = staffUser.getText();
		String pass = staffPass.getText();
		Stage ok = new Stage();
		try {

			fillip = new FileProcess();
			System.out.println(fillip.validateStaff(pass, user));

			if (fillip.validateStaff(pass, user) == 1) {

				root = FXMLLoader.load(getClass().getResource("/frames/loginSuccess.fxml"));
				ok.setScene(new Scene(root));
				ok.initModality(Modality.APPLICATION_MODAL);
				ok.initOwner(adminUser.getScene().getWindow());
				ok.showAndWait();

				stage = (Stage) admin.getScene().getWindow();
				fxmlLoader = new FXMLLoader(getClass().getResource("/frames/h&ai.fxml"));
				generic(fxmlLoader);
				studentProg.setItems(prog);

			} else {

				root = FXMLLoader.load(getClass().getResource("/frames/loginUnsuccess.fxml"));
				ok.setScene(new Scene(root));
				ok.initModality(Modality.APPLICATION_MODAL);
				ok.initOwner(staffUser.getScene().getWindow());
				ok.showAndWait();

				staffUser.clear();
				staffPass.clear();
			}
		} catch (IOException e) {

		}

	}

	public void studCheck() {
		userStud = studUser.getText();
		String pass = studPass.getText();
		Stage ok = new Stage();

		try {
			if (fillip.validateStudent(userStud, pass)) {

				root = FXMLLoader.load(getClass().getResource("/frames/loginSuccess.fxml"));

				ok.setScene(new Scene(root));
				ok.initModality(Modality.APPLICATION_MODAL);
				ok.initOwner(adminUser.getScene().getWindow());
				ok.showAndWait();

				stage = (Stage) admin.getScene().getWindow();
				fxmlLoader = new FXMLLoader(getClass().getResource("/frames/h&aiStud.fxml"));
				generic(fxmlLoader);

				System.out.println("there");
			} else {

				root = FXMLLoader.load(getClass().getResource("/frames/loginUnsuccess.fxml"));

				ok.setScene(new Scene(root));
				ok.initModality(Modality.APPLICATION_MODAL);
				ok.initOwner(adminUser.getScene().getWindow());
				ok.showAndWait();

				System.out.println("not there");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}