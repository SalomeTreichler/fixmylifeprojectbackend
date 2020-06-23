package ch.module120.fixmylife.domainmodels.Quote;

import ch.module120.fixmylife.domainmodels.QuoteCategory.QuoteCategory;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "quote")
public class Quote {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Generated(GenerationTime.ALWAYS)
    @Column(name = "quote_id")
    private String quoteId;

    @Column(name = "quote")
    private String quote;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinTable(
            name = "quote_category_quote",
            joinColumns = @JoinColumn(name = "quote_id"),
            inverseJoinColumns = @JoinColumn(name = "quote_category_id")
    )
    private Set<QuoteCategory> quoteCategories;

    public Quote() {
    }

    public String getQuoteId() {
        return quoteId;
    }

    public Quote setQuoteId(String quoteId) {
        this.quoteId = quoteId;
        return this;
    }

    public String getQuote() {
        return quote;
    }

    public Quote setQuote(String quote) {
        this.quote = quote;
        return this;
    }

    public Set<QuoteCategory> getQuoteCategories() {
        return quoteCategories;
    }

    public Quote setQuoteCategories(Set<QuoteCategory> quoteCategories) {
        this.quoteCategories = quoteCategories;
        return this;
    }
}
