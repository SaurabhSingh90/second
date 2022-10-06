package InnerAndAnno;

class OuterClass{
	int a=10;
	class InnerClass{
		int b=20;
	}
}



public class OutterClassDriver {
	public static void main(String[] args) {
		OuterClass oc=new OuterClass();
		OuterClass.InnerClass innerClass=oc.new InnerClass();
		System.out.println(innerClass.b);
	}
}


