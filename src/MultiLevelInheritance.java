
class University {

	private int id;
	private String name;
}

class College extends University{

	private int id;
	private String name;
}

class Address extends College{

	private int id;
	private String name;
	private String address;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("This is address class parameter less constructor");
	}

	public Address(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("This is address class parameterised constructor");
	}
	
	
}
