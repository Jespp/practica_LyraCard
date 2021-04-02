
public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public boolean dateComparison(MyDate otherDate) {
		if(this.year>otherDate.year) {
			return true;
		}
		if(this.year==otherDate.year && this.month>otherDate.month) {
			return true;	
		}
		if(this.year==otherDate.year && this.month==otherDate.month && this.day>=otherDate.day) {
			return true;
		}
		return false;
	}

	
	
	

}
