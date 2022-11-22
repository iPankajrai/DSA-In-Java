/**
 * 
 */
package CollectionFramework;

import java.util.Objects;

/**
 * @author Pankaj Rai
 *
 */
public class Student implements Comparable<Student> {
	
	String name;
	int rollno;
	
	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}
	
	@Override
	public String toString() {
		return "Student{" + 
				"name='" + name + '\'' +
				", rollNo=" + rollno +
				'}';
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		Student student  = (Student) o;
		return rollno == student.rollno;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rollno);
	}

	@Override
	public int compareTo(Student that) {
		 return this.rollno - that.rollno ;
		// return this.name.compareTo(that.name);
	}

}
