package com.bmgdevelopment.android.spotin;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


/**
 * Created by gabrielnieves18 on 07-09-16.
 *
 * New data
 */
public class ExampleUnitTest2 {

    @Test
    public void myname_isCorrect() throws Exception {
        assertArrayEquals("Gabriel".toCharArray(), "Gabriel".toCharArray());
    }

    @Test
    public void myname_isNotCorrect() throws Exception {
        assertArrayEquals("Gabriel".toCharArray(), "GabrieL".toCharArray());
    }

}
