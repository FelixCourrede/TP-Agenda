package agenda;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FixedTerminationEvent extends RepetitiveEvent {
    LocalDate fin;
    long iter;

    public FixedTerminationEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency,
            LocalDate terminationInclusive) {
        super(title, start, duration, frequency);
        fin = terminationInclusive;
        if freq

    }

    public FixedTerminationEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency,
            long numberOfOccurrences) {
        super(title, start, duration, frequency);
        iter = numberOfOccurrences;
    }

    public LocalDate getTerminationDate() {
        return (fin);
    }

    public long getNumberOfOccurrences() {
        return (iter);
    }

}
