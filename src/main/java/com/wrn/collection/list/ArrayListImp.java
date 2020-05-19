package com.wrn.collection.list;

import java.util.Collections;
import java.util.List;

public class ArrayListImp {

	public List<String> sortBy(List<String> listString) {
		Collections.sort(listString);
		return listString;
	}

	public List<String> insertItemDeterminedPosition(List<String> listString, String valueToInsert, int positionToInsert) {
		listString.add(positionToInsert, valueToInsert);
		return listString;
	}

	public List<String> removeItemDeterminedPosition(List<String> listString, int positionToRemove) {
		listString.remove(positionToRemove);
		return listString;
	}

	public List<String> removeItem(List<String> listString, String valueToRemove) {
		listString.remove(valueToRemove);
		return listString;
	}

	public String[] convertToArray(List<String> listString) {
		return listString.toArray(new String[listString.size()]);
	}
}
