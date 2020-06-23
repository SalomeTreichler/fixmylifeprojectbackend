package ch.module120.fixmylife.domainmodels.Activity;

import java.util.List;

public interface ActivityService {
    public List<Activity> getAll();
    public Activity getById(String id);
    public Activity create(Activity activity);
    public Activity update(String id, Activity activity);
    public String delete(String id);
}
