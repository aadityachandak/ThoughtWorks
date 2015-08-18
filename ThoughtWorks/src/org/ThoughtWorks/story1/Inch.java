package org.ThoughtWorks.story1;

public class Inch extends Length{
	
	public final double conversionFactor =2.54;

	private double length;

	public Inch(double inch) {
		super();
		this.length = inch;
	}

	public double convertToBase() {

		double cms = this.length*conversionFactor;

		return cms;

	}
	

	public double convertToInch(double length) {
		double inch = length / conversionFactor;
		return inch;
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

	public Length addTwoDimensions(Length dimensionA, Length dimensionB) {

		double d1, d2, sum;
		d1 = dimensionA.convertToBase();
		d2 = dimensionB.convertToBase();
		sum = d1 + d2;
		sum = convertToInch(sum);

		Inch summation = new Inch(sum);

		return summation;
	}


}
