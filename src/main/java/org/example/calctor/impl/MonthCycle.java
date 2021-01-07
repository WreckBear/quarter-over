package org.example.calctor.impl;

import java.time.LocalDate;
import java.time.Month;

import org.example.calctor.AbstractCycle;
import org.example.calctor.bean.BaseTargetRange;


public class MonthCycle extends AbstractCycle {

    @Override
    protected BaseTargetRange huanBiRange(LocalDate baseDate) {
        int year = baseDate.getYear();
        Month baseMonth = baseDate.getMonth();
        LocalDate minus1Month = baseDate.minusMonths(1);
        return new BaseTargetRange(
                LocalDate.of(year, baseMonth, 1),
                LocalDate.of(year, baseMonth, baseDate.getDayOfMonth()),
                LocalDate.of(year, minus1Month.getMonth(), 1),
                LocalDate.of(year, minus1Month.getMonth(), minus1Month.getDayOfMonth())
        );
    }

    @Override
    protected BaseTargetRange tongBiRange(LocalDate baseDate) {
        int baseYear = baseDate.getYear();
        LocalDate minus1Years = baseDate.minusYears(1);
        int targetYear = minus1Years.getYear();
        return new BaseTargetRange(
                LocalDate.of(baseYear, baseDate.getMonth(), 1),
                LocalDate.of(baseYear, baseDate.getMonth(), baseDate.getDayOfMonth()),
                LocalDate.of(targetYear, minus1Years.getMonth(), 1),
                LocalDate.of(targetYear, minus1Years.getMonth(), minus1Years.getDayOfMonth())
        );
    }
}