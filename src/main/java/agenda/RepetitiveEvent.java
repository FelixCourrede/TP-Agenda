package agenda;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * Description : A repetitive Event
 */
public class RepetitiveEvent extends Event {
    ChronoUnit freq;

    public RepetitiveEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency) {
        super(title, start, duration);
        freq = frequency;
    }

    public void addException(LocalDate date) {

    }

    /**
     *
     * @return the type of repetition
     */
    public ChronoUnit getFrequency() {
        // TODO : implémenter cette méthode
        throw new UnsupportedOperationException("Pas encore implémenté");
    }

}
