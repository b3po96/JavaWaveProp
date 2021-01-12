package jMath;

public class ComplexNumber {

	private double real;
	private double imaginary;
	private double[] imaginaryArray;
	
	
	public ComplexNumber() {
		this.real = 0.0;
		this.imaginary = 0.0;
	}
	
	public ComplexNumber(double real, double imag) {
		this.real = real;
		this.imaginary = imag;
	}
	
	public ComplexNumber(double real, double[] imag) {
		this.real = real;
		this.imaginaryArray = imag;
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

	
	/**
	 * Getter method for imaginaryArray component.
	 * 
	 * @return Imaginary array component of complex number
	 */
	public double[] getImaginaryArray() {
		return imaginaryArray;
	}
	
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
		copy.real = ((a.real * b.real) + (a.imaginary * b.imaginary))/(Math.pow(b.real, 2) + Math.pow(b.imaginary, 2));
		copy.imaginary = ((a.imaginary * b.real) + (a.real * b.imaginary))/(Math.pow(b.real, 2) + Math.pow(b.imaginary, 2));
		return copy;
	}
	
	public double abs() {
		return (this.real * this.real + this.imaginary * this.imaginary);
	}
}
