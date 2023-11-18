package Task1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Faculty {
	private String name;
	private String address;
	private List<Course> courses;
	public Faculty(String name, String address, List<Course> courses) {
		this.name = name;
		this.address = address;
		this.courses = courses;
	}
//	Phương thức public Course getMaxPracticalCourse() trả về course thực 
//	hành có nhiều sinh viên đăng ký học nhất.
	public Course getMaxPracticalCourse() {
		Course result = null;
		int max = 0;
		for (Course course : courses) {
			if(course.isPraticalCourse() && course.sizeListStudent() > max) {
				max = course.sizeListStudent();
				result = course;
			}
		}
		return result;
	}
//	Phương thức public Map<Integer, List<Student>> groupStudentsByYear()
//	để thống kê danh sách sinh viên theo năm vào học, với key là năm vào học và 
//	value là các sinh viên tương ứng.
	
	public Map<Integer, List<Student>> groupStudentsByYear() {
		Map<Integer, List<Student>> result = new HashMap<>();
		for (Course course : courses) {
			for (Student student : course.getStudents()) {
				if(!result.containsKey(student.getYear())) {
					List<Student> list = new ArrayList<>();
					list.add(student);
					result.put(student.getYear(), list);
				}
				else {
					if(!result.get(student.getYear()).contains(student)) {
						result.get(student.getYear()).add(student);
					}
				}
			}
		}
		return result;
	}
//	Phương thức public Set<Course> filterCourses(String type) trả về các 
//	course theo loại cho trước (type). Các course được sắp xếp giảm dần theo số 
//	lượng sinh viên đăng ký học.
	public Set<Course> filterCourses(String type) {
		Set<Course> result = new TreeSet<>(new Comparator<Course>() {
			@Override
			public int compare(Course o1, Course o2) {
				if(o1.sizeListStudent() - o2.sizeListStudent() == 0) {
					return o1.getId().compareTo(o2.getId());
				}
				return o1.sizeListStudent() - o2.sizeListStudent();
			}
		});
		for (Course course : courses) {
			if(course.isCourse(type)) {
				result.add(course);
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return "Faculty [name=" + name + ", address=" + address + ", courses=" + courses + "]";
	}
	
	

	
	

}
