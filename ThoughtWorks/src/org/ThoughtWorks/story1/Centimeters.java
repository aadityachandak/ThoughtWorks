package org.ThoughtWorks.story1;

public class Centimeters extends Length {
	public final double conversionFactor =1;

	private double length;

	public Centimeters(double centimeters) {
		super();
		this.length = centimeters;
	}

	public Centimeters() {
		// TODO Auto-generated constructor stub
	}

	public double convertToBase() {

		double cms = this.length*conversionFactor;

		return cms;

	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	public Length addTwoDimensions(Length dimensionA, Length dimensionB) {

		double d1, d2,sum;
		d1=dimensionA.convertToBase();
		d2=dimensionB.convertToBase();
		sum=d1+d2;
		
		
		Centimeters summation = new Centimeters(sum);
		
	
		
		
		return summation;
	}

}
