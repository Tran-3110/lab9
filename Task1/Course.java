package Task1;
import java.util.List;

public class Course {
	private String id;
	private String title;
	private String type;
	private List<Student> students;
	private String lecturer;
	public Course(String id, String title, String type, List<Student> students, String lecturer) {
		this.id = id;
		this.title = title;
		this.type = type;
		this.students = students;
		this.lecturer = lecturer;
	}
	public String getType() {
		return type;
	}
	
	public boolean isPraticalCourse() {
		return type.equals("Thuc hanh");
	}
	
	public int sizeListStudent() {
		return students.size();
	}
	public List<Student> getStudents() {
		return students;
	}
	
	public boolean isCourse(String type) {
		return this.type.equals(type);
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", type=" + type + ", students=" + students + ", lecturer="
				+ lecturer + "]";
	}
	
	
	
	
	

}
