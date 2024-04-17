package org.example;

enum Months {
    JANUARY(1, "January", "Winter"),
    FEBRUARY(2, "February", "Winter"),
    MARCH(3, "March", "Spring"),
    APRIL(4, "April", "Spring"),
    MAY(5, "May", "Spring"),
    JUNE(6, "June", "Summer"),
    JULY(7, "July", "Summer"),
    AUGUST(8, "August", "Summer"),
    SEPTEMBER(9, "September", "Autumn"),
    OCTOBER(10, "October", "Autumn"),
    NOVEMBER(11, "November", "Autumn"),
    DECEMBER(12, "December", "Winter");

    private final int monthValue;
    private final String displayMonth;
    private final String displaySeason;

    Months(int monthValue, String displayMonth, String displaySeason) {
        this.monthValue = monthValue;
        this.displayMonth = displayMonth;
        this.displaySeason = displaySeason;
    }

    public int getMonthValue() {
        return monthValue;
    }

    public String getDisplayMonth() {
        return displayMonth;
    }

    public String getDisplaySeason() {
        return displaySeason;
    }

    @Override
    public String toString() {
        return displayMonth;
    }
}