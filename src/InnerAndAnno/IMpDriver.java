package InnerAndAnno;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

interface ABC{
	public void show();
}
//class BCA implements ABC{
//	@Override
//	public void show() {
//		System.out.println("this is BCA ");
//	}
//}
public class IMpDriver {
	public static void main(String[] args) {
		ABC a=new ABC()
		{
			@Override
			public void show() {
				System.out.println("ths is i final");
			}
			// this is called anonymous class in which we can create insatance of 
			//interface and a
			//nd this class is created by java with the name of $ (sign),
			//this class have no any name so that it is called anonymous class this aclass is provided by jre 
			//advantage:- 1)we can give the implementation or override the method without need of creating  a new class
			//disadvantage:_)we cant use this implementation provide by aclass outside the class where aclass is initialized
		};
		a.show();
		List<Integer>list=new List<>() {

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Integer> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Integer e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int index, Collection<? extends Integer> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Integer set(int index, Integer element) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void add(int index, Integer element) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public Integer remove(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int indexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int lastIndexOf(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<Integer> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<Integer> listIterator(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public List<Integer> subList(int fromIndex, int toIndex) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
