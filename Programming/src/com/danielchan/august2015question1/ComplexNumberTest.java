package com.danielchan.august2015question1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chanj on 4/24/2016.
 */
public class ComplexNumberTest {

    @Before public void setUp() throws Exception {

    }

    @Test
    public void addTwoComplexNumbers() throws Exception {
        ComplexNumber num1 = ComplexNumber.createFactory(1.11f, 1.13f);
        ComplexNumber num2 = ComplexNumber.createFactory(2.14f, 3.14f);

        ComplexNumber sum = num1.addTwoComplexNumbers(num2);

        Assert.assertTrue(sum.getRealPart() == 3.25f && sum.getImaginaryPart()
            == 4.27f);
    }

    @Test
    public void createFactory() throws Exception {

        ComplexNumber testCase = ComplexNumber.createFactory(1.13f, 3.14f);

        assertTrue(testCase.getRealPart() == 1.13f
            && testCase.getImaginaryPart() == 3.14f);
    }

    @Test
    public void createPolar() throws Exception {

        ComplexNumber testCase = ComplexNumber.createPolar(3.14, 1.777);

        assertTrue(testCase.getRealPart() == (float) (3.14 * Math.cos(1.777))
            && testCase.getImaginaryPart() == (float) (3.14 * Math.sin(1.777)));

    }

}
