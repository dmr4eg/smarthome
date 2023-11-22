package cz.cvut.fel.omo.semestralka;

import java.util.Date;

public class Event {
    Object source;
    Object target;
    Date date;
    String description;

    public Event(Object source, Object target, Date date, String description) {
        this.source = source;
        this.target = target;
        this.date = date;
        this.description = description;
    }
}
