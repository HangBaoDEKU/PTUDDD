package Ex_SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Classroom> classrooms = new ArrayList<>();

		Classroom class1 = new Classroom("HTTT3");
		Classroom class2 = new Classroom("HTTT4");

		class1.addStudent(new Student("Nguyen", "A", "2002-05-10", "Hanoi", "HTTT3", 8.0, 7.5, 9.0, 8.5, 7.0));
		class1.addStudent(new Student("Le", "B", "2001-09-15", "HCM", "HTTT3", 6.5, 7.0, 5.5, 6.0, 5.0));
		class1.addStudent(new Student("Tran", "C", "2003-02-20", "Da Nang", "HTTT3", 4.0, 4.5, 3.5, 5.0, 4.5));

		class2.addStudent(new Student("Hoang", "Quoc Bao", "2004-02-29", "Ha Noi", "HTTT4", 8.0, 8.5, 8.5, 8.0, 8.5));
		class2.addStudent(new Student("Dao", "Khanh Huyen", "2004-02-30", "Ha Noi", "HTTT4", 9.5, 9.5, 9.5, 9.0, 9.5));
		class2.addStudent(new Student("Doan", "Hai Yen", "2004-02-31", "Ha Noi", "HTTT4", 9.0, 9.5, 9.0, 9.0, 9.5));

		classrooms.add(class1);
		classrooms.add(class2);

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nCac lop:");
			for (Classroom classroom : classrooms) {
				System.out.println("- " + classroom.getClassName());
			}

			System.out.print("Nhap ten lop de xem chi tiet: ");
			String classInput = scanner.nextLine();

			Classroom selectedClass = null;
			for (Classroom classroom : classrooms) {
				if (classroom.getClassName().equalsIgnoreCase(classInput)) {
					selectedClass = classroom;
					break;
				}
			}

			if (selectedClass != null) {
				System.out.println("\nDanh sach sinh vien trong lop " + selectedClass.getClassName() + ":");
				selectedClass.displayStudents();
				selectedClass.displaySummary();
				break;
			} else {
				System.out.println("Lop khong ton tai. Vui long nhap lai!");
			}
		}

		scanner.close();
	}
}
