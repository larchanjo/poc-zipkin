package catalogue.service;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.tracing.annotation.ContinueSpan;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;

@Controller("/books")
public class BookController {

  @Get
  @ContinueSpan
  public Collection<Book> books() {
    return Arrays.asList(
        new Book(1, UUID.randomUUID().toString()),
        new Book(2, UUID.randomUUID().toString()),
        new Book(3, UUID.randomUUID().toString()),
        new Book(4, UUID.randomUUID().toString()),
        new Book(5, UUID.randomUUID().toString()),
        new Book(6, UUID.randomUUID().toString()),
        new Book(7, UUID.randomUUID().toString()),
        new Book(8, UUID.randomUUID().toString()),
        new Book(9, UUID.randomUUID().toString()),
        new Book(10, UUID.randomUUID().toString())
    );
  }

}