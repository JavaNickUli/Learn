package uli.nick.javarush.task.pro.task13;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths() {
        return new Month[] {values()[11], values()[0], values()[1]};
    }

    public static Month[] getSpringMonths() {
        return new Month[] {values()[2], values()[3], values()[4]};
    }

    public static Month[] getSummerMonths() {
        return new Month[] {values()[5], values()[6], values()[7]};
    }

    public static Month[] getAutumnMonths() {
        return new Month[] {values()[8], values()[9], values()[10]};
    }
}
