package agenda;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Description : A repetitive Event
 */
public class RepetitiveEvent extends Event {
    ChronoUnit freq;
    ArrayList<LocalDate> exception = new ArrayList<LocalDate>();

    public RepetitiveEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency) {
        super(title, start, duration);
        freq = frequency;
    }

    public void addException(LocalDate date) {
        exception.add(date);

    }

    public boolean isInDay(LocalDate aDay) {
        LocalDate jourEvent = myStart.toLocalDate();
        if (aDay.equals(jourEvent)) {
            return (true);
        } else {
            if ((myStart.plus(myDuration)).getDayOfWeek() != myStart.getDayOfWeek()
                    && (aDay).equals(jourEvent.plusDays(1))) {
                return (true);
            }
            if (exception.contains(aDay) == true) {
                return (false);
            }

            if (freq == ChronoUnit.DAYS) {
                if (aDay.isAfter(myStart.toLocalDate()) == true) {
                    return (true);
                }
            }
            if (freq == ChronoUnit.WEEKS) {
                if (aDay.isAfter(myStart.toLocalDate()) == true
                        && (myStart.toLocalDate().until(aDay).getDays() % 7 == 0)) {
                    return (true);
                }
            }
            if (freq == ChronoUnit.MONTHS) {
                if (aDay.isAfter(myStart.toLocalDate()) == true && myStart.toLocalDate().getMonth() != aDay.getMonth()
                        && myStart.toLocalDate().getDayOfMonth() == aDay.getDayOfMonth()) {
                    return (true);
                }
            }
        }
        return (false);
    }

    public ChronoUnit getFrequency() {
        return (freq);
    }

}
