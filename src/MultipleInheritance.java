
interface Father {
	public void father();
}

interface Mother {
	public void mother();
}

interface Child extends Father, Mother {
	public void fatherMother();
}

class GrandChild implements Child{

	@Override
	public void father() {
		// TODO Auto-generated method stub
		System.out.println("This is father");
	}

	@Override
	public void mother() {
		// TODO Auto-generated method stub
		System.out.println("This is Mother");
	}

	@Override
	public void fatherMother() {
		// TODO Auto-generated method stub
		System.out.println("This is Father Mother");
	}
	
	public void grandChild() {
		System.out.println("This is Grand child");
	}
}
