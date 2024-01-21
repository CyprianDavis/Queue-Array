package data.structure;
/**
 *Implementation of Queue ADT using array
 * @author CYPRIAN DAVIS
 *
 */

public class ArrayQueue<T> implements Queue<T>{
	//instance variables
	private T[] data;  //array used for data storage	
	private int size =0;  //current size of the queue
	private int f = 0;     //index of the first element
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int capcity) {
		data = (T[]) new Object[capcity];
	}

	@Override
	/**Inserts an  element at the back of the queue*/
	public void enqueue(T e)throws IllegalStateException {
		// TODO Auto-generated method stub
		if(size == data.length) throw new IllegalStateException("Queue is full");
		int temp = (f+size)%data.length;
		data[temp] =e;
		size++;
	}

	@Override
	/**Removes and returns the first element of the queue (null if empty)*/
	public T dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty())
			return null;
		T temp = data[f];
		f=(f+1)%data.length;
		size --;
		return temp;
	}

	
	
	@Override
	/**Returns, but deos not remove, the first elenment of the queue (null if emepty)*/
	public T first() {
		// TODO Auto-generated method stub
		if(isEmpty()) 
			return null;
		return data[f];
	}

	@Override
	/**Returns the number of elements in the queue*/
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	/**Returns a boolean indicating whether the queue is empty*/
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (size == 0);
	}

}
