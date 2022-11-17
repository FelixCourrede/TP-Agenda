package agenda;

import java.time.LocalDate;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {
    ArrayList<Event> total = new ArrayList<Event>();

    public void addEvent(Event e) {
        total.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        ArrayList L = new ArrayList<Event>();
        for (int k = 0; k <= total.size(); k++) {
            Event v = total.get(k);
            if (v.isInDay(day)) {

            }
        }
    }
}
