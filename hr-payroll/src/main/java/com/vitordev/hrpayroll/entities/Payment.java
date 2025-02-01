package com.vitordev.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Double dayIncome;
    private Integer days;

    public Payment() {}

    public Payment(String name, Double dayIncome, Integer days) {
        this.name = name;
        this.dayIncome = dayIncome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDayIncome() {
        return dayIncome;
    }

    public void setDayIncome(Double dayIncome) {
        this.dayIncome = dayIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getTotal() {
        return dayIncome * days;
    }
}
