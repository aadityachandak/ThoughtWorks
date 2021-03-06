package org.ThoughtWorks.story1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdditionOfDimensionTests {

	@Test
	public void testAddKilometerAndMeters() {

		Length kms = new Kilometer(1);
		Length meters = new Meters(900);

		Length sumInkms = new Kilometer(1.9);

		Length sum = kms.addTwoDimensions(meters);

		assertEquals(sum.getLength(), sumInkms.getLength(), 0.0);
		
	}

}
