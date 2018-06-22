package salesservice.salesservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import salesservice.salesservice.pojo.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

    public Product findById(int id);

}
