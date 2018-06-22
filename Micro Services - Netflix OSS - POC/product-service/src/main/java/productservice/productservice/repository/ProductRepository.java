package productservice.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import productservice.productservice.pojo.Product;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Product,String> {
    public Product findById(int id);
    public List<Product> findAll();
}
