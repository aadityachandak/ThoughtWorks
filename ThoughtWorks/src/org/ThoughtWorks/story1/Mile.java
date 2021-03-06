package org.ThoughtWorks.story1;

public class Mile extends Length {

	public final double conversionFactor = 160000;

	private double length;

	public Mile(double mile) {
		super();
		this.length = mile;
	}

	public double convertToBase() {

		double cms = this.length * conversionFactor;

		return cms;

	}

	public double convertToMile(double length) {
		double mile = length / conversionFactor;
		return mile;

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
		sum = convertToMile(sum);

		Mile summation = new Mile(sum);

		return summation;
	}

}
