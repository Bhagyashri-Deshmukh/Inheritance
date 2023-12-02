
class Parent1 {
	
	public void parent() {
		System.out.println("This is parent.");
	}
}

class ChildOne1 extends Parent1{
	
	public void child1() {
		System.out.println("This is child one.");
	}
}

class ChildTwo2 extends Parent1{
	
	public void child2() {
		System.out.println("This is child two.");
	}
}

class ChildThree3 extends Parent1{
	
	public void child3() {
		System.out.println("This is child three.");
	}
}

class ChildFour4 extends Parent1{
	
	public void parent() {
		System.out.println("This is parent method in child four.");
	}
	
	public void child4() {
		System.out.println("This is child three.");
	}
}
