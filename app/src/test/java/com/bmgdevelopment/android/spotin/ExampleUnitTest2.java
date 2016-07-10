package com.bmgdevelopment.android.spotin;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by gabrielnieves18 on 07-09-16.
 */
public class ExampleUnitTest2 {

    @Test
    public void myname_isCorrect() throws Exception {
        assertArrayEquals("Gabriel".toCharArray(), "Gabriel".toCharArray());
    }

    @Test
    public void myname_isNotCorrect() throws Exception {
        assertArrayEquals("Gabriel".toCharArray(), "GabrieL".toCharArray());
        assertArrayEquals("Gabriel".toCharArray(), "GabrieL".toCharArray());
    }

}
