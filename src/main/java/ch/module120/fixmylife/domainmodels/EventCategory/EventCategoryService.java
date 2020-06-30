package ch.module120.fixmylife.domainmodels.EventCategory;

import java.util.List;

public interface EventCategoryService {
    public List<EventCategory> getAll();
    public EventCategory getById(String id);
    public EventCategory create(EventCategory eventCategory);
    public EventCategory update(String id, EventCategory eventCategory);
    public String delete(String id);
}
