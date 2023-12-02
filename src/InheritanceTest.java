
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This is single inheritance
		Employee employee = new Employee();
		employee.toString();
		System.out.println("------------------------------------------------------");
		
		// This is multilevel inheritance
		Address address = new Address();
		System.out.println("------------------------------------------------------");
		
		//This is hierarchical Inheritance
		ChildFour4 childFour4 = new ChildFour4();
		childFour4.parent();
		childFour4.child4();
		System.out.println("-------------------------------");
		ChildThree3 childThree3 = new ChildThree3();
		childThree3.parent();
		childThree3.child3();
		System.out.println("-------------------------------");
		ChildTwo2 childTwo2 = new ChildTwo2();
		childTwo2.parent();
		childTwo2.child2();
		System.out.println("-------------------------------");
		ChildOne1 childOne1 = new ChildOne1();
		childOne1.parent();
		childOne1.child1();
		
		System.out.println("------------------------------------------------------");		
		// This is multiple inheritance
		GrandChild grandChild = new GrandChild();
		grandChild.father();
		grandChild.mother();
		grandChild.fatherMother();
		grandChild.grandChild();
		
		System.out.println("------------------------------------------------------");
		// This is hybrid inheritance
		Moon moon = new Moon();
		moon.earth();
		moon.solarSystem();
		moon.moon();
		System.out.println("-------------------------------");		
		SolarSystem s = new SolarSystem();
	    Earth e = new Earth();
	    Mars m = new Mars();
	    
	    System.out.println(s instanceof SolarSystem);
	    System.out.println(e instanceof Earth);
	    System.out.println(m instanceof SolarSystem);
		System.out.println("---------------------------*****Constructor Chaining*****---------------------------");
		
		//This is hierarchical Inheritance (Trying constructor chaining)
		//ChildThree three = new ChildThree();
		//System.out.println("------------------------------------------------------");
		//three.printInfo();
		//System.out.println("------------------------------------------------------");
//		System.out.println("---------------------------Hierarchy Parent---------------------------");
//		Parent parent = new Parent(100,"Priyanka","Deshmane");
//		parent.printInfo();
//		System.out.println("---------------------------Hierarchy Child One---------------------------");
//		ChildOne childOne = new ChildOne(101,"Neha");
//		childOne.printInfo();
//		System.out.println("---------------------------Hierarchy Child One---------------------------");
//		ChildOne childOne1 = new ChildOne(101,"Neha");
//		childOne1.printInfo();
		
	}

}
