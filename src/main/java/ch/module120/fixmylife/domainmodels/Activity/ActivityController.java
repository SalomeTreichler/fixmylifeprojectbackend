package ch.module120.fixmylife.domainmodels.Activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityController {

    private ActivityService activityService;

    @Autowired
    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    // localhost:8080/activities  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<Activity>> getAll() {
        return new ResponseEntity<>(activityService.getAll(), HttpStatus.OK);
    }

    // localhost:8080/activities/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Activity> getById(@PathVariable String id) {
        return new ResponseEntity<>(activityService.getById(id), HttpStatus.OK);
    }

    // localhost:8080/activities POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<Activity> create(@RequestBody Activity activity) {
        return new ResponseEntity<>(activityService.create(activity), HttpStatus.CREATED);
    }

    //localhost:8080/activities UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Activity> update(@PathVariable String id, @RequestBody Activity activity){
        return new ResponseEntity<>(activityService.update(id, activity), HttpStatus.OK);
    }

    // localhost:8080/activities/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(activityService.delete(id), HttpStatus.OK);
    }
}
