package ch.module120.fixmylife.domainmodels.QuoteCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class QuoteCategoryServiceImpl implements QuoteCategoryService{
    @Autowired
    private QuoteCategoryRepository quoteCategoryRepository;

    @Override
    public List<QuoteCategory> getAll() {
        return quoteCategoryRepository.findAll();
    }

    @Override
    public QuoteCategory getById(String id) {
        return quoteCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public QuoteCategory create(QuoteCategory quoteCategory) {
        quoteCategoryRepository.save(quoteCategory);
        return quoteCategory;
    }

    @Override
    public QuoteCategory update(String id, QuoteCategory quoteCategory) {
        if(quoteCategoryRepository.existsById(id)) {
            quoteCategory.setQuoteCategoryId(id);
            quoteCategoryRepository.save(quoteCategory);

            return quoteCategory;
        } else {
            throw new NoSuchElementException("No value present");
        }
    }

    @Override
    public String delete(String id) {
        quoteCategoryRepository.deleteById(id);
        return "Quote Category has been deleted";
    }
}
