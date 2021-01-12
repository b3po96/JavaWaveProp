package jSignal;

/**
 * Represents a sinusoidal signal.
 * 
 * @author Bryce Buchanan
 * @version 1.0
 *
 */
public class SinusoidalSignal extends Signal {
	
	/**
	 * SinusoidalSignal constructor
	 * 
	 * @param amp The amplitude of the signal (dimensionless)
	 * @param freq The frequency of the signal (in Hz)
	 * @param phase The phase of the signal (in degrees)
	 * @param startTime The starting point of the signal
	 * @param endTime The ending point of the signal
	 */
	public SinusoidalSignal(int amp, int freq, int phase, Periodicity p, int startTime, int endTime) {
		super(amp, freq, phase, p);
		
		this.signal = new double[endTime - startTime + 1];
		if (this.getPeriodicity() == Periodicity.PERIODIC) {
			for (int i = startTime; i <= endTime; i++) {
				double degrees = (2 * Math.PI * getFrequency() * i) + getPhase();
				double sample = getAmplitude() * Math.sin(Math.toRadians(degrees));
				this.signal[i] = sample;
			}
		}
		
	}
}



/*
 * TODO Allow for startTime/endTime to be floats/doubles
 * 
 * 
*/