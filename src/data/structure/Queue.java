package data.structure;
/**
 * 
 * @author CYPRIAN DAVIS
 *
 * @param <T>
 */

public interface Queue<T> {
	
	/**
	 * Adds element e to the back of the queue
	 * @param e
	 */
	public void  enqueue(T e);
	/**
	 * Removes and returns the first element from the queue
	 * (null if the queue is emtpty)
	 */
	public T dequeue();
	/**
	 * Removes the frist element of the queue without removing it 
	 * (null if the queue os empty)
	 * @return
	 */
	public T first();
	/**
	 * Returns the number of elements in the queue
	 * @return
	 */
	public int size();
	/**
	 * Returns aboolean indicating whether the queue ie empty
	 * @return
	 */
	public boolean isEmpty();
	
	
	

}
