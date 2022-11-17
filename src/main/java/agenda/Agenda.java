package agenda;

import java.time.LocalDate;
import java.util.*;

public class Agenda {
    ArrayList<Event> total = new ArrayList<Event>();

    public void addEvent(Event e) {
        total.add(e);
    }

    public List<Event> eventsInDay(LocalDate day) {
        ArrayList<Event> L = new ArrayList<Event>();
        for (int k = 0; k <= total.size(); k++) {
            Event v = total.get(k);
            if (v.isInDay(day) == true) {
                L.add(v);
            }
        }
        return (L);
    }
}
