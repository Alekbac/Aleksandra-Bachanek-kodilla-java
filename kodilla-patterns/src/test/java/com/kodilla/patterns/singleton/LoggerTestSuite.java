package com.kodilla.patterns.singleton;

import com.kodilla.petterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog() {
        //Given
        String log = "my log";
        //When
        Logger.getInstance().log( log );
        //Then
        Assert.assertEquals(log, Logger.getInstance().getLastLog());
    }
}
