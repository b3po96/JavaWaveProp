package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jSignal.*;

class SignalCreation {

	@Test
	void test() {
		
		SinusoidalSignal sig = new SinusoidalSignal(2, 220, 0, Periodicity.PERIODIC, 0, 10);
		double[] expectedSig = new double[]{0.0, -1.69, -1.807, -0.24, 1.55, 1.897, 0.477, -1.387, -1.959, -0.707, 1.203};
		
		assertEquals(sig.getAmplitude(), 2);
		assertEquals(sig.getFrequency(), 220);
		assertEquals(sig.getPhase(), 0);
		assertEquals(sig.getPeriodicity(), Periodicity.PERIODIC);
				
		assertArrayEquals(expectedSig, sig.getSignal(), 0.01);
		
		ExponentialSignal expSig = new ExponentialSignal(2, 220, 0, Periodicity.PERIODIC, 0, 10);
		double[] expectedExSig = new double[10 + 1];
		
		assertEquals(expSig.getAmplitude(), 2);
		assertEquals(expSig.getFrequency(), 220);
		assertEquals(expSig.getPhase(), 0);
		assertEquals(expSig.getPeriodicity(), Periodicity.PERIODIC);
		
	}

}
