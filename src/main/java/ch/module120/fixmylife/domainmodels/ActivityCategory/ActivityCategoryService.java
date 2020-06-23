package ch.module120.fixmylife.domainmodels.ActivityCategory;

import java.util.List;

public interface ActivityCategoryService {
    public List<ActivityCategory> getAll();
    public ActivityCategory getById(String id);
    public ActivityCategory create(ActivityCategory activityCategory);
    public ActivityCategory update(String id, ActivityCategory activityCategory);
    public String delete(String id);
}
