package org.example;

public enum Months {
    JANUARY(1, "January"),
    FEBRUARY(2, "February"),
    MARCH(3, "March"),
    APRIL(4, "April"),
    MAY(5, "May"),
    JUNE(6, "June"),
    JULY(7, "July"),
    AUGUST(8, "August"),
    SEPTEMBER(9, "September"),
    OCTOBER(10, "October"),
    NOVEMBER(11, "November"),
    DECEMBER(12, "December");

    private final int monthValue;
    private final String displayMonth;

    Months(int monthValue, String displayMonth) {
        this.monthValue = monthValue;
        this.displayMonth = displayMonth;
    }

    public int getMonthValue() {
        return monthValue;
    }

    public String getDisplayMonth() {
        return displayMonth;
    }

    @Override
    public String toString() {
        return displayMonth;
    }
}