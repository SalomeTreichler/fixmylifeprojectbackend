package ch.module120.fixmylife.domainmodels.EventCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EventCategoryServiceImpl implements EventCategoryService{

    @Autowired
    private EventCategoryRepository eventCategoryRepository;

    @Override
    public List<EventCategory> getAll() {
        return eventCategoryRepository.findAll();
    }

    @Override
    public EventCategory getById(String id) {
        return eventCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public EventCategory create(EventCategory eventCategory) {
        eventCategoryRepository.save(eventCategory);
        return eventCategory;
    }

    @Override
    public EventCategory update(String id, EventCategory eventCategory) {
        if(eventCategoryRepository.existsById(id)) {
            eventCategory.setEventCategoryId(id);
            eventCategoryRepository.save(eventCategory);

            return eventCategory;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public String delete(String id) {
        eventCategoryRepository.deleteById(id);
        return "EventCategory has been deleted";
    }
}
