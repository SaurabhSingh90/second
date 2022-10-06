package interfaceUpdate;

public interface Interface2 {
	default void display() {
		//to create a non ststic method
		//we need ton use default access modifier
		System.out.println("this is display in 2");
	}

}
