package ch.module120.fixmylife.domainmodels.QuoteCategory;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "quote_category")
public class QuoteCategory {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "quote_category_id")
    private String quoteCategoryId;

    @Column(name = "quote_category")
    private String quoteCategory;

    public QuoteCategory() {
    }

    public String getQuoteCategoryId() {
        return quoteCategoryId;
    }

    public QuoteCategory setQuoteCategoryId(String quoteCategoryId) {
        this.quoteCategoryId = quoteCategoryId;
        return this;
    }

    public String getQuoteCategory() {
        return quoteCategory;
    }

    public QuoteCategory setQuoteCategory(String quoteCategory) {
        this.quoteCategory = quoteCategory;
        return this;
    }
}
