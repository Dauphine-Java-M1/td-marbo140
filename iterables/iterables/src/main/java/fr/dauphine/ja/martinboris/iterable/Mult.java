package fr.dauphine.ja.martinboris.iterable;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
//changer pour AbstractList
public class Mult {
	
	public static List<Integer> mult(int x, List<Integer> l){
		//throws new UnsupportedOperationException();
		return new AbstractSequentialList<Integer>() {
			public ListIterator<Integer> listIterator(int index){
				return new ListIterator<Integer>(index);
			}
			private ListIterator<Integer> myLit = l.listIterator(index);
			//}
			public boolean hasNext(){
				return myLit.hasNext();
			}
			
			public Integer next() {
				return myLit.next()*x;
			}
			
			//remove, set, add : throws new UnsupportedOperationException();
		};

	}
	
	public int size() {
		return l.size();
	}

}
