package com.rays.collection;

import java.util.List;
import java.util.Map;

public class MyBean {
	
	private List<String> list;
	private Map <String,Object>map;
	
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	} 
	
	public void displayData() {
		System.out.println("List elements:"+ list);
		System.out.println("Map enteries:"+ map);
	}
	
	

}
