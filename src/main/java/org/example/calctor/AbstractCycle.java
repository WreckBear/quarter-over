package org.example.calctor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import org.example.calctor.bean.BaseTargetRange;
import org.example.getter.DataGetter;

/**
 * @author zhanghao
 * Created on 2021/1/7
 */
public abstract class AbstractCycle implements Cycle{

    protected abstract BaseTargetRange huanBiRange(LocalDate baseDate);
    protected abstract BaseTargetRange tongBiRange(LocalDate baseDate);

    @Override
    public BigDecimal huanBi(LocalDate baseDate, DataGetter dataGetter) {
        BaseTargetRange range = huanBiRange(baseDate);
        return doCalc(dataGetter.apply(range.getBaseStart(), range.getBaseEnd()),
                dataGetter.apply(range.getTargetStart(), range.getTargetEnd()));
    }

    @Override
    public BigDecimal tongBi(LocalDate baseDate, DataGetter dataGetter) {
        BaseTargetRange range = tongBiRange(baseDate);
        return doCalc(dataGetter.apply(range.getBaseStart(), range.getBaseEnd()),
                dataGetter.apply(range.getTargetStart(), range.getTargetEnd()));
    }

    private BigDecimal doCalc(BigDecimal baseAmount, BigDecimal targetAmount){
        return baseAmount.subtract(targetAmount)
                .divide(targetAmount, 2, RoundingMode.HALF_UP);
    }

}
