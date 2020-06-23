package ch.module120.fixmylife.domainmodels.EventCategory;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "event_category")
public class EventCategory {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "event_category_id")
    private String eventCategoryId;

    @Column(name = "event_category")
    private String eventCategory;

    public EventCategory() {
    }

    public String getEventCategoryId() {
        return eventCategoryId;
    }

    public EventCategory setEventCategoryId(String eventCategoryId) {
        this.eventCategoryId = eventCategoryId;
        return this;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public EventCategory setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
        return this;
    }
}
