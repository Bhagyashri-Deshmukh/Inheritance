// Try constructor chaining on this
class Parent {

	private int id;
	private String name; 
	protected String surName;

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(String surName) {
		super();
		this.surName = surName;
	}

	public Parent(int id, String name, String surName) {
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
	}

	public void printInfo() {
		System.out.println("Class Name is: "+this.getClass());
		System.out.println("Id is "+this.id);
		System.out.println("Name is "+this.name);
		System.out.println("Sur Name is "+this.surName);
	}
}

class ChildOne extends Parent {

	private int id;
	private String name;
	
	public ChildOne(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	
	public void printInfo() {
		System.out.println("Class Name is: "+this.getClass());
		System.out.println("Id is "+this.id);
		System.out.println("Name is "+this.name);
		System.out.println("Sur name is "+super.surName);
	}
}

