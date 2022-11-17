package studio8;

import java.util.LinkedList;
import java.util.HashSet;
import java.util.Objects;

public class Appointment {

	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time) {
		this.date = date;
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Appointment> list = new HashSet<Appointment>();
		Date d1 = new Date(9, 1, 2022, false);
		Date d2 = new Date(9, 2, 2022, false);
		Time t1 = new Time(3, 4, true, "AM");
		Time t2 = new Time(3, 4, true, "AM");
		Appointment a1 = new Appointment(d1, t1);
		Appointment a2 = new Appointment(d2, t2);
		list.add(a1);
		list.add(a2);
	}

}
