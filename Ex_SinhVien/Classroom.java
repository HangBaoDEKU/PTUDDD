package Ex_SinhVien;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
	private String className;
	private ArrayList<Student> students;

	public Classroom(String className) {
		this.className = className;
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		if (student.getClassName().equals(this.className)) {
			students.add(student);
		}
	}

	public ArrayList<Integer> getGradeDistribution() {
		ArrayList<Integer> gradeCount = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));

		for (Student student : students) {
			String rank = student.getGradeRank();
			switch (rank) {
			case "A":
				gradeCount.set(0, gradeCount.get(0) + 1);
				break;
			case "B":
				gradeCount.set(1, gradeCount.get(1) + 1);
				break;
			case "C":
				gradeCount.set(2, gradeCount.get(2) + 1);
				break;
			case "D":
				gradeCount.set(3, gradeCount.get(3) + 1);
				break;
			case "<D":
				gradeCount.set(4, gradeCount.get(4) + 1);
				break;
			}
		}
		return gradeCount;
	}

	public void displayStudents() {
		if (students.isEmpty()) {
			System.out.println("Khong co sinh vien nao trong lop");
			return;
		}
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public void displaySummary() {
		ArrayList<Integer> gradeSummary = getGradeDistribution();
		System.out.println("\nBang Diem:");
		System.out.println("Diem A: " + gradeSummary.get(0) + " students");
		System.out.println("Diem B: " + gradeSummary.get(1) + " students");
		System.out.println("Diem C: " + gradeSummary.get(2) + " students");
		System.out.println("Diem D: " + gradeSummary.get(3) + " students");
		System.out.println("Diem <D: " + gradeSummary.get(4) + " students");
	}

	public String getClassName() {
		return className;
	}
}
