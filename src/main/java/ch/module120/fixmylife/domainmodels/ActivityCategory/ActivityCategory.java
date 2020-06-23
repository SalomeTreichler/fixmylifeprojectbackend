package ch.module120.fixmylife.domainmodels.ActivityCategory;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "activity_category")
public class ActivityCategory {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "activity_category_id")
    private String activityCategoryId;

    @Column(name = "activity_category")
    private String activityCategory;

    public ActivityCategory() {
    }

    public String getActivityCategoryId() {
        return activityCategoryId;
    }

    public ActivityCategory setActivityCategoryId(String activityCategoryId) {
        this.activityCategoryId = activityCategoryId;
        return this;
    }

    public String getActivityCategory() {
        return activityCategory;
    }

    public ActivityCategory setActivityCategory(String activityCategory) {
        this.activityCategory = activityCategory;
        return this;
    }
}
