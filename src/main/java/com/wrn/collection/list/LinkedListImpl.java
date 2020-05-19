package com.wrn.collection.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListImpl {

	public int getSize(List<String> stringLinkeList) {
		return stringLinkeList.size();
	}

	public List<String> sortedBy(List<String> stringLinkeList) {
		Collections.sort(stringLinkeList);
		return stringLinkeList;
	}

	public List<String> addElementFirst(LinkedList<String> stringLinkeList, String element) {
		stringLinkeList.addFirst(element);
		return stringLinkeList;
	}

	public List<String> addElementLast(LinkedList<String> stringLinkeList, String element) {
		stringLinkeList.addLast(element);
		return stringLinkeList;
	}

	public List<String> removeElementFirst(LinkedList<String> stringLinkeList) {
		stringLinkeList.removeFirst();
		return stringLinkeList;
	}

	public List<String> removeElementLast(LinkedList<String> stringLinkeList) {
		stringLinkeList.removeLast();
		return stringLinkeList;
	}

	public List<String> removeElementExecutionTime(List<String> stringLinkeList) {
		ListIterator<String> interactor = stringLinkeList.listIterator();
		while (interactor.hasNext()) {
			if(interactor.next().equalsIgnoreCase("2")) {
				interactor.remove();
			}
		}
		return stringLinkeList;
	}
}
