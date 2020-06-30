package ch.module120.fixmylife.domainmodels.ActivityCategory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activityCategories")
public class ActivityCategoryController {
    private ActivityCategoryService activityCategoryService;

    @Autowired
    public ActivityCategoryController(ActivityCategoryService activityCategoryService) {
        this.activityCategoryService = activityCategoryService;
    }

    // localhost:8080/activityCategories  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<ActivityCategory>> getAll() {
        return new ResponseEntity<>(activityCategoryService.getAll(), HttpStatus.OK);
    }

    // localhost:8080/activityCategories/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<ActivityCategory> getById(@PathVariable String id) {
        return new ResponseEntity<>(activityCategoryService.getById(id), HttpStatus.OK);
    }

    // localhost:8080/activityCategories POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<ActivityCategory> create(@RequestBody ActivityCategory activityCategory) {
        return new ResponseEntity<>(activityCategoryService.create(activityCategory), HttpStatus.CREATED);
    }

    //localhost:8080/activityCategories UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<ActivityCategory> update(@PathVariable String id, @RequestBody ActivityCategory activityCategory){
        return new ResponseEntity<>(activityCategoryService.update(id, activityCategory), HttpStatus.OK);
    }

    // localhost:8080/activityCategories/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(activityCategoryService.delete(id), HttpStatus.OK);
    }
}
