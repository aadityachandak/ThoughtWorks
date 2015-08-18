package org.ThoughtWorks.story1;

public class Foot extends Length{

	public final double conversionFactor =30.48;
	
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

	public Foot(double foot) {
		super();
		this.length = foot;
	}
	
	public double convertToBase() {

		double cms = this.length*conversionFactor;

		return cms;

	}

	public Foot convertToFoot(double length) {
		Foot foot = new Foot(length / conversionFactor);
		return foot;
	}

	public Length addTwoDimensions(Length dimensionA, Length dimensionB) {

		double d1, d2, sum;
		d1 = dimensionA.convertToBase();
		d2 = dimensionB.convertToBase();
		sum = d1 + d2;
		
		Foot summation = convertToFoot(sum);

		return summation;
	}

	
	
}
