package org.example.calctor;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.example.getter.DataGetter;

public interface Cycle{
    BigDecimal huanBi(LocalDate baseDate, DataGetter dataGetter);
    BigDecimal tongBi(LocalDate baseDate, DataGetter dataGetter);
}