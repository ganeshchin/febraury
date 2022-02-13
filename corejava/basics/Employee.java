package corejava.basics;

public class Employee implements Comparable<Employee>{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		if(age==e.age)  
			return 0;  
			else if(age>e.age)  
			return 1;  
			else  
			return -1;
	}
//	public int compareTo(Student st){  
//		if(age==st.age)  
//		return 0;  
//		else if(age>st.age)  
//		return 1;  
//		else  
//		return -1;  
//		}  

}
