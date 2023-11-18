package Task1;

import java.util.ArrayList;
import java.util.List;

public class TestTask1 {
	public static void main(String[] args) {
		Student st1 = new Student("01", "Nguyen Van A", 2020);
		Student st2 = new Student("02", "Nguyen Van A", 2020);
		Student st3 = new Student("03", "Nguyen Van A", 2021);
		Student st4 = new Student("04", "Nguyen Van A", 2021);
		Student st5 = new Student("05", "Nguyen Van A", 2022);
		Student st6 = new Student("06", "Nguyen Van A", 2022);
		List<Student> listStudent1 = new ArrayList<>();
		listStudent1.add(st1);
		listStudent1.add(st2);
		listStudent1.add(st3);
		listStudent1.add(st4);
		listStudent1.add(st5);
		listStudent1.add(st6);
		List<Student> listStudent2 = new ArrayList<>();
		listStudent2.add(st1);
		listStudent2.add(st2);
		listStudent2.add(st3);
		listStudent2.add(st5);
		List<Student> listStudent3 = new ArrayList<>();
		listStudent3.add(st1);
		listStudent3.add(st3);
		listStudent3.add(st5);
		listStudent3.add(st6);
		List<Student> listStudent4 = new ArrayList<>();
		listStudent4.add(st5);
		listStudent4.add(st6);
		Course course1 = new Course("C01", "LTNC", "Thuc hanh", listStudent1, "B");
		Course course2 = new Course("C02", "HQTCSDL", "Thuc hanh", listStudent2, "B");
		Course course3 = new Course("C03", "TRR", "Li thuyet", listStudent3, "B");
		Course course4 = new Course("C04", "TCC A1", "Li thuyet", listStudent4, "B");
		List<Course> listCourse = new ArrayList<>();
		listCourse.add(course1);
		listCourse.add(course2);
		listCourse.add(course3);
		listCourse.add(course4);
		Faculty faculty = new Faculty("CNTT", "Tang 2 Thu Vien", listCourse);
		System.out.println(faculty.getMaxPracticalCourse());
		//System.out.println(faculty.groupStudentsByYear());
		//System.out.println(faculty.filterCourses("Thuc hanh"));
		System.out.println("---"+course1.getClass());
	}

}
