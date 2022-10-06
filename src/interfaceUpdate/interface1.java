package interfaceUpdate;

public interface interface1 {
	public void show();
	default void display() {
		//to create a non ststic method
		//we need ton use default access modifier
		System.out.println("this is displaym is 1");
	}
     public static boolean doing() {
    	 System.out.println("this is doing");
    	 return true;
     }
//     public static boolean toString() {
//    	 return true;
//    	 // can not create a pre defined conc methods
//     }
     public static void main(String[] args) {
		System.out.println(" interface running just wait");
	}
}
