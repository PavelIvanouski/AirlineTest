package by.airline.util;

import org.junit.Assert;
import org.junit.Test;

public class PlaneUtilTest {

    @Test
    public void testTakeOff() {

        boolean planeTakeOff = PlaneUtil.takeOff(true);
        Assert.assertEquals(true, planeTakeOff);
        Assert.assertNotEquals(false, planeTakeOff);

    }

    @Test
    public void testUseTheNavigator(){
        int finalParameter = PlaneUtil.useTheNavigator(10,10);
        Assert.assertEquals(20,finalParameter);
    }

}
