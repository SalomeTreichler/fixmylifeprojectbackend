package ch.module120.fixmylife.domainmodels.QuoteCategory;

import java.util.List;

public interface QuoteCategoryService {
    public List<QuoteCategory> getAll();
    public QuoteCategory getById(String id);
    public QuoteCategory create(QuoteCategory QuoteCategory);
    public QuoteCategory update(String id, QuoteCategory QuoteCategory);
    public String delete(String id);
}
