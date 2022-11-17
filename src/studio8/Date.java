package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int date;
	private int year;
	private boolean holiday;

	public Date(int month, int date, int year, boolean holiday) {
		super();
		this.month = month;
		this.date = date;
		this.year = year;
		this.holiday = holiday;
	}

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
		LinkedList<Date> list = new LinkedList<Date>();
		Date d1 = new Date(9, 1, 2022);
		Date d2 = new Date(9, 1, 2022);
		list.add(d1);
		list.add(d2);
		list.add(d1);
		System.out.println(list);

		HashSet<Date> set = new HashSet<Date>();
		set.add(d1);
		set.add(d2);
		set.add(d1);
		System.out.println(set);
	}

}
