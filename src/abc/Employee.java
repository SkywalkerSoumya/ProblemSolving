package abc;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Employee {
	
	private String id;
	private String name;
	private Date joiningDate;
	
	public Employee(String id, String name, Date joiningDate) {
		super();
		this.id = id;
		this.name = name;
		this.joiningDate = joiningDate;
	}
	
	public Employee(String id) {
		super();
		this.id = id;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	public static void main(String[] args) {
		
		HashSet<Employee> empCache = new HashSet<>();
		Employee emp1 = new Employee("ab", "Soumya", new Date());
		System.out.println(emp1.hashCode());
		
//		System.out.println(empCache.(emp1));
		empCache.add(emp1);
		// emp1.setName("changed");
		
		Employee emp2= new Employee("ab", "Soumya1", new Date());
//		System.out.println(emp2.hashCode());
//		System.out.println(empCache.get(emp2));
		empCache.add(emp2);
//		
//		if(emp1.equals(emp2)) {
//			System.out.println("same");
//		}
		
		if(empCache.contains(emp2)) {
			 System.out.println(emp2.getName());
		}
		
		//System.out.println(empCache.get(emp1));
	}
	
}
