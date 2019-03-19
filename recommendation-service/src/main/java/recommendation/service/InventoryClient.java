package recommendation.service;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client(id = "inventory-service")
public interface InventoryClient {

  @Get("/inventories/{id}")
  Boolean contains(Integer id);

}
