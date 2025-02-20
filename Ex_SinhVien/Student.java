package Ex_SinhVien;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
	private String firstName;
	private String lastName;
	private String birthDate;
	private String address;
	private String className;
	private ArrayList<Double> grades;

	public Student(String firstName, String lastName, String birthDate, String address, String className,
			double Laptrinhhuongdoituong, double Quanliduan, double HocMay, double Cosodulieu, double Laptrinhungdung) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.address = address;
		this.className = className;
		this.grades = new ArrayList<>(
				Arrays.asList(Laptrinhhuongdoituong, Quanliduan, HocMay, Cosodulieu, Laptrinhungdung));
	}

	public double getAverageGrade() {
		double total = 0;
		for (double grade : grades) {
			total += grade;
		}
		return total / grades.size();
	}

	public String getGradeRank() {
		double avg = getAverageGrade();
		if (avg >= 8.5 && avg < 10) {
			return "A";
		} else if (avg >= 7.0 && avg < 8.5) {
			return "B";
		} else if (avg >= 5.5 && avg < 7.0) {
			return "C";
		} else if (avg >= 4.0 && avg < 5.5) {
			return "D";
		} else {
			return "<D";
		}
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String getClassName() {
		return className;
	}

	@Override
	public String toString() {
		return String.format("%s %s - Avg: %.2f - Rank: %s", firstName, lastName, getAverageGrade(), getGradeRank());
	}
}
