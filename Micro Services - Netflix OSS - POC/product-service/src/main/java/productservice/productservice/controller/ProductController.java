package productservice.productservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import productservice.productservice.dto.CreateProductRequestDTO;
import productservice.productservice.dto.CreateProductResponseDTO;
import productservice.productservice.pojo.Product;
import productservice.productservice.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping(value = "/health")
    public String getHealth(){
        return "Alive";
    }

    @GetMapping(value = "/product/id")
    public ResponseEntity<Product> getProductbyId(@RequestBody int id){
       return ResponseEntity.ok(service.getProductById(id));
    }

    @GetMapping(value = "/product/all")
    public ResponseEntity<List> getAllProducts(){
        return ResponseEntity.ok(service.getAllProducts());
    }

    @PostMapping(value = "/product/register")
    public ResponseEntity<CreateProductResponseDTO> registerProduct(@RequestBody CreateProductRequestDTO request){
        Product product = service.createProduct(request.getName(), request.getPrice());
        CreateProductResponseDTO response = new CreateProductResponseDTO(product.getName(),product.getPrice());
        return ResponseEntity.ok(response);
    }
}
