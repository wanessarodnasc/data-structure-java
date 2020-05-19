package com.wrn.collection.list;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import com.wrn.util.ForEachUtilsTest;

public class LinkedListImplTest {

	LinkedList<String> stringLinkeList = new LinkedList<String>(Arrays.asList("1","2","3","4","5"));
	private LinkedListImpl linkedListImpl = new LinkedListImpl();
	private ForEachUtilsTest utils = new ForEachUtilsTest();
	
	@Test
	public void testArrayImpNull() {
		//The size of the array is count if the position is null
		LinkedList<String> stringLinkeList = new LinkedList<String>(Arrays.asList(null,null,null,null,null));
		int size = linkedListImpl.getSize(stringLinkeList);
		assertEquals(5, size);
	}
	
	@Test
	public void testArrayWithValues() {
		assertEquals(5, linkedListImpl.getSize(stringLinkeList));
	}
	
	@Test
	public void testArrayWithValuesGetFirstAndLast() {
		assertEquals("1", stringLinkeList.getFirst());
		assertEquals("5", stringLinkeList.getLast());
	}
	
	@Test
	public void testSortBy() {
		LinkedList<String> stringLinkeList = new LinkedList<String>(Arrays.asList("5","3","1","4","2"));
		assertEquals("12345", utils.forEach(linkedListImpl.sortedBy(stringLinkeList)));
	}
	
	@Test
	public void testAddElements() {
		String linkedListConvertToString = utils.forEach(stringLinkeList);
		assertEquals("12345", linkedListConvertToString);
	}
	
	@Test
	public void testAddElementsFirst() {
		List<String> linkedListConvertToString = linkedListImpl.addElementFirst(stringLinkeList, "6");
		assertEquals("612345", utils.forEach(linkedListConvertToString));
	}
	
	@Test
	public void testAddElementsLast() {
		List<String> linkedListConvertToString = linkedListImpl.addElementLast(stringLinkeList, "0");
		assertEquals("123450", utils.forEach(linkedListConvertToString));
	}
	
	@Test
	public void testRemoveElementsFirst() {
		List<String> linkedListConvertToString = linkedListImpl.removeElementFirst(stringLinkeList);
		assertEquals("2345", utils.forEach(linkedListConvertToString));
	}
	
	@Test
	public void testRemoveElementsLast() {
		List<String> linkedListConvertToString = linkedListImpl.removeElementLast(stringLinkeList);
		assertEquals("1234", utils.forEach(linkedListConvertToString));
	}
	
	@Test
	public void testRemoveElementsExecutionTime() {
		//The best way "that I know" to remove item from a list s2
		List<String> linkedListConvertToString = linkedListImpl.removeElementExecutionTime(stringLinkeList);
		assertEquals("1345", utils.forEach(linkedListConvertToString));
	}

	@Test
	public void testAddElementsAeddJustOneIndes() {
		LinkedList<String> stringLinkeList = new LinkedList<String>();
		stringLinkeList.add("1");
		//it is possible because the 0 position already exist
		//if you try stringLinkeList.add(2,"2"); it will not work because the index 2 does not exist yet
		stringLinkeList.add(0,"2");
		stringLinkeList.add("3");
		stringLinkeList.add("4");
		stringLinkeList.add("5");
		assertEquals("21345", utils.forEach(stringLinkeList));
	}
}
