package packageName2;

public class SETTERSandGETTERSASSIGNMENT {
	
	int date;
	String month;
	int year;

	public void setDOB(int date, String month,int year) {
		this.date=date;
		this.month=month;
		this.year=year;
		}
	public void getDOB() {
		System.out.println("DOB is " +date +month +year);
	}
}
