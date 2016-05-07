package co.dmecham.timetracker.model;


import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by david on 5/2/2016.
 */
public class TimeEntry {
    private Person Consultant;
    private LocalDateTime date;
    private Duration timeLogged;
    private String notes;

    public Person getConsultant() {
        return Consultant;
    }

    public void setConsultant(Person consultant) {
        Consultant = consultant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Duration getTimeLogged() {
        return timeLogged;
    }

    public void setTimeLogged(Duration timeLogged) {
        this.timeLogged = timeLogged;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
