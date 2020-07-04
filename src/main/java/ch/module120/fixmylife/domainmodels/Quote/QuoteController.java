package ch.module120.fixmylife.domainmodels.Quote;

import ch.module120.fixmylife.domainmodels.Quote.Quote;
import ch.module120.fixmylife.domainmodels.Quote.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quote")
public class QuoteController {
    private QuoteService quoteService;

    @Autowired
    public QuoteController(QuoteService QuoteService) {
        this.quoteService = QuoteService;
    }

    // localhost:8080/quote  GET
    @GetMapping("")
    public @ResponseBody
    ResponseEntity<List<Quote>> getAll() {
        return new ResponseEntity<>(quoteService.getAll(), HttpStatus.OK);
    }

    // localhost:8080/quote/{id} GET
    @GetMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Quote> getById(@PathVariable String id) {
        return new ResponseEntity<>(quoteService.getById(id), HttpStatus.OK);
    }

    // localhost:8080/quote POST
    @PostMapping("")
    public @ResponseBody
    ResponseEntity<Quote> create(@RequestBody Quote quote) {
        return new ResponseEntity<>(quoteService.create(quote), HttpStatus.CREATED);
    }

    //localhost:8080/quote UPDATE
    @PutMapping("/{id}")
    public @ResponseBody
    ResponseEntity<Quote> update(@PathVariable String id, @RequestBody Quote quote){
        return new ResponseEntity<>(quoteService.update(id, quote), HttpStatus.OK);
    }

    // localhost:8080/quote/{id} DELETE
    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity<String> delete(@PathVariable String id){
        return new ResponseEntity<String>(quoteService.delete(id), HttpStatus.OK);
    }
}
