package com.wrn.collection.list;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.wrn.util.ForEachUtilsTest;


public class ArrayListImpTest {
	
	private ArrayListImp arrayListImp = new ArrayListImp();
	private List<String> listString = new ArrayList<>(Arrays.asList("1","2","3","4", "5"));
	private ForEachUtilsTest utils = new ForEachUtilsTest();

	@Test
	public void testSize() {
		assertEquals(5, listString.size());
	}

	@Test
	public void testSizeNull() {
		List<String> listString = new ArrayList<>(Arrays.asList(null,null,null,null,null));
		assertEquals(5, listString.size());
	}
	
	@Test
	public void testSortBy() {
		List<String> listString = new ArrayList<>(Arrays.asList("4","1","5","2", "3"));
		List<String> listReturned = arrayListImp.sortBy(listString);
		String listConvertedToString = utils.forEach(listReturned);
		assertEquals("12345", listConvertedToString);
	}
	
	@Test
	public void testListConvertToArray() {
		String [] listReturned = arrayListImp.convertToArray(listString);
		String listConvertedToString = utils.goThroughArray(listReturned);
		assertEquals("12345", listConvertedToString);
	}
	
	@Test
	public void testInsertItemDeterminedPosition() {
		List<String> listReturned = arrayListImp.insertItemDeterminedPosition(listString, "0", 0);
		String listConvertedToString = utils.forEach(listReturned);
		assertEquals("012345", listConvertedToString);
	}
	
	@Test
	public void testRemoveItemDeterminedPosition() {
		List<String> listReturned = arrayListImp.removeItemDeterminedPosition(listString, 0);
		String listConvertedToString = utils.forEach(listReturned);
		assertEquals("2345", listConvertedToString);
	}
	
	@Test
	public void testRemoveItem() {
		List<String> listReturned = arrayListImp.removeItem(listString, "2");
		String listConvertedToString = utils.forEach(listReturned);
		assertEquals("1345", listConvertedToString);
	}
	
	@Test
	public void testClearList() {
		List<String> listReturned = arrayListImp.removeItem(listString, "2");
		listReturned.clear();
		assertEquals(0, listReturned.size());
	}
	
	@Test
	public void testCheckConatains() {
		//Should be the same time for example: 
		// listString.contains(2); << does not work because it is a list of String
		boolean contains = listString.contains("2");
		assertTrue(contains);
	}
	
	@Test
	public void testRemoveAllMethod() {
		listString.removeAll(listString);
		assertEquals(0, listString.size());
	}
	
	@Test
	public void testAddAllMethod() {
		List<String> newListString = new ArrayList<>(Arrays.asList("1","2","3","4", "5"));
		newListString.addAll(newListString);
		assertEquals(10, newListString.size());
	}
	
	@Test
	public void testIndexOf() {
		assertEquals(1, listString.indexOf("2"));
	}
}
