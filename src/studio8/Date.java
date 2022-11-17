package studio8;

import java.util.Objects;

public class Date {
	private int month;
	private int date;
	private int year;

    public Date(int month, int date, int year) {
		super();
		this.month = month;
		this.date = date;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date: " + month + "/" + date + "/" + year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return date == other.date && month == other.month && year == other.year;
	}

	public static void main(String[] args) {

    }

}
