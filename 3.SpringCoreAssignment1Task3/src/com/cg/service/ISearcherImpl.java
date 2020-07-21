package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

public class ISearcherImpl implements ISearcher {

	private List<String> cityList;
	
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	@Override
	public boolean search(String str) {
		return cityList.stream().anyMatch(s->s.equalsIgnoreCase(str));
	}

	@Override
	public List<String> searchStartWith(String str) {
		return cityList.stream().filter(s->s.startsWith(str)).collect(Collectors.toList());
	}

	@Override
	public List<String> displayAll() {
		return cityList;
	}

}
