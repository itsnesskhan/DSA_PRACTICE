
public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public int compareTo(Student that) {
		String[] thi = this.name.split("\\s");
		String[] tha = that.name.split("\\s");
		
		
		return thi[1].compareTo(tha[1]);
	}

}
