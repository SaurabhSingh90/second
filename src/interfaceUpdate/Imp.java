package interfaceUpdate;

public class Imp implements interface1,Interface2 {
	@Override
	public void show() {
		System.out.println("this is show");
	}

	@Override
	public void display() {
		// it is compulsory to override a method which is  common in both the parents 
		//interface
		interface1.super.display();
	}

}
