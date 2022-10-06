package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class arDriver {
	public static void main(String[] args) {
		List <ar> car=new ArrayList<>();
		ar car1=new ar("mustang", "black", 8);
		ar car2=new ar("mustan", "blue", 6);
		ar car3=new ar("musta", "white", 8);
		ar car4=new ar("must", "carbon", 4);
		ar car5=new ar("mut", "blue", 8);
		ar car6=new ar("mus", "red", 3);
		car.add(car6);
		car.add(car5);
		car.add(car3);
		car.add(car4);
		car.add(car2);
		car.add(car1);
		System.out.println("before sorting");
		car.forEach(System.out::println);
		//ImpClass in =new ImpClass();
//		Comparator<ar> dd=new Comparator<ar>() {
//			@Override
//			public int compare(ar o1, ar o2) {
//				return o1.getColor().compareToIgnoreCase(o2.getColor());
//			}
//		};
		Collections.sort(car,(e1,e2)->{
			//lambda expression()->{}  lambda expression is use to give the implementation 
			//to abstracts methods of funtion interface
			//note:- interface with one abstract method is known as function interface.
			//inside ()in lambda expression we provide actual argument or parameter
			//() seprated by lambda expression and followed by 
			//inside {}lambda expression  we will pass the actual argument 
			//note:- if we are providing one actual argument then () is not required similarly if we are giving single line implementation the {} are not required 
			//
			return e1.getColor().compareToIgnoreCase(e2.getColor());
		});
		System.out.println("after sprting");
		car.forEach(System.out::println);
		
	}

}
