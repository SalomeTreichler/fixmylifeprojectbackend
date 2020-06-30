package ch.module120.fixmylife.domainmodels.Quote;

import java.util.List;

public interface QuoteService {
    public List<Quote> getAll();
    public Quote getById(String id);
    public Quote create(Quote Quote);
    public Quote update(String id, Quote Quote);
    public String delete(String id);
}
