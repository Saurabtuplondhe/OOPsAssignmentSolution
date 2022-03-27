package assgn1;

public class Main {
public static void main (String[] args) {
	adminDepartment ad = new adminDepartment();
	System.out.println("Welcome to "+ad.departmentName());
	System.out.println(ad.getTodaysWork());
	System.out.println(ad.getWorkDeadline());
	System.out.println(ad.isTodayAHoliday());
	System.out.println();
	hrDepartment hd = new hrDepartment();
	System.out.println("Welcome to "+hd.departmentName());
	System.out.println(hd.doActivity());
	System.out.println(hd.getTodaysWork());
	System.out.println(hd.getWorkDeadline());
	System.out.println(hd.isTodayAHoliday());
	System.out.println();
	techDepartment td = new techDepartment();
	System.out.println("Welcome to "+td.departmentName());
	System.out.println(td.getTodaysWork());
	System.out.println(td.getWorkDeadline());
	System.out.println(td.getTechStackInformation());
	System.out.println(td.isTodayAHoliday());
	System.out.println();
	
}
}
