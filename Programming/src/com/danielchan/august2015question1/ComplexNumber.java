package com.danielchan.august2015question1;

/**
 * Created by chanj on 4/24/2016.
 */
public class ComplexNumber {

    private float realPart, imaginaryPart;

    private ComplexNumber(float r, float i) {
        realPart = r;
        imaginaryPart = i;
    }

    private ComplexNumber(double mod, double ang) {
        realPart = (float) (mod * Math.cos(ang));
        imaginaryPart = (float) (mod * Math.sin(ang));
    }

    public float getRealPart() {
        return this.realPart;
    }

    public float getImaginaryPart() {
        return this.imaginaryPart;
    }

    public ComplexNumber addTwoComplexNumbers(ComplexNumber a) {
        return new ComplexNumber((a.getRealPart() + this.getRealPart()),
            (a.getImaginaryPart() + this.getImaginaryPart()));
    }

    public static ComplexNumber createFactory(float r,
        float imaginaryPart) {
        return new ComplexNumber(r, imaginaryPart);
    }

    public static ComplexNumber createPolar(double m, double a) {
        return new ComplexNumber(m, a);
    }


    @Override
    public String toString() {
        return (this.getRealPart() + " + " + this.getImaginaryPart() + "i");
    }

}
