package org.ThoughtWorks.story1;

public class Meters extends Length {
	public final double conversionFactor =100;
	private double length;

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

	public Meters(double meters) {
		super();
		this.length = meters;
	}

	public double convertToBase() {

		// double centimeters = meters*100;
		double centimeters = this.length * conversionFactor;

		return centimeters;

	}

	public double convertToMeter(double length)
	{
		double meter = length/conversionFactor;
		
		return meter;
	}
	
	public Length addTwoDimensions(Length dimensionA, Length dimensionB) {

		double d1, d2, sum;
		d1 = dimensionA.convertToBase();
		d2 = dimensionB.convertToBase();
		sum = d1 + d2;
		sum = convertToMeter(sum);

		Meters summation = new Meters(sum);

		return summation;
	}


}
