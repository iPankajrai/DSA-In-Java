/**
 * 
 */
package ClassAndObjectBasics;

/**
 * @author Pankaj Rai
 * @date 08 May 2022
 *
 */
public class DynamicArray {

	/**
	 * 1. Private Data members: int data[] and int nextIndex
	 * 2. Functions: constructor d.add(), d.set(index, element), d.get(index), d.size(), d.isEmpty(), d.removeLast(), d.restructure() [private]
	 * 
	 */
	
	private int data[];
	private int nextIndex;
	
	public DynamicArray() {
		data = new int[5];
		nextIndex =0;
	}
	
	public void add(int element) {
		if(nextIndex == data.length) {
			this.restructure();
		}
		data[nextIndex] = element;
		nextIndex++;
	}
	
	public int get(int index) {
		if(index < nextIndex) {
			return data[index];
		}else {
			//TODO error out
			return -1;
		}
		
	}
	
	public int size() {
		return nextIndex;
	}
	
	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int removeLast() {
		if(this.size() == 0) {
			//error out
			return -1;
		}
		int value = data[nextIndex-1];
		data[nextIndex-1] = 0;
		nextIndex--;
		return value;
	}
	
	public void set(int index, int element) {
		// need to check if the index is more or less than the nextIndex
		if(index < this.nextIndex) {
			data[index] = element;
		}else if(index == nextIndex) {
			this.add(element);
		}else {
			//error out 
			return;
		}
	}
	
	private void restructure() {
		int temp[] = data;
		
		data = new int[data.length * 2];
		for(int i=0; i<temp.length; i++) {
			data[i] = temp[i];
		}
	}
	
	public void print() {
		System.out.print("[");
		for(int i=0; i<this.nextIndex; i++) {
			System.out.print(data[i]);
			if(i < this.nextIndex-1) {
				System.out.print(" ");
			}
		}
		System.out.println("]");
	}
	
}
