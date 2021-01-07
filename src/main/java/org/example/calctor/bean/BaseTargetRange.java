package org.example.calctor.bean;

import java.time.LocalDate;

public class BaseTargetRange{
    private LocalDate baseStart;
    private LocalDate baseEnd;
    private LocalDate targetStart;
    private LocalDate targetEnd;

    public BaseTargetRange(LocalDate baseStart, LocalDate baseEnd, LocalDate targetStart, LocalDate targetEnd){
        this.baseStart = baseStart;
        this.baseEnd = baseEnd;
        this.targetStart = targetStart;
        this.targetEnd = targetEnd;
    }

    public LocalDate getBaseStart() {
        return baseStart;
    }

    public void setBaseStart(LocalDate baseStart) {
        this.baseStart = baseStart;
    }

    public LocalDate getBaseEnd() {
        return baseEnd;
    }

    public void setBaseEnd(LocalDate baseEnd) {
        this.baseEnd = baseEnd;
    }

    public LocalDate getTargetStart() {
        return targetStart;
    }

    public void setTargetStart(LocalDate targetStart) {
        this.targetStart = targetStart;
    }

    public LocalDate getTargetEnd() {
        return targetEnd;
    }

    public void setTargetEnd(LocalDate targetEnd) {
        this.targetEnd = targetEnd;
    }
}