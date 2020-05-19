package com.wrn.util;

import java.util.List;

public class ForEachUtilsTesting {
	
	public String forEach(List<String> listReturned) {
		StringBuilder listConvertedToString = new StringBuilder();
		listReturned.stream().forEach(listValue -> {
			listConvertedToString.append(listValue);
		});
		return String.valueOf(listConvertedToString);
	}
	
	public String goThroughArray(String[] valueReturned) {
		StringBuilder populateStringWithListValue = new StringBuilder();
		//Is impossible use Stream to go through a array collection
		for(String valueArray : valueReturned) {
			populateStringWithListValue.append(valueArray);
		}
		return String.valueOf(populateStringWithListValue);
	}
}
