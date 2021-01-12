/**
 * 
 */
package jSignal;

/**
 * Represents an exponential signal.
 * <p>
 * The signal is formulated as:
 * <code>x(t) = Ce<sup>(jwt + a)</sup></code>
 * 
 * @author Bryce Buchanan
 * @version 1.0
 * 
 */

public class ExponentialSignal extends Signal {
	
	public ExponentialSignal(int amp, int freq, int phase, Periodicity p, int startTime, int endTime) {
		super(amp, freq, phase, p);
		
		this.signal = new double[endTime - startTime + 1];
		if (this.getPeriodicity() == Periodicity.PERIODIC) {
			
			for (int i = startTime; i <= endTime; i += 2) {
				double degrees = (getFrequency()/(2 * Math.PI) * i) + getPhase();
				double sample = getAmplitude() * Math.sin(Math.toRadians(degrees));
				this.signal[i] = sample;
			}
			for (int i = startTime + 1; i <= endTime; i+= 2) {
				double degrees = (getFrequency()/(2 * Math.PI) * i) + getPhase();
				double sample = getAmplitude() * Math.sin(Math.toRadians(degrees));
				this.signal[i] = sample;
			}
		}
	}

}
