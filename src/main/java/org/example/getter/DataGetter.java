package org.example.getter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author zhanghao
 * Created on 2021/1/7
 */
@FunctionalInterface
public interface DataGetter {
    BigDecimal apply(LocalDate start, LocalDate end);
}
