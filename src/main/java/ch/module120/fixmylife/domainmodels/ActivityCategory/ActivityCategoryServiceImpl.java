package ch.module120.fixmylife.domainmodels.ActivityCategory;

import ch.module120.fixmylife.domainmodels.Activity.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ActivityCategoryServiceImpl implements ActivityCategoryService{
    @Autowired
    private ActivityCategoryRepository activtyCategoryRepository;

    @Override
    public List<ActivityCategory> getAll() {
        return activtyCategoryRepository.findAll();
    }

    @Override
    public ActivityCategory getById(String id) {
        return activtyCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public ActivityCategory create(ActivityCategory activityCategory) {
        activtyCategoryRepository.save(activityCategory);
        return activityCategory;
    }

    @Override
    public ActivityCategory update(String id, ActivityCategory activityCategory) {
        if(activtyCategoryRepository.existsById(id)) {
            activityCategory.setActivityCategoryId(id);
            activtyCategoryRepository.save(activityCategory);

            return activityCategory;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public String delete(String id) {
        activtyCategoryRepository.deleteById(id);
        return "Activity Category has been deleted";
    }
}
