package fr.dauphine.ja.martinboris.iterable;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//changer pour AbstractList
public class Mult {
	
	public static List<Integer> mult(final int x, final List<Integer> l){
		//throws new UnsupportedOperationException();
		return new AbstractSequentialList<Integer>() {
			public ListIterator<Integer> listIterator(int index){
				//return new ListIterator<Integer>(index);
				return new ListIterator<Integer>();
			}
			private ListIterator<Integer> myLit = l.listIterator();
			//private ListIterator<Integer> myLit = l.listIterator(index);
			//}
			public boolean hasNext(){
				return myLit.hasNext();
			}
			
			public Integer next() {
				return myLit.next()*x;
			}

			public int size() {
				return l.size();
			}
			//remove, set, add : throws new UnsupportedOperationException();
		};

	}

}
