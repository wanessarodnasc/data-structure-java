package com.wrn.collection.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

import com.wrn.util.ForEachUtilsTesting;

public class VectorImplTest {
	
	private List<String> listString = new Vector<>(Arrays.asList("1","2","3", "4", "5"));
	private VectorImpl vectorImp = new VectorImpl();
	private ForEachUtilsTesting utils = new ForEachUtilsTesting();

	@Test
	public void testVectorImpNull() {
		//The size of the Vector does not is count if the position is null
		List<String> stringLinkeList = new LinkedList<String>(Arrays.asList(null,null,null,null,null));
		int size = vectorImp.getSize(stringLinkeList);
		assertEquals(5, size);
	}
	
	@Test
	public void testVectorWithValues() {
		assertEquals(5, vectorImp.getSize(listString));
	}
	
	@Test
	public void testSortBy() {
		List<String> stringLinkeList = new Vector<String>(Arrays.asList("5","3","1","4","2"));
		assertEquals("12345", utils.forEach(vectorImp.sortBy(stringLinkeList)));
	}
	
	@Test
	public void testListConvertToArray() {
		String [] listReturned = vectorImp.convertToArray(listString);
		String listConvertedToString = utils.goThroughArray(listReturned);
		assertEquals("12345", listConvertedToString);
	}
	
	@Test
	public void testInsertItemDeterminedPosition() {
		List<String> listReturned = vectorImp.insertItemDeterminedPosition(listString, "0", 0);
		String listConvertedToString = utils.forEach(listReturned);
		assertEquals("012345", listConvertedToString);
	}
	
	@Test
	public void testRemoveItemDeterminedPosition() {
		List<String> listReturned = vectorImp.removeItemDeterminedPosition(listString, 0);
		String listConvertedToString = utils.forEach(listReturned);
		assertEquals("2345", listConvertedToString);
	}
	
	@Test
	public void testRemoveItem() {
		List<String> listReturned = vectorImp.removeItem(listString, "2");
		String listConvertedToString = utils.forEach(listReturned);
		assertEquals("1345", listConvertedToString);
	}
	
	@Test
	public void testClearList() {
		List<String> listReturned = vectorImp.removeItem(listString, "2");
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
