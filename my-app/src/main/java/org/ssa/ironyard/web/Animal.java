package org.ssa.ironyard.web;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	public String name;
	public List<Continent> natively = new ArrayList<>();
	public String fact;

	enum Continent{
		Europe, NorthAmerica, SouthAmerica, Africa, Asia, Austrailia, Anartica, inYourImagination, Where;
	}

	public Animal(String name) {
		this.name = name;
		natively.add(Continent.Where);
		fact = " ";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addCon(Continent continent){
		natively.add(continent);
	}
	
	public void addFact(String fact){
		this.fact = fact;
	}
	
}
