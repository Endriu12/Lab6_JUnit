package com.perepelitsya;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * Created by Andriu on 16.03.2017.
 */
public class BoolCalculatorTest {
    //BinaryConstantZero
//to add 144 logger
    static Logger logger = Logger.getLogger(String.valueOf(BoolCalculator.class));

    @Test
    public void BinaryConstantZero_null_null() throws Exception {
        Boolean result = BoolCalculator.f0(null, null);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_null_null");
    }

    @Test
    public void BinaryConstantZero_null_false() throws Exception {
        Boolean result = BoolCalculator.f0(null, false);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_null_false");
    }

    @Test
    public void BinaryConstantZero_null_true() throws Exception {
        Boolean result = BoolCalculator.f0(null, true);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_null_true");
    }

    @Test
    public void BinaryConstantZero_false_null() throws Exception {
        Boolean result = BoolCalculator.f0(false, null);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_false_null");
    }

    @Test
    public void BinaryConstantZero_false_false() throws Exception {
        Boolean result = BoolCalculator.f0(false, false);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_false_false");
    }

    @Test
    public void BinaryConstantZero_false_true() throws Exception {
        Boolean result = BoolCalculator.f0(false, true);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_false_true");
    }

    @Test
    public void BinaryConstantZero_true_null() throws Exception {
        Boolean result = BoolCalculator.f0(true, null);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_false_null");
    }

    @Test
    public void BinaryConstantZero_true_false() throws Exception {
        Boolean result = BoolCalculator.f0(true, false);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_true_false");
    }

    @Test
    public void BinaryConstantZero_true_true() throws Exception {
        Boolean result = BoolCalculator.f0(true, true);
        Assert.assertEquals(false, result);
        logger.info("In process test BinaryConstantZero_true_true");
    }

    //AND
    @Test
    public void AND_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test AND_null_null");
    }

    @Test
    public void AND_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test AND_null_false");
    }

    @Test
    public void AND_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test AND_null_true");
    }

    @Test
    public void AND_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test AND_false_null");
    }

    @Test
    public void AND_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test AND_false_false");
    }

    @Test
    public void AND_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test AND_false_true");
    }

    @Test
    public void AND_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test AND_true_null");
    }

    @Test
    public void AND_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test AND_true_false");
    }

    @Test
    public void AND_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f1(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test AND_true_true");
    }

    //Inhibition (X/Y)
    @Test
    public void Inhibition_X_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_X_null_null");
    }

    @Test
    public void Inhibition_X_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_X_null_false");
    }

    @Test
    public void Inhibition_X_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_X_null_true");
    }

    @Test
    public void Inhibition_X_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_X_false_null");
    }

    @Test
    public void Inhibition_X_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Inhibition_X_false_false");
    }

    @Test
    public void Inhibition_X_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Inhibition_X_false_true");
    }

    @Test
    public void Inhibition_X_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_X_true_null");
    }

    @Test
    public void Inhibition_X_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Inhibition_X_true_false");
    }

    @Test
    public void Inhibition_X_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f2(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Inhibition_X_true_true");
    }

    //Transfer_X
    @Test
    public void Transfer_X_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Transfer_X_null_null");
    }

    @Test
    public void Transfer_X_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Transfer_X_null_false");
    }

    @Test
    public void Transfer_X_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Transfer_X_null_true");
    }

    @Test
    public void Transfer_X_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Transfer_X_false_null");
    }

    @Test
    public void Transfer_X_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Transfer_X_false_false");
    }

    @Test
    public void Transfer_X_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Transfer_X_false_true");
    }

    @Test
    public void Transfer_X_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Transfer_X_true_null");
    }

    @Test
    public void Transfer_X_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Transfer_X_true_false");
    }

    @Test
    public void Transfer_X_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f3(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Transfer_X_true_true");
    }

    // Inhibition (Y/X)*/
    @Test
    public void Inhibition_Y_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_Y_null_null");
    }

    @Test
    public void Inhibition_Y_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_Y_null_false");
    }

    @Test
    public void Inhibition_Y_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_Y_null_true");
    }

    @Test
    public void Inhibition_Y_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_Y_false_null");
    }

    @Test
    public void Inhibition_Y_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Inhibition_Y_false_false");
    }

    @Test
    public void Inhibition_Y_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Inhibition_Y_false_true");
    }

    @Test
    public void Inhibition_Y_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Inhibition_Y_true_null");
    }

    @Test
    public void Inhibition_Y_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Inhibition_Y_true_false");
    }

    @Test
    public void Inhibition_Y_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f4(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Inhibition_Y_true_true");
    }

    //Transfer_Y
    @Test
    public void Transfer_Y_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Transfer_Y_null_null");
    }

    @Test
    public void Transfer_Y_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Transfer_Y_null_false");
    }

    @Test
    public void Transfer_Y_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Transfer_Y_null_true");
    }

    @Test
    public void Transfer_Y_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Transfer_Y_false_null");
    }

    @Test
    public void Transfer_Y_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Transfer_Y_false_false");
    }

    @Test
    public void Transfer_Y_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Transfer_Y_fasle_true");
    }

    @Test
    public void Transfer_Y_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Transfer_Y_true_null");
    }

    @Test
    public void Transfer_Y_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Transfer_Y_true_false");
    }

    @Test
    public void Transfer_Y_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f5(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Transfer_Y_true_true");
    }

    /// XOR
    @Test
    public void XOR_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test XOR_null_null");
    }

    @Test
    public void XOR_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test XOR_null_false");
    }

    @Test
    public void XOR_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test XOR_null_true");
    }

    @Test
    public void XOR_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test XOR_false_null");
    }

    @Test
    public void XOR_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test XOR_false_false");
    }

    @Test
    public void XOR_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test XOR_false_true");
    }

    @Test
    public void XOR_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test XOR_true_null");
    }

    @Test
    public void XOR_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test XOR_true_false");
    }

    @Test
    public void XOR_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f6(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test XOR_true_true");
    }

    // OR
    @Test
    public void OR_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test OR_null_null");
    }

    @Test
    public void OR_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test OR_null_false");
    }

    @Test
    public void OR_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test OR_null_true");
    }

    @Test
    public void OR_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test OR_false_null");
    }

    @Test
    public void OR_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test OR_false_false");
    }

    @Test
    public void OR_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test OR_false_true");
    }

    @Test
    public void OR_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test OR_true_null");
    }

    @Test
    public void OR_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test OR_true_false");
    }

    @Test
    public void OR_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f7(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test OR_true_true");
    }

    // NOR
    @Test
    public void NOR_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test NOR_null_null");
    }

    @Test
    public void NOR_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test NOR_null_false");
    }

    @Test
    public void NOR_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test NOR_null_true");
    }

    @Test
    public void NOR_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test NOR_false_null");
    }

    @Test
    public void NOR_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test NOR_false_false");
    }

    @Test
    public void NOR_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test NOR_false_true");
    }

    @Test
    public void NOR_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test NOR_true_null");
    }

    @Test
    public void NOR_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test NOR_true_false");
    }

    @Test
    public void NOR_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f8(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test NOR_true_true");
    }

    //Equivalence
    @Test
    public void Equivalence_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Equivalence_null_null");
    }

    @Test
    public void Equivalence_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Equivalence_null_false");
    }

    @Test
    public void Equivalence_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Equivalence_null_true");
    }

    @Test
    public void Equivalence_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Equivalence_false_null");
    }

    @Test
    public void Equivalence_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Equivalence_false_false");
    }

    @Test
    public void Equivalence_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Equivalence_false_true");
    }

    @Test
    public void Equivalence_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Equivalence_true_null");
    }

    @Test
    public void Equivalence_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Equivalence_true_false");
    }

    @Test
    public void Equivalence_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f9(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Equivalence_true_true");
    }

    //NOT Y
    @Test
    public void Not_Y_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_Y_null_null");
    }

    @Test
    public void Not_Y_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_Y_null_false");
    }

    @Test
    public void Not_Y_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Not_Y_null_true");
    }

    @Test
    public void Not_Y_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_Y_false_null");
    }

    @Test
    public void Not_Y_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_Y_false_false");
    }

    @Test
    public void Not_Y_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Not_Y_false_true");
    }

    @Test
    public void Not_Y_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_Y_true_null");
    }

    @Test
    public void Not_Y_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_Y_true_false");
    }

    @Test
    public void Not_Y_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f10(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Not_Y_true_true");
    }

    // ANTI_IMPLICATION
    @Test
    public void ANTI_IMPLICATION_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test ANTI_IMPLICATION_null_null");
    }

    @Test
    public void ANTI_IMPLICATION_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test ANTI_IMPLICATION_null_false");
    }

    @Test
    public void ANTI_IMPLICATION_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test ANTI_IMPLICATION_null_true");
    }

    @Test
    public void ANTI_IMPLICATION_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test ANTI_IMPLICATION_false_null");
    }

    @Test
    public void ANTI_IMPLICATION_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test ANTI_IMPLICATION_false_false");
    }

    @Test
    public void ANTI_IMPLICATION_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test ANTI_IMPLICATION_false_true");
    }

    @Test
    public void ANTI_IMPLICATION_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test ANTI_IMPLICATION_true_null");
    }

    @Test
    public void ANTI_IMPLICATION_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test ANTI_IMPLICATION_true_false");
    }

    @Test
    public void ANTI_IMPLICATION_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f11(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test ANTI_IMPLICATION_true_true");
    }

    //Not_X
    @Test
    public void Not_X_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_X_null_null");
    }

    @Test
    public void Not_X_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_X_null_false");
    }

    @Test
    public void Not_X_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_X_null_true");
    }

    @Test
    public void Not_X_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_X_false_null");
    }

    @Test
    public void Not_X_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_X_false_false");
    }

    @Test
    public void Not_X_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_X_false_true");
    }

    @Test
    public void Not_X_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Not_X_true_null");
    }

    @Test
    public void Not_X_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Not_X_true_false");
    }

    @Test
    public void Not_X_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f12(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Not_X_true_true");
    }

    // Implication
    @Test
    public void Implication_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Implication_null_null");
    }

    @Test
    public void Implication_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_X_null_false");
    }

    @Test
    public void Implication_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_X_null_true");
    }

    @Test
    public void Implication_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_X_false_null");
    }

    @Test
    public void Implication_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_X_false_false");
    }

    @Test
    public void Implication_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_X_false_true");
    }

    @Test
    public void Implication_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test Not_X_true_null");
    }

    @Test
    public void Implication_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test Not_X_true_false");
    }

    @Test
    public void Implication_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f13(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test Not_X_true_true");
    }

    // NOT AND
    @Test
    public void NAND_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test NAND_null_null");
    }

    @Test
    public void NAND_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test NAND_null_false");
    }

    @Test
    public void NAND_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test NAND_null_true");
    }

    @Test
    public void NAND_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test NAND_false_null");
    }

    @Test
    public void NAND_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test NAND_false_false");
    }

    @Test
    public void NAND_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test NAND_false_true");
    }

    @Test
    public void NAND_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(null, result);
        logger.info("In process test NAND_true_null");
    }

    @Test
    public void NAND_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test NAND_true_false");
    }

    @Test
    public void NAND_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f14(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(false, result);
        logger.info("In process test NAND_true_true");
    }

    // BinaryConstantOne
    @Test
    public void BinaryConstantOne_null_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(null, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_null_null");
    }

    @Test
    public void BinaryConstantOne_null_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(null, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_null_false");
    }

    @Test
    public void BinaryConstantOne_null_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(null, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_null_true");
    }

    @Test
    public void BinaryConstantOne_false_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(false, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_false_null");
    }

    @Test
    public void BinaryConstantOne_false_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(false, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_false_false");
    }

    @Test
    public void BinaryConstantOne_false_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(false, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_false_true");
    }

    @Test
    public void BinaryConstantOne_true_null() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(true, null);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_true_null");
    }

    @Test
    public void BinaryConstantOne_true_false() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(true, false);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_true_false");
    }

    @Test
    public void BinaryConstantOne_true_true() throws Exception {
        Boolean result = null;
        try {
            result = BoolCalculator.f15(true, true);
        } catch (NullPointerException e) {

        }
        Assert.assertEquals(true, result);
        logger.info("In process test BinaryConstantOne_true_true");
    }
}