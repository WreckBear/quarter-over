package org.example.calctor.impl;

import java.time.LocalDate;

import org.example.calctor.AbstractCycle;
import org.example.calctor.bean.BaseTargetRange;

public class YearCycle extends AbstractCycle {

    @Override
    protected BaseTargetRange huanBiRange(LocalDate baseDate) {
        int baseYear = baseDate.getYear();
        int targetYear = baseDate.minusYears(1).getYear();
        return new BaseTargetRange(
                LocalDate.of(baseYear, 1, 1),
                LocalDate.of(baseYear, 12, 31),
                LocalDate.of(targetYear, 1, 1),
                LocalDate.of(targetYear, 12, 31)
        );
    }

    @Override
    protected BaseTargetRange tongBiRange(LocalDate baseDate) {
        throw new IllegalArgumentException("tongBi unsupported for year");
    }
}