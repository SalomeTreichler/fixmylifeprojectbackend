package ch.module120.fixmylife.domainmodels.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    private EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    // localhost:8080/event  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<Event>> getAll() {
        return new ResponseEntity<>(eventService.getAll(), HttpStatus.OK);
    }

    // localhost:8080/event/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Event> getById(@PathVariable String id) {
        return new ResponseEntity<>(eventService.getById(id), HttpStatus.OK);
    }

    // localhost:8080/event POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<Event> create(@RequestBody Event event) {
        return new ResponseEntity<>(eventService.create(event), HttpStatus.CREATED);
    }

    //localhost:8080/event UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Event> update(@PathVariable String id, @RequestBody Event event){
        return new ResponseEntity<>(eventService.update(id, event), HttpStatus.OK);
    }

    // localhost:8080/event/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(eventService.delete(id), HttpStatus.OK);
    }
}
