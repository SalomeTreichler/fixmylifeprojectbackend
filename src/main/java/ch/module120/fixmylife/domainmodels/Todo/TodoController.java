package ch.module120.fixmylife.domainmodels.Todo;

import ch.module120.fixmylife.domainmodels.Todo.Todo;
import ch.module120.fixmylife.domainmodels.Todo.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    // localhost:8080/quoteCategories  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<Todo>> getAll() {
        return new ResponseEntity<>(todoService.getAll(), HttpStatus.OK);
    }

    // localhost:8080/quoteCategories/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Todo> getById(@PathVariable String id) {
        return new ResponseEntity<>(todoService.getById(id), HttpStatus.OK);
    }

    // localhost:8080/quoteCategories POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<Todo> create(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.create(todo), HttpStatus.CREATED);
    }

    // localhost:8080/quoteCategories/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(todoService.delete(id), HttpStatus.OK);
    }
}
