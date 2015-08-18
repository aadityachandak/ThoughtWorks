package org.ThoughtWorks.story1;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuantityTest {

	@Test
	public void testEquality() {

		Quantity qty = new Quantity();
		double length, length1;

		Length meter = new Meters(1.25);
		Length centimeter = new Centimeters(125);

		length = meter.convertToBase();
		length1 = centimeter.convertToBase();

		boolean value = qty.isEqual(length, length1);

		assertEquals(true, value);

	}

	@Test
	public void testNotEqual() {

		Quantity qty = new Quantity();

		double length, length1;

		Meters meter = new Meters(1.215);
		Centimeters centimeter = new Centimeters(125);

		length = meter.convertToBase();
		length1 = centimeter.convertToBase();

		boolean value = qty.isEqual(length, length1);

		assertEquals(false, value);

	}

	@Test
	public void testConverttoMeters() {

		Quantity qty = new Quantity();

		double length, length1, length2;

		Meters meter = new Meters(12.05);
		Centimeters centimeter = new Centimeters(1205);

		length = meter.getLength();
		length1 = centimeter.convertToBase();

		length2 = meter.convertToMeter(length1);

		boolean value = qty.isEqual(length2, length);

		assertEquals(true, value);

	}

	@Test
	public void testConverttoCentimeters() {

		Quantity qty = new Quantity();

		double length, length1;

		Meters meter = new Meters(1.25);
		Centimeters centimeter = new Centimeters(125);

		length = meter.convertToBase();
		length1 = centimeter.convertToBase();

		// length2 = obj.convertToMeter(length1);

		boolean value = qty.isEqual(length1, length);

		assertEquals(true, value);

	}

	@Test
	public void testConvertMetersToKms() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length meter = new Meters(1250);
		Length kilometer = new Kilometer(1.25);

		length = meter.convertToBase();
		length1 = kilometer.getLength();
		System.out.println(length1);

		length = kilometer.convertToKilometer(length);
		System.out.println(length);

		// boolean value = qty.isEqual(length1, length);
		assertEquals(length1, length, 0.01);
		// assertEquals(true, value);

	}

	@Test
	public void testConvertMetersToYard() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length meter = new Meters(91.44);
		Length yard = new Yard(100);

		length = meter.convertToBase();
		length1 = yard.getLength();

		length = yard.convertToYard(length);
		// boolean value = qty.isEqual(length1, length);
		assertEquals(length1, length, 0.01);

		// assertEquals(true, value);

	}

	@Test
	public void testConvertFootToInch() {

		// Quantity qty = new Quantity();

		double length;

		Length foot = new Foot(1);
		Length inch = new Inch(12);

		length = foot.convertToBase();
		length = inch.convertToInch(length);
		assertEquals(new Inch(length).getLength(), inch.getLength(), 0.0);
		// boolean value = qty.isEqual(length1, length);
		// assertEquals(length1, length, 0.01);

		// assertEquals(true, value);

	}

	@Test
	public void testConvertFootToYard() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length foot = new Foot(3);
		Length yard = new Yard(1);

		length = foot.convertToBase();
		length1 = yard.getLength();

		length = yard.convertToYard(length);
		// boolean value = qty.isEqual(length1, length);
		assertEquals(length1, length, 0.01);
		// assertEquals(true, value);

	}

/*	@Test
	public void testConvertMetersToFoot() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length meter = new Meters(30.48);
		Length foot = new Foot(100);

		length = meter.convertToBase();
		length1 = foot.getLength();
		length = foot.convertToFoot(length);

		// boolean value = qty.isEqual(length1, length);
		assertEquals(length1, length, 0.01);
		// assertEquals(true, value);

	}*/

	@Test
	public void testConvertInchToCms() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length inch = new Inch(1);
		Length cms = new Centimeters(2.54);

		length = inch.convertToBase();
		length1 = cms.getLength();
		length = cms.convertToBase();

		// boolean value = qty.isEqual(length1, length);
		assertEquals(length1, length, 0.01);
		// assertEquals(true, value);

	}

	/*@Test
	public void testConvertInchToFoot() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length inch = new Inch(12);
		Length foot = new Foot(1);

		length = inch.convertToBase();
		length1 = foot.getLength();
		length = foot.convertToFoot(length);

		// boolean value = qty.isEqual(length1, length);
		assertEquals(length1, length, 0.01);
		// assertEquals(true, value);

	}

*/	@Test
	public void testConvertYardToMile() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length yard = new Yard(1760);
		Length mile = new Mile(1);

		length = yard.convertToBase();
		length1 = mile.getLength();
		System.out.println(length1);
		length = mile.convertToMile(length);
		System.out.println(length);

		// boolean value = qty.isEqual(length1, length);

		assertEquals(length1, length, 0.01);

		// assertEquals(false, value); // decimal

	}

	@Test
	public void testConvertFootToRod() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length feet = new Foot(16.5);
		Length rod = new Rod(1);

		length = feet.convertToBase();
		length1 = rod.getLength();

		length = rod.convertToRod(length);
		// boolean value = qty.isEqual(length1, length);

		assertEquals(length1, length, 0.01);
		// assertEquals(true, value);

	}

	@Test
	public void testConvertKilometerToMeter() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length kms = new Kilometer(1);
		Length meter = new Meters(1000);

		length = kms.convertToBase();
		length1 = meter.getLength();

		length = meter.convertToMeter(length);
		// boolean value = qty.isEqual(length1, length);

		assertEquals(length1, length, 0.01);
		// assertEquals(true, value);

	}

	@Test
	public void testConvertMilimeterToCentimeters() {

		// Quantity qty = new Quantity();

		double length, length1;

		Length mm = new Milimeter(1);
		Length cms = new Centimeters(0.1);

		length = mm.convertToBase();
		length1 = cms.getLength();

		// boolean value = qty.isEqual(length1, length);

		assertEquals(length1, length, 0.01);
		// assertEquals(true, value);

	}

	@Test
	public void testAddFootAndInch() {

		// Quantity qty = new Quantity();

		double dimensionA, dimensionB;

		// Length cms = new Centimeters();

		Length foot = new Foot(1);
		Length inch = new Inch(12);

		Length sumInFoot = new Foot(2);

		dimensionA = foot.convertToBase();
		dimensionB = inch.convertToBase();

		dimensionA = foot.addTwoDimensions(dimensionA, dimensionB);

		 Foot dimension = foot.convertToFoot(dimensionA);

		assertEquals(dimension.getLength(), sumInFoot.getLength(),
				0.0);

	}

	@Test
	public void testAddMilesAndKms() {

		// Quantity qty = new Quantity();

		double dimensionA, dimensionB;

		// Length cms = new Centimeters();

		Length miles = new Mile(1);
		Length kms = new Kilometer(1.6);

		Length sumInMiles = new Mile(2);

		dimensionA = miles.convertToBase();
		dimensionB = kms.convertToBase();

		dimensionA = miles.addTwoDimensions(dimensionA, dimensionB);

		dimensionA = miles.convertToMile(dimensionA);

		assertEquals(new Mile(dimensionA).getLength(), sumInMiles.getLength(),
				0.0);

	}
	
	@Test
	public void testAddCentimetersAndMeters() {

		// Quantity qty = new Quantity();

		double dimensionA, dimensionB;

		// Length cms = new Centimeters();

		Length cms = new Centimeters(1);
		Length meters = new Meters(1);

		Length sumInCms = new Centimeters(101);

		dimensionA = cms.convertToBase();
		dimensionB = meters.convertToBase();

		dimensionA = cms.addTwoDimensions(dimensionA, dimensionB);

		
		
		assertEquals(new Mile(dimensionA).getLength(), sumInCms.getLength(),
				0.0);

	}
	
	@Test
	public void testAddKilometerAndMeters() {

		// Quantity qty = new Quantity();

		
		// Length cms = new Centimeters();

		Length kms = new Kilometer(1);
		Length meters = new Meters(900);

		Length sumInkms = new Kilometer(1.9);

		
		Length sum = kms.addTwoDimensions(kms, meters);
		
		
		assertEquals(sum.getLength(), sumInkms.getLength(),
				0.0);

	}
	
}