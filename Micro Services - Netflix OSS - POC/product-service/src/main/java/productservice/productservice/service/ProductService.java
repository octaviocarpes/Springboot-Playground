package productservice.productservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import productservice.productservice.pojo.Product;
import productservice.productservice.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repository;

    public Product getProductById(int id) {
        return repository.findById(id);
    }


    public List<Product> getAllProducts(){
        return repository.findAll();
    }

    public Product createProduct(String name, double price){
        Product product = new Product(name,price);
        repository.save(product);
        return product;
    }
}
