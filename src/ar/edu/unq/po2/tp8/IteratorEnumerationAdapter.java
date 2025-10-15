package ar.edu.unq.po2.tp8;

import java.util.Enumeration;
import java.util.Iterator;


// <E> significa que es de cualquier tipo.
public class IteratorEnumerationAdapter<E> implements Enumeration<E>{
	
	private Iterator<E> variableIterator;
	
	public IteratorEnumerationAdapter(Iterator<E> variableIterator){
		this.variableIterator = variableIterator;
	}
	@Override
	public boolean hasMoreElements() {
		return variableIterator.hasNext();
	}
	
	@Override
	public E nextElement() {
		return variableIterator.next();
	}
	
	
	
}
