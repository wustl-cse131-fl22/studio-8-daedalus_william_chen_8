package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean f12;
	private String AP;

	public Time(int hour, int minute, boolean f12, String AP) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.f12 = false;
		this.AP = AP;
	}

	public void convert() {
		if (this.f12) {
			if (this.AP.equals("PM")) {
				this.hour += 12;
			}
			f12 = false;
		} else {
			if (this.AP.equals("AM")) {
				this.hour -= 12;
			}
			f12 = true;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(AP, f12, hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (this.f12 == other.f12) {
			if (this.f12 && other.f12) {
				return Objects.equals(AP, other.AP) && hour == other.hour && minute == other.minute;
			} else {
				return hour == other.hour && minute == other.minute;
			}
		} else {
			return Math.abs(hour - other.hour) == 12 && minute == other.minute;
		}
	}

	public static void main(String[] args) {

	}

}