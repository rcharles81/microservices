package com.microservices.limitsservice.model;

public class Limits {
	
	private int minimum;
	private int maximum;
	
	public Limits(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	@Override
	public String toString() {
		return "Limits [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	


}
