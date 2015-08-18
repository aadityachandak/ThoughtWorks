package org.ThoughtWorks.story1;

public class Yard extends Length{

	public final double conversionFactor =91.44;
	
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

	public Yard(double yard) {
		super();
		this.length = yard;
	}

	public double convertToBase() {

		double cms = this.length*conversionFactor;

		return cms;

	}

	public double convertToYard(double length) {
		double yard = length / conversionFactor;
		return yard;
	}
}
