package springsearch;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private String name;
	private String password;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dob;
	private List<String> courses;
	private String type;
	private String gridRadios;

	private Address address;

	public Student(String name, String password, Date dob, List<String> courses, String type, String gridRadios) {
		super();
		this.name = name;
		this.password = password;
		this.dob = dob;
		this.courses = courses;
		this.type = type;
		this.gridRadios = gridRadios;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGridRadios() {
		return gridRadios;
	}

	public void setGridRadios(String gridRadios) {
		this.gridRadios = gridRadios;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return String.format("Student [name=%s, password=%s, dob=%s, courses=%s, type=%s, gridRadios=%s, address=%s]",
				name, password, dob, courses, type, gridRadios, address);
	}

}
