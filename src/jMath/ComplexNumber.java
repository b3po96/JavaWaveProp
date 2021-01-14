package jMath;

public class ComplexNumber {

	private double real;
	private double imaginary;
	private double[] realArray;
	private double[] imaginaryArray;
	
	/**
	 * Default constructor for ComplexNumber with both components being equal to 0.0
	 */
	public ComplexNumber() {
		this.real = 0.0;
		this.imaginary = 0.0;
	}
	
	/**
	 * Constructor for ComplexNumber with fillable parameters
	 * @param real The real component
	 * @param imag The imaginary component
	 */
	public ComplexNumber(double real, double imag) {
		this.real = real;
		this.imaginary = imag;
	}
	
	/**
	 * Constructor for ComplexNumber with fillable parameters
	 * @param real The real component
	 * @param imag The imaginary component, as an array of doubles
	 */
	public ComplexNumber(double real, double[] imag) {
		this.real = real;
		this.imaginaryArray = imag;
	}
	
	/**
	 * Constructor for ComplexNumber for a signal longer than one instance.</br>
	 * This would be used to convert a signal from Cartesian to polar.
	 * 
	 * @param real The real component, as an array of doubles
	 * @param imag The imaginary component, as an array of doubles
	 */
	public ComplexNumber(double[] real, double[] imag) {
		this.realArray = real;
		this.imaginaryArray = imag;
	}
	
	public ComplexNumber(ComplexNumber copy) {
		this.real = copy.getReal();
		this.imaginary = copy.getImaginary();
	}
	/**
	 * toString() method override</br></br>
	 * <p>Prints the result as <code>a +/- jb</code>, where:</br></br>
	 * <i>a = ComplexNumber.real</i>, and</br></br>
	 * <i>b = ComplexNumber.imaginary</i>
	 * </p>
	 * 
	 * @return <code>String</code> representation of the COmplexNumber object
	 */
	@Override
	public String toString() {
		if (this.imaginary >= 0) {
			return this.real + " + j" + Math.abs(this.imaginary);
		}
		else if (this.imaginary < 0) {
			return this.real + " - j" + Math.abs(this.imaginary);
		}
		else if (this.imaginaryArray != null && this.imaginaryArray[0] >= 0) {
			String str = "Warning: multiple instances of componetns found. Printing first instance: "
					+ this.realArray[0] + " + j" + Math.abs(this.imaginaryArray[0]);
			return str;
		}
		else {
			String str = "Warning: multiple instances of componetns found. Printing first instance: "
					+ this.realArray[0] + " - j" + Math.abs(this.imaginaryArray[0]);
			return str;
		}
	}
	
	/**
	 * Getter method for real component
	 * 
	 * @return Real component of complex number
	 */
	public double getReal() {
		return this.real;
	}
	
	/**
	 * Getter method for imaginary component
	 * 
	 * @return Imaginary component of complex number
	 */
	public double getImaginary() {
		return this.imaginary;
	}

	/**
	 * Getter method for realArray component.
	 * 
	 * @return Real array component of complex number
	 */
	public double[] getRealArray() {
		return realArray;
	}
	
	/**
	 * Getter method for imaginaryArray component.
	 * 
	 * @return Imaginary array component of complex number
	 */
	public double[] getImaginaryArray() {
		return imaginaryArray;
	}
	/**
	 * 
	 * @param a first ComplexNumber object: <code>a + jb</code>
	 * @param b second ComplexNumber object: <code>c + jd</code>
	 * @return Addition of ComplexNumber objects
	 */
	public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		ComplexNumber copy = new ComplexNumber();
		copy.real = a.real + b.real;
		copy.imaginary = a.imaginary + b.imaginary;
		return copy;
	}
	
	public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
		ComplexNumber copy = new ComplexNumber();
		copy.real = a.real - b.real;
		copy.imaginary = a.imaginary - b.imaginary;
		return copy;
	}
	
	public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
		ComplexNumber copy = new ComplexNumber();
		copy.real = (a.real * b.real) - (a.imaginary * b.imaginary);
		copy.imaginary = (a.real * b.imaginary) - (a.imaginary * b.real);
		return copy;
	}
	
	public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
		ComplexNumber copy = new ComplexNumber();
		copy.real = ((a.real * b.real) + (a.imaginary * b.imaginary)) / 
					(Math.pow(b.real, 2) + Math.pow(b.imaginary, 2));
		copy.imaginary = ((a.imaginary * b.real) + (a.real * b.imaginary)) / 
						 (Math.pow(b.real, 2) + Math.pow(b.imaginary, 2));
		return copy;
	}
	
	public double abs() {
		return (this.real * this.real + this.imaginary * this.imaginary);
	}
	
	public ComplexNumber toPolar(ComplexNumber a) {
		if (a.imaginaryArray == null) {
			return new ComplexNumber(Math.exp(a.real) * Math.cos(a.imaginary), 
									 Math.exp(a.real) * Math.sin(a.imaginary));
		}
		else {
			double[] real = new double[a.imaginaryArray.length];
			double[] imag = new double[a.imaginaryArray.length];
			for (int i = 0; i <= imag.length; i++) {
				real[i] = Math.exp(a.real) * Math.cos(a.imaginaryArray[i]);
				imag[i] = Math.exp(a.real) * Math.sin(a.imaginaryArray[i]);
			}
			return new ComplexNumber(real, imag);
		}
	}
}
