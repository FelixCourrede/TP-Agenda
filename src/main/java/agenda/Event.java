package agenda;

import java.time.*;

public class Event {

    protected String myTitle;

    protected LocalDateTime myStart;

    protected Duration myDuration;

    public Event(String title, LocalDateTime start, Duration duration) {
        this.myTitle = title;
        this.myStart = start;
        this.myDuration = duration;
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
        }
        return (false);
    }

    public String getTitle() {
        return myTitle;
    }

    public LocalDateTime getStart() {
        return myStart;
    }

    public Duration getDuration() {
        return myDuration;
    }

    public String toString() {
        return (myTitle);
    }

}