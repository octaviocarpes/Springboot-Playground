package salesservice.salesservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import salesservice.salesservice.pojo.Client;
import salesservice.salesservice.pojo.Product;
import salesservice.salesservice.pojo.Sale;
import salesservice.salesservice.repository.ClientRepository;
import salesservice.salesservice.repository.ProductRepository;
import salesservice.salesservice.repository.SaleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalesService {

    @Autowired
    SaleRepository saleRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    ProductRepository productRepository;

    public Sale getSaleById(int id){
        return saleRepository.findById(id);
    }

    public Client getClientById(int id){
        return clientRepository.findById(id);
    }

    public List<Product> getProductsById(List<Integer> products){
        ArrayList<Product> productsId = new ArrayList<>();
        for (Integer id:products) {
            productsId.add(productRepository.findById(id));
        }
        return productsId;
    }

}
