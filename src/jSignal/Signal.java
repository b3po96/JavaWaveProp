package jSignal;


/**
 * Abstract class for creating a signal. A signal is described by an amplitude (magnitude of the crest),
 * a frequency (how fast the the signal oscillates), and a phase (alignment of the wave in relation to
 * the first position).
 * <p> 
 * The signal has multiple properties:
 * <ul>
 * 		<li>Periodicity: Determines whether the signal repeats on a particular period</li>
 * 		<li>Linearity: Determines whether the signal can be described linearly or non-linearly.</li>
 * 		<li>Time Variance: Determines whether a signal changes with time delays.</li>
 * 		<li>Causality: If causal, the signal cannot start at t < 0.</li>
 * </ul>
 * </p>
 * @author brycebuchanan
 * @version 1.0
 */
public abstract class Signal {
	
	private int amplitude;
	private int frequency;
	private int phase;
	private Periodicity periodicity;
	
	protected double[] signal;
	
	
	public Signal(int amp, int freq, int phase, Periodicity p) {
		this.amplitude = amp;
		this.frequency = freq;
		this.phase = phase;
		this.periodicity = p;
	}
	
	/**
	 * Getter method for amplitude.
	 * 
	 * @return The amplitude of the signal.
	 */
	public int getAmplitude() {
		return this.amplitude;
	}

	/**
	 * Getter method for frequency.
	 * 
	 * @return The frequency of the signal.
	 */
	public int getFrequency() {
		return this.frequency;
	}

	/**
	 * Getter method for phase.
	 * 
	 * @return The phase of the signal.
	 */
	public int getPhase() {
		return this.phase;
	}
	
	/**
	 * Getter method for the signal.
	 * 
	 * @return The representation of the signal as an array of doubles.
	 */
	public double[] getSignal() {
		return this.signal;
	}
	
	/**
	 * Getter method for the signal's periodicity
	 * 
	 * @return The periodicty of the signal
	 */
	public Periodicity getPeriodicity() {
		return this.periodicity;
	}
	
	/**
	 * Setter method for the amplitude
	 * 
	 * @param amp The amplitude to be set.
	 */
	public void setAmplitude(int amp) {
		this.amplitude = amp;
	}

	/**
	 * Setter method for the frequency.
	 * 
	 * @param freq The frequency to be set.
	 */ 
	public void setFrequency(int freq) {
		this.frequency = freq;
	}

	/**
	 * Setter method for the phase.
	 * 
	 * @param phase The phase to be set.
	 */
	public void setPhase(int phase) {
		this.phase = phase;
	}
	
	/**
	 * Setter method for the periodicity.
	 * 
	 * @param p The periodicity to be set.
	 */
	public void setPhase(Periodicity p) {
		this.periodicity = p;
	}

}
