package recommendation.service;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import java.util.Collection;

@Client(id = "catalogue-service")
public interface CatalogueClient {

  @Get("/books")
  Collection<Book> getBooks();

}