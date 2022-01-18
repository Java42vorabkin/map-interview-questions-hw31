package telran.util;

import java.util.HashMap;

//all methods should be written with complexity O[1]
public class MyArray {
//TODO encapsulation - Done
	private int defaultValue;
	private int length;
	private HashMap<Integer, Integer> numbers = new HashMap<>();
	/**
	 * creates MyArray object with a given length
	 * all elements are set in 0
	 * @param length
	 */
	public MyArray(int length) {
		//TODO - Done
		this.length = length;
		defaultValue = 0;
	}
	/**
	 * sets a given value in all array's elements
	 * @param value
	 */  void setValue(int value) {
		//TODO - Done
		defaultValue = value;
		numbers = new HashMap<>();
	}
	/**
	 * 
	 * @param index
	 * returns value at a given index value
	 * throws ArrayIndexOutOfBoundsException in the case of wrong index
	 */
	public int getValueAt(int index) {
		//TODO - Done
		if(index >= length || index<0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return numbers.getOrDefault(index, defaultValue);
	}
	/**
	 * sets a given value at a given index
	 * @param index
	 * @param value
	 * throws ArrayIndexOutOfBoundsException in the case of wrong index
	 */
	public void setValueAt(int index, int value) {
		//TODO - Done
		if(index >= length || index<0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		numbers.put(index, value);
	}
}
