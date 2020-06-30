package ch.module120.fixmylife.domainmodels.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EventServiceImpl implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public List<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public Event getById(String id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public Event create(Event event) {
        eventRepository.save(event);
        return event;
    }

    @Override
    public Event update(String id, Event event) {
        if(eventRepository.existsById(id)) {
            event.setEventId(id);
            eventRepository.save(event);

            return event;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public String delete(String id) {
        eventRepository.deleteById(id);
        return "Event has been deleted";
    }
}
