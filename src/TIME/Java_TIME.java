package TIME;

import java.time.*;

public class Java_TIME {

    public static void main (String[] args) {
        YearMonth may = YearMonth.of(2025, Month.FEBRUARY);
        may.atDay(1)
                .datesUntil(may.atEndOfMonth())
                .forEach(System.out::println);
    }
}
