package com.joungpark.resume_api.model;

public class Hero {
	private int id;
	private String name;
	
	public Hero() {
		super();
	}
	
	public Hero(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + "]";
	}
	
}
