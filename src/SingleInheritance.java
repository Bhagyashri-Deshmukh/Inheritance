
class Person {

	private int id;
	private String name;	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside Person Parameter less constructor.");
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("Inside Person Parameterised constructor.");
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

	//@Override
	public String toString() {
		System.out.println("Person to String");
		return "Person [id=" + id + ", name=" + name + "]";
	}
}

class Employee extends Person{
	
	private String address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside Employee Parameter less constructor.");
	}

	public Employee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
		System.out.println("Inside Employee Parameterised constructor.");
	}

	public Employee(String address) {
		super();
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//@Override
	public String toString() {
		System.out.println("Employee to String");
		return "Employee [address=" + address + "]";
	}
}
