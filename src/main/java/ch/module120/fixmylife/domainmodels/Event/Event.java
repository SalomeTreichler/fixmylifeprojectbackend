package ch.module120.fixmylife.domainmodels.Event;

import ch.module120.fixmylife.domainmodels.EventCategory.EventCategory;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "event_id")
    private String eventId;

    @Column(name = "event_title")
    private String eventTitle;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name="event_category", referencedColumnName = "event_category_id")
    private EventCategory eventCategory;

    @Column(name="event_start")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eventStart;

    @Column(name="event_end")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date eventEnd;

    public Event() {
    }

    public String getEventId() {
        return eventId;
    }

    public Event setEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public Event setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
        return this;
    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public Event setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
        return this;
    }

    public Date getEventStart() {
        return eventStart;
    }

    public Event setEventStart(Date eventStart) {
        this.eventStart = eventStart;
        return this;
    }

    public Date getEventEnd() {
        return eventEnd;
    }

    public Event setEventEnd(Date eventEnd) {
        this.eventEnd = eventEnd;
        return this;
    }
}
