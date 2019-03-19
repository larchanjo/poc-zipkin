package recommendation.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.tracing.annotation.NewSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;

@Controller("/recommendations")
public class RecommendationController {

  @Inject
  private CatalogueClient catalogueClient;

  @Inject
  private InventoryClient inventoryClient;

  @Get
  @NewSpan("recommendations")
  public Collection<Book> recommendations() {
    List<Book> result = new ArrayList<>();

    catalogueClient.getBooks().forEach(book -> {
      if (inventoryClient.contains(book.getId())) {
        result.add(book);
      }
    });

    return result;
  }

}
