package assgn1;

public class hrDepartment extends superDepartment  {
	protected String departmentName() {
		return "HR Department";
	}
	protected String  getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	protected String getWorkDeadline() {
		return "Complete by EOD ";
	}
	protected String doActivity() {
		return "team Lunch";
	}
	protected String isTodayAHoliday() {
		return ""+super.isTodayAHoliday();
	}
}
