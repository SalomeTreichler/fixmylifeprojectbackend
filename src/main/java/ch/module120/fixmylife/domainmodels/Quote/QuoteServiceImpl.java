package ch.module120.fixmylife.domainmodels.Quote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class QuoteServiceImpl implements QuoteService{
    @Autowired
    private QuoteRepository quoteRepository;

    @Override
    public List<Quote> getAll() {
        return quoteRepository.findAll();
    }

    @Override
    public Quote getById(String id) {
        return quoteRepository.findById(id).orElse(null);
    }

    @Override
    public Quote create(Quote Quote) {
        quoteRepository.save(Quote);
        return Quote;
    }

    @Override
    public Quote update(String id, Quote Quote) {
        if(quoteRepository.existsById(id)) {
            Quote.setQuoteId(id);
            quoteRepository.save(Quote);

            return Quote;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public String delete(String id) {
        quoteRepository.deleteById(id);
        return "Quote has been deleted";
    }
}
