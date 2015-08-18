package org.ThoughtWorks.story1;

public class Milimeter extends Length {

	public final double conversionFactor =0.1;

	private double length;

	public Milimeter(double milimeters) {
		super();
		this.length = milimeters;
	}

	public double convertToBase() {

		double cms = this.length*conversionFactor;

		return cms;
		
	}

	public double convertToMilimeter(double length) {
		double mm = length / conversionFactor;
		return mm;
	}

	/**
	 * @return the conversionFactor
	 */
	public double getConversionFactor() {
		return conversionFactor;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

}

