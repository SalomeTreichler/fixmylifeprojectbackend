package ch.module120.fixmylife.domainmodels.EventCategory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventCategories")
public class EventCategoryController {
    private EventCategoryService eventCategoryService;

    public EventCategoryController(EventCategoryService eventCategoryService) {
        this.eventCategoryService = eventCategoryService;
    }

    // localhost:8080/eventCategories  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<EventCategory>> getAll() {
        return new ResponseEntity<>(eventCategoryService.getAll(), HttpStatus.OK);
    }

    // localhost:8080/eventCategories/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<EventCategory> getById(@PathVariable String id) {
        return new ResponseEntity<>(eventCategoryService.getById(id), HttpStatus.OK);
    }

    // localhost:8080/eventCategories POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<EventCategory> create(@RequestBody EventCategory eventCategory) {
        return new ResponseEntity<>(eventCategoryService.create(eventCategory), HttpStatus.CREATED);
    }

    //localhost:8080/eventCategories UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<EventCategory> update(@PathVariable String id, @RequestBody EventCategory eventCategory){
        return new ResponseEntity<>(eventCategoryService.update(id, eventCategory), HttpStatus.OK);
    }

    // localhost:8080/eventCategories/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(eventCategoryService.delete(id), HttpStatus.OK);
    }
}
