package assgn1;

public class techDepartment extends superDepartment {
	protected String departmentName() {
		return "Tech Department";
	}
	protected String getTodaysWork() {
		return "Complete coding of module 1";
	}
	protected String getWorkDeadline() {
		return "Complete by EOD";
	}
	protected String getTechStackInformation() {
		return "core Java";
	}
	protected String isTodayAHoliday() {
		return ""+super.isTodayAHoliday();
	}
}
