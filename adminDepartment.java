package assgn1;

public class adminDepartment extends superDepartment {
	protected String departmentName() {
		return "Admin Department"; 
	}
	protected String getTodaysWork() {
		return "Complete your documents Submission";
	}
	protected String getWorkDeadline() {
		return "Complete by EOD";
	}
	protected String isTodayAHoliday() {
		return ""+super.isTodayAHoliday();
	}
}
