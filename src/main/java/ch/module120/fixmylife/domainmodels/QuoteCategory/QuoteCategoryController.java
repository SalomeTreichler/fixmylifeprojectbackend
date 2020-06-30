package ch.module120.fixmylife.domainmodels.QuoteCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quoteCategories")
public class QuoteCategoryController {
    private QuoteCategoryService quoteCategoryService;

    @Autowired
    public QuoteCategoryController(QuoteCategoryService QuoteCategoryService) {
        this.quoteCategoryService = QuoteCategoryService;
    }

    // localhost:8080/quoteCategories  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<QuoteCategory>> getAll() {
        return new ResponseEntity<>(quoteCategoryService.getAll(), HttpStatus.OK);
    }

    // localhost:8080/quoteCategories/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<QuoteCategory> getById(@PathVariable String id) {
        return new ResponseEntity<>(quoteCategoryService.getById(id), HttpStatus.OK);
    }

    // localhost:8080/quoteCategories POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<QuoteCategory> create(@RequestBody QuoteCategory quoteCategory) {
        return new ResponseEntity<>(quoteCategoryService.create(quoteCategory), HttpStatus.CREATED);
    }

    //localhost:8080/quoteCategories UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<QuoteCategory> update(@PathVariable String id, @RequestBody QuoteCategory quoteCategory){
        return new ResponseEntity<>(quoteCategoryService.update(id, quoteCategory), HttpStatus.OK);
    }

    // localhost:8080/quoteCategories/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(quoteCategoryService.delete(id), HttpStatus.OK);
    }
}
