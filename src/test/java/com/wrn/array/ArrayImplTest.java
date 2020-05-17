package com.wrn.array;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.wrn.array.ArrayImp;

public class ArrayImplTest {

	private ArrayImp arrayImp = new ArrayImp();
	private String[] array = {"1","2","3","4","5"};
	
	@Test
	public void testArrayImpNull() {
		//The size of the array is count if the position is null
		String[] array = {null,null,null,null,null};
		assertEquals(5, arrayImp.getSize(array));
	}
	
	@Test
	public void testArrayWithValues() {
		assertEquals(5, arrayImp.getSize(array));
	}
	
	@Test
	public void testSortBy() {
		String [] arrayReturned = arrayImp.buildArray(10);
		assertEquals("9876543210", arrayImp.goThroughArray(arrayReturned));
	}
	
	@Test
	public void testArrayConvertToList() {
		List<String> listReturned = arrayImp.convertArrayToList(array);	
		StringBuilder populateStringWithListValue = new StringBuilder();
		listReturned.stream().forEach((valueList) -> {
			populateStringWithListValue.append(valueList);
		});
		assertEquals("12345", String.valueOf(populateStringWithListValue));
	}
	
	@Test
	public void testGoThroughArray() {
		String valueReturned = arrayImp.goThroughArray(array);	
		assertEquals("12345", valueReturned);
	}
	
	@Test
	public void testSort() {
		String[] arrayToSort = {"3","5","4","2","1"};
		String[] valueReturned = arrayImp.sortArray(arrayToSort);	
		assertEquals("12345", goThroughArray(valueReturned));
	}
	
	@Test
	public void testInsertOnePositionToArray() {
		//Is impossible insert a new element
		boolean exception = false;
		try {
			array[array.length] = "6";
		} catch (ArrayIndexOutOfBoundsException e) {
			exception = true;
		}
		assertTrue(exception);
	}
	
	@Test
	public void testMoveItemToTheEnd() {
		String valueToMove = "3";
		String[] valueReturned = arrayImp.moveItemToTheEnd(array, valueToMove);	
		assertEquals("12453", goThroughArray(valueReturned));
	}
	
	@Test
	public void testMoveToLeft() {
		int timesToMove = 5;
		String element = "4";
		String[] valueReturned = arrayImp.moveToLeft(array, element, timesToMove);	
		assertEquals("51234", goThroughArray(valueReturned));
	}
	
	@Test
	public void testRemoveItem() {
		String element = "4";
		String[] valueReturned = arrayImp.removeItem(array, element);	
		int size = valueReturned.length;
		assertEquals("1235", goThroughArray(valueReturned));
		//The size does not change even if the elements are removed
		assertEquals(size, array.length);
	}
	
	private String goThroughArray(String[] valueReturned) {
		StringBuilder populateStringWithListValue = new StringBuilder();
		//Is impossible use Stream to go through a array collection
		for(String valueArray : valueReturned) {
			populateStringWithListValue.append(valueArray);
		}
		return String.valueOf(populateStringWithListValue);
	}
}
