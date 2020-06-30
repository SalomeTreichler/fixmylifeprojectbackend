package ch.module120.fixmylife.domainmodels.Event;

import java.util.List;

public interface EventService {
    public List<Event> getAll();
    public Event getById(String id);
    public Event create(Event event);
    public Event update(String id, Event event);
    public String delete(String id);
}
