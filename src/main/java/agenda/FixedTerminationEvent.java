package agenda;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class FixedTerminationEvent extends RepetitiveEvent {
    LocalDate fin;
    long iter=0;

    public FixedTerminationEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency,
            LocalDate terminationInclusive) {
        super(title, start, duration, frequency);
        fin = terminationInclusive;
    }

    public FixedTerminationEvent(String title, LocalDateTime start, Duration duration, ChronoUnit frequency,
            long numberOfOccurrences) {
        super(title, start, duration, frequency);
        iter = numberOfOccurrences;
    }

    public LocalDate getTerminationDate() {
        if(fin==null){
            if (freq==ChronoUnit.DAYS){
                fin=this.myStart.toLocalDate().plusDays(iter);
            }
            if (freq==ChronoUnit.WEEKS){
                fin=this.myStart.toLocalDate().plusWeeks(iter);
            }
            if (freq==ChronoUnit.MONTHS){
                fin=this.myStart.toLocalDate().plusMonths(iter);
            }
        }
        
        return (fin);
    }

    public long getNumberOfOccurrences() {
        if (iter==0){
            if (freq==ChronoUnit.DAYS){
                iter=ChronoUnit.DAYS.between(this.myStart.toLocalDate(),fin)+1;
            }
            if (freq==ChronoUnit.WEEKS){
                iter=ChronoUnit.WEEKS.between(this.myStart.toLocalDate(),fin)+1;
            }
            if (freq==ChronoUnit.MONTHS){
                iter=ChronoUnit.MONTHS.between(this.myStart.toLocalDate(),fin)+1;
            }

        }
        return (iter);
    }

}
