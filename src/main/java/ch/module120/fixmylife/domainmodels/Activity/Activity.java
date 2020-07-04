package ch.module120.fixmylife.domainmodels.Activity;

import ch.module120.fixmylife.domainmodels.EventCategory.EventCategory;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "activity")
public class Activity {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "activity_id")
    private String activityId;

    @Column(name = "activity")
    private String activity;

    @ManyToOne(cascade= CascadeType.MERGE)
    @JoinColumn(name="activity_category")
    private EventCategory activityCategory;

    public Activity() {
    }

    public String getActivityId() {
        return activityId;
    }

    public Activity setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }

    public String getActivity() {
        return activity;
    }

    public Activity setActivity(String activity) {
        this.activity = activity;
        return this;
    }

    public EventCategory getActivityCategory() {
        return activityCategory;
    }

    public Activity setActivityCategory(EventCategory activityCategory) {
        this.activityCategory = activityCategory;
        return this;
    }
}
