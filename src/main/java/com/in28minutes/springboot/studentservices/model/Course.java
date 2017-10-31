package com.in28minutes.springboot.studentservices.model;

import java.util.List;

public class Course {

	private String id;
	private String name;
	private String description;
	private List<String> steps;

	public Course() {

	}

	public Course(String id, String name, String description, List<String> steps) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.steps = steps;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public List<String> getSteps() {
		return steps;
	}

	@Override
	public String toString() {
		return String.format("Course [id=%s, name=%s, description=%s, steps=%s]", id, name, description, steps);
	}
}
