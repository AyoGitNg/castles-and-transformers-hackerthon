package com.ayodele;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfCastlesTest {

    @Test
    public void testPeak() {
        int[] stretchOfLand = {2,6,6,6,3};
        int numberOfCastles = NumberOfCastles.numberOfCastles(stretchOfLand);
        Assert.assertEquals(3, numberOfCastles);
    }

    @Test
    public void testValley() {
        int[] stretchOfLand = {6,1,4};
        int numberOfCastles = NumberOfCastles.numberOfCastles(stretchOfLand);
        Assert.assertEquals(3, numberOfCastles);
    }

}
