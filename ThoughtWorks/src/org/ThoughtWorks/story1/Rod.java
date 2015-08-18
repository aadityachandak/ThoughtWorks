package org.ThoughtWorks.story1;

public class Rod extends Length{
	public final double conversionFactor =502.92;

	private double length;

	public Rod(double rod) {
		super();
		this.length = rod;
	}

	public double convertToBase() {

		double cms = this.length*conversionFactor;

		return cms;

	}

	public double convertToRod(double length) {
		double rod = length / conversionFactor;
		return rod;
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
