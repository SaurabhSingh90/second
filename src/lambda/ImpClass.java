package lambda;

import java.util.Comparator;

public class ImpClass implements Comparator<ar>{
@Override 
public int compare(ar o1,ar o2) {
	return o1.getName().compareToIgnoreCase(o2.getName());
}
}
