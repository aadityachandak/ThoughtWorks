package org.ThoughtWorks.story1;

public class Kilometer extends Length {

	public final double conversionFactor = 100000;

	private double length;

	public Kilometer(double kilometer) {
		super();
		this.length = kilometer;
	}

	public double convertToBase() {

		double cms = this.length * conversionFactor;

		return cms;

	}

	public double convertToKilometer(double length) {
		double km = length / conversionFactor;
		return km;
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
		sum = convertToKilometer(sum);

		Kilometer summation = new Kilometer(sum);

		return summation;
	}

	public Length addTwoDimensions(Length dimensionB) {

		double d1, d2, sum;

		d1 = this.convertToBase();
		d2 = dimensionB.convertToBase();
		sum = d1 + d2;
		sum = convertToKilometer(sum);

		Kilometer summation = new Kilometer(sum);

		return summation;
	}
}
