package com.wrn.array;

import java.util.Arrays;
import java.util.List;

import com.wrn.util.ForEachUtils;

public class ArrayImp {

	public int getSize(String[] array) {
		return array.length;
	}

	public List<String> convertArrayToList(String[] array) {
		return Arrays.asList(array);
	}

	public String[] buildArray(int size) {
		String [] newArray = new String[10];
		int sizeToForEach = ForEachUtils.sizeToForEach(size);
		int valueIndex = 0;
		while(sizeToForEach >= 0) {
			newArray[valueIndex] = String.valueOf(sizeToForEach);
			sizeToForEach --;
			valueIndex ++;
		}
		return newArray;
	}
	
	public String goThroughArray(String[] array) {
		StringBuilder populateString = new StringBuilder();
		for(String value : array) {
			populateString.append(value);
		}
		return String.valueOf(populateString);
	}

	public String[] sortArray(String[] arrayToSort) {
		Arrays.sort(arrayToSort);
		return arrayToSort;
	}

	public String[] addPositionToArra(String[] array, String valueToInsert) {
		array[array.length + 1] = valueToInsert;
		return array;
	}

	public String[] moveItemToTheEnd(String[] array, String valueToMove) {
		int size = ForEachUtils.sizeToForEach(array.length);
		int sizeToGoThrtough = size;
		String[] newArray = new String [array.length];
		int positionMoved = 0 ;
		boolean isPositionMoved = false;
		
		while(sizeToGoThrtough >= 0) {
			String value = array[sizeToGoThrtough];
			if(value.equals(valueToMove)) {
				newArray[size] = valueToMove;
				positionMoved = sizeToGoThrtough;
			}
			
			if(sizeToGoThrtough != positionMoved) {
				newArray[getPositionToAdd(sizeToGoThrtough, isPositionMoved)] = value;
			}else {
				isPositionMoved = true;
			}
			sizeToGoThrtough --;
		}
		return newArray;
	}
	
	private int getPositionToAdd(int sizeToGoThrtough, boolean isPositionMoved) {
		return isPositionMoved ? sizeToGoThrtough : sizeToGoThrtough  - 1;
	}

	public String[] moveToLeft(String[] array, String element, int position) {
		String[] newArray = array;
		boolean isRightPosition = false;
		while(!isRightPosition) {
			newArray = getNewArrayMoveLeft(newArray);
			if(element.equals(newArray[position - 1])) {
				isRightPosition = true;
			}
		}
		return newArray;
	}

	private String[] getNewArrayMoveLeft(String[] newArray) {
		int size = ForEachUtils.sizeToForEach(newArray.length);
		int sizeToManipulate = size;
		String[] arrayToManipulate = new String[newArray.length];
		while (sizeToManipulate >= 0) {
			int index = sizeToManipulate - 1;
			if(sizeToManipulate == 0) {
				index = size;
			}
			String value = newArray[sizeToManipulate];
			arrayToManipulate[index] = value;
			sizeToManipulate --;
		}
		return arrayToManipulate;
	}

	public String[] removeItem(String[] array, String element) {
		int size = ForEachUtils.sizeToForEach(array.length);
		while (size >= 0) {
			String value = array[size];
			if(element.equalsIgnoreCase(value)) {
				array[size] = "";
			}
			size --;
		}
		return array;
	}
}
