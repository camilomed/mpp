package LabStreamLvl3;

public class ExamData {
	private String studentName;
	private double testScore;
	public ExamData(String studentName, double testScore) {
		super();
		this.studentName = studentName;
		this.testScore = testScore;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getTestScore() {
		return testScore;
	}
	public void setTestScore(double testScore) {
		this.testScore = testScore;
	}
	

}
