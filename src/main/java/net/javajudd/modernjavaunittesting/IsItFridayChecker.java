package net.javajudd.modernjavaunittesting;

import java.time.DayOfWeek;

public class IsItFridayChecker {

    private final Calendar calendar;

    public IsItFridayChecker(final Calendar calendar) {
        this.calendar = calendar;
    }

    public String isItFriday() {
        DayOfWeek dayOfWeek = calendar.getDayOfWeek();
        if(dayOfWeek == DayOfWeek.FRIDAY) {
            return "YEAH!!!";
        }
        return "AAAAAHAAH!!!";
    }
}
