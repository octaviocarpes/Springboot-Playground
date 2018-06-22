package salesservice.salesservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import salesservice.salesservice.pojo.Sale;

@Repository
public interface SaleRepository extends MongoRepository<Sale,String> {
    public Sale findById(int id);
}
