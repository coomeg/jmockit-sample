package com.example.jmockit;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import mockit.Expectations;
import mockit.Tested;

public class SampleTest {

    @Tested
    public Sample target;

    @Test
    public void testGetLength() {
        new Expectations(target) {
            {
                target.output(anyString);
                times = 2;
            }
        };
        String result = target.getLegth("test");
        assertThat(result, is("4文字"));
    }
}
