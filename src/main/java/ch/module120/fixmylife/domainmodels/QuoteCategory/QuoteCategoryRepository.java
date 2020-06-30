package ch.module120.fixmylife.domainmodels.QuoteCategory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteCategoryRepository extends JpaRepository<QuoteCategory, String> {
}
