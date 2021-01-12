package jMath;

public class ComplexNumber {

	private double real;
	private double imaginary;
	
	public ComplexNumber(double real, double imag) {
		this.real = real;
		this.imaginary = imag;
	}
	
	public ComplexNumber(ComplexNumber copy) {
		this.real = copy.getReal();
		this.imaginary = copy.getImaginary();
	}
	
	@Override
	public String toString() {
		if (this.getImaginary() >= 0) {
			return getReal() + " + j" + Math.abs(getImaginary());
		}
		else {
			return getReal() + " - j" + Math.abs(getImaginary());
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

	public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		ComplexNumber copy = new ComplexNumber(a);
		copy.real = copy.real + b.real;
		copy.imaginary = copy.imaginary + b.imaginary;
		return copy;
	}
	
	public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
		ComplexNumber copy = new ComplexNumber(a);
		copy.real = copy.real - b.real;
		copy.imaginary = copy.imaginary - b.imaginary;
		return copy;
	}
	
}
