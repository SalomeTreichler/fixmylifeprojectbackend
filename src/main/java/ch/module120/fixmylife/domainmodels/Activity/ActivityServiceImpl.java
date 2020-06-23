package ch.module120.fixmylife.domainmodels.Activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ActivityServiceImpl implements ActivityService{
    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public List<Activity> getAll() {
        return activityRepository.findAll();
    }

    @Override
    public Activity getById(String id) {
        return activityRepository.findById(id).orElse(null);
    }

    @Override
    public Activity create(Activity activity) {
        activityRepository.save(activity);
        return activity;
    }

    @Override
    public Activity update(String id, Activity activity) {
        if(activityRepository.existsById(id)) {
            activity.setActivityId(id);
            activityRepository.save(activity);

            return activity;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public String delete(String id) {
        activityRepository.deleteById(id);
        return "Activity has been deleted";
    }
}
