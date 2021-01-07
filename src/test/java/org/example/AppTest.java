package org.example;

import java.time.LocalDate;

import org.example.calctor.impl.YearCycle;
import org.example.getter.ExampleDataGetter;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        YearCycle yearCycle = new YearCycle();
        ExampleDataGetter dataGetter = new ExampleDataGetter();

        System.out.println(yearCycle.huanBi(LocalDate.now(), dataGetter));
    }
}
