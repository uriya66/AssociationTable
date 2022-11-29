
public class Student implements Comparable<Student>  {
	private String firstName;
	private String lastName;
	private String id;
	private int dateOfBirth;
	
	public Student (String firstName, String lastName, String id, int dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.dateOfBirth = dateOfBirth;
	}
	
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
	
    public String getId() {
    	return this.id;
    }
	@Override
	public int compareTo(Student student){
		return this.id.compareTo(student.getId());
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName + 
				" id: " + id + 
				" born at: "+ dateOfBirth;
	}
}