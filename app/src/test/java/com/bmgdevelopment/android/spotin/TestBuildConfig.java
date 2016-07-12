package com.bmgdevelopment.android.spotin;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by gabrielnieves18 on 07-12-16.
 */
public class TestBuildConfig {

  @Test
    public void buildConfAppId_isCorrect() {
        assertArrayEquals(
                BuildConfig.APPLICATION_ID.toCharArray(),
                "com.bmgdevelopment.android.spotin".toCharArray());
    }

    @Test
    public void buildConfFlavor_isCorrect() {
        assertArrayEquals(
                BuildConfig.FLAVOR.toCharArray(),
                "".toCharArray());
    }

    @Test
    public void buildConfVersionCode_isCorrect() {
        assertEquals(BuildConfig.VERSION_CODE, 1);
    }

    @Test
    public void buildConfVersionCodeName_isCorrect() {
        assertArrayEquals(
                BuildConfig.VERSION_NAME.toCharArray(),
                "1.0".toCharArray());
    }

}
