/**
 * 
 */
package ClassAndObjectBasics;

/**
 * @author Pankaj Rai
 * @date: 08 May 2022
 *
 */
public class DynamicArrayUse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DynamicArray d = new DynamicArray();
		d.add(2);
		d.print();
		int dd = d.get(0);
		System.out.println(dd);
		d.set(1, 23);
		d.print();
		
		for (int i = 0; i < 100; i++) {
			d.add(i + 10);
		}
		
		System.out.println(d.size());
		
		d.set(4, 10);
		System.out.println(d.get(3));
		System.out.println(d.get(4));
		
		while (!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("size = " + d.size());
		}
	}

}
