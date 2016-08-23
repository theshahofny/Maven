package org.ssa.ironyard.web;

public class Vegetable {

	private final Color color;
	private final String name;
	
	public Vegetable(Color color, String name) {
		super();
		this.color = color;
		this.name = name;
	}

	enum Color{
		RED, GREEN, YELLOW, BROWN, PURPLE, ORANGE;	
	}

	public Color getColor() {
		return color;
	}

	public String getName() {
		return name;
	}
	
	
}
